package balance.service.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import balance.dao.CoefficientDaoImpl;
import balance.dao.QBalancesDaoImpl;
import balance.entity.Coefficient;
import balance.entity.QBalances;
import balance.entity.QBalancesSquareMeters;
import balance.service.QBalancesServiceImpl;

@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class QBalancesServiceImplTest {

	@Autowired
	private QBalancesDaoImpl qBalancesdao;

	@Autowired
	private CoefficientDaoImpl coefficientDao;

	@Autowired
	private QBalancesServiceImpl service;

	@Test
	@Transactional
	public void testCountingPiecesInSquareMeters() {

		Coefficient coefficient = new Coefficient();
		coefficient.setArticle("60225488");
		coefficient.setTitleArticle("Roveze");
		coefficient.setCoef(0.547);
		coefficientDao.save(coefficient);
		Coefficient coefficient1 = new Coefficient();
		coefficient1.setArticle("60225485");
		coefficient1.setTitleArticle("Bianko");
		coefficient1.setCoef(0.124);
		coefficientDao.save(coefficient1);

		QBalances qBalances = new QBalances();
		qBalances.setqArticle("60225487");
		qBalances.setqTitleArticle("Roveze");
		qBalances.setqQuantity(256);
		qBalancesdao.save(qBalances);
		QBalances qBalances1 = new QBalances();
		qBalances1.setqArticle("60225485");
		qBalances1.setqTitleArticle("Bianko");
		qBalances1.setqQuantity(320);
		qBalancesdao.save(qBalances1);

		List<QBalancesSquareMeters> squareMeters = service.countingPiecesInSquareMeters();

		Assert.assertEquals("60225485", squareMeters.get(1).getArticle());
		Assert.assertEquals(39.68, squareMeters.get(1).getSquareMeters(), 0);
		//Assert.assertEquals(0, squareMeters.get(1).getSquareMeters(), 0);
	}
}
