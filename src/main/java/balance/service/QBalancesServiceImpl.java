package balance.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import balance.dao.CoefficientDaoImpl;
import balance.dao.QBalancesDaoImpl;
import balance.entity.Coefficient;
import balance.entity.QBalances;

@Service("qBalancesService")
@Transactional
public class QBalancesServiceImpl implements QBalancesService{

	@Autowired
	private CoefficientDaoImpl coefficientDao;

	@Autowired
	private QBalancesDaoImpl qBalancesDao;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List listOfSqueraMeters() {
		
		List<Coefficient> coefficientList = coefficientDao.read();
		List<QBalances> qBalancesList = qBalancesDao.read();
		
	}
				
	

}
