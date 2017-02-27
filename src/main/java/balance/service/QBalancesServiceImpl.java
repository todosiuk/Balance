package balance.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import balance.dao.CoefficientDaoImpl;
import balance.dao.PBalancesDaoImpl;
import balance.dao.QBalancesDaoImpl;
import balance.entity.Balance;
import balance.entity.Coefficient;
import balance.entity.PBalances;
import balance.entity.QBalances;
import balance.entity.QBalancesSquareMeters;

@Service("qBalancesService")
@Transactional
public class QBalancesServiceImpl implements QBalancesService {

	@Autowired
	private CoefficientDaoImpl coefficientDao;

	@Autowired
	private QBalancesDaoImpl qBalancesDao;

	@Autowired
	private PBalancesDaoImpl pBalancesDao;

	@Override
	public List<QBalancesSquareMeters> countingPiecesInSquareMeters() {

		List<QBalances> qBalancesList = this.getQBalancesList();
		List<Coefficient> coefficientList = this.getCoefficientsList();
		List<QBalancesSquareMeters> list = new ArrayList<QBalancesSquareMeters>();
		QBalancesSquareMeters squareMeters = null;
		for (QBalances qbalances : qBalancesList) {
			for (Coefficient coefficient : coefficientList) {
				if (qbalances.getqArticle().equals(coefficient.getArticle())) {
					squareMeters = new QBalancesSquareMeters();
					squareMeters.setArticle(qbalances.getqArticle());
					squareMeters.setTitleArticle(qbalances.getqTitleArticle());
					squareMeters.setPieces(qbalances.getqQuantity());
					squareMeters.setCoefficient(coefficient.getCoef());
					squareMeters.setSquareMeters(qbalances.getqQuantity() * coefficient.getCoef());
					list.add(squareMeters);
					break;
				}
			}
			if (squareMeters != null) {
				break;
			}

			if (squareMeters == null) {
				squareMeters = new QBalancesSquareMeters();
				squareMeters.setArticle(qbalances.getqArticle());
				squareMeters.setTitleArticle(qbalances.getqTitleArticle());
				squareMeters.setPieces(qbalances.getqQuantity());
				squareMeters.setCoefficient(0.0);
				squareMeters.setSquareMeters(0.0);
				list.add(squareMeters);
			}
		}
		return list;
	}

	public List<Balance> balance() {
		List<QBalancesSquareMeters> qSquareMetersList = this.countingPiecesInSquareMeters();
		List<PBalances> pBalancesList = this.getPBalancesList();
		List<Balance> balanceList = new ArrayList<Balance>();
		Balance balance = null;
		for (QBalancesSquareMeters qBalancesSquareMeters : qSquareMetersList) {
			for (PBalances pBalances : pBalancesList) {
				if (qBalancesSquareMeters.getArticle().equals(pBalances.getpArticle())) {
					balance = new Balance();
					balance.setArticle(qBalancesSquareMeters.getArticle());
					balance.setTitleArticle(qBalancesSquareMeters.getTitleArticle());
					balance.setPieces(qBalancesSquareMeters.getPieces());
					balance.setCoefficient(qBalancesSquareMeters.getCoefficient());
					balance.setSquareMetersQ(qBalancesSquareMeters.getSquareMeters());
					balance.setSquareMetersP(pBalances.getpQuantity());
					balance.setDifferenceQP(qBalancesSquareMeters.getSquareMeters() - pBalances.getpQuantity());
					balanceList.add(balance);
					break;
				}
			}
			if (balance != null) {
				break;
			}
			if (balance == null) {
				balance = new Balance();
				balance.setArticle(qBalancesSquareMeters.getArticle());
				balance.setTitleArticle(qBalancesSquareMeters.getTitleArticle());
				balance.setPieces(qBalancesSquareMeters.getPieces());
				balance.setCoefficient(qBalancesSquareMeters.getCoefficient());
				balance.setSquareMetersQ(qBalancesSquareMeters.getSquareMeters());
				balance.setSquareMetersP(0.0);
				balance.setDifferenceQP(0.0);
				balanceList.add(balance);
			}
		}
		return balanceList;
	}

	public List<Coefficient> getCoefficientsList() {
		List<Coefficient> coefficientList = coefficientDao.read();
		return coefficientList;
	}

	public List<QBalances> getQBalancesList() {
		List<QBalances> qBalancesList = qBalancesDao.read();
		return qBalancesList;
	}

	public List<PBalances> getPBalancesList() {
		List<PBalances> pBalancesList = pBalancesDao.read();
		return pBalancesList;
	}

}
