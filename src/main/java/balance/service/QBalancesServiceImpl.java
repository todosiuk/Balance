package balance.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import balance.dao.CoefficientDaoImpl;
import balance.dao.QBalancesDaoImpl;
import balance.entity.Coefficient;
import balance.entity.QBalances;
import balance.entity.QBalancesSquareMeters;

@Service("qBalancesService")
@Transactional
public class QBalancesServiceImpl implements QBalancesService {

	@Autowired
	private CoefficientDaoImpl coefficientDao;

	@Autowired
	private QBalancesDaoImpl qBalancesDao;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List countingPiecesInSquareMeters() {

		List<QBalances> qBalancesList = this.getQBalancesList();
		List<Coefficient> coefficientList = this.getCoefficientsList();
		List<QBalancesSquareMeters> list = new ArrayList<QBalancesSquareMeters>();

		for (Coefficient coefficient : coefficientList) {
			for (QBalances qbalances : qBalancesList) {
				if (coefficient.getArticle().equals(qbalances.getqArticle())) {
					QBalancesSquareMeters squareMeters = new QBalancesSquareMeters();
					squareMeters.setArticle(qbalances.getqArticle());
					squareMeters.setTitleArticle(qbalances.getqTitleArticle());
					squareMeters.setSquareMeters(qbalances.getqQuantity() * coefficient.getCoef());
					list.add(squareMeters);
				}
			}
		}
		return list;
	}

	public List<Coefficient> getCoefficientsList() {
		List<Coefficient> coefficientList = coefficientDao.read();
		return coefficientList;
	}

	public List<QBalances> getQBalancesList() {
		List<QBalances> qBalancesList = qBalancesDao.read();
		return qBalancesList;
	}

}
