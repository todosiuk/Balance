package balance.service.test;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import balance.dao.CoefficientDaoImpl;
import balance.dao.PBalancesDaoImpl;
import balance.dao.QBalancesDaoImpl;
import balance.entity.Balance;
import balance.entity.Coefficient;
import balance.entity.PBalances;
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

	@Autowired
	private PBalancesDaoImpl pBalancesDao;

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
		// Assert.assertEquals(0, squareMeters.get(1).getSquareMeters(), 0);
	}

	@Test
	@Transactional
	public void testBalance() {
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

		PBalances pBalances = new PBalances();
		pBalances.setpArticle("60225485");
		pBalances.setpTitleArticle("Bianko");
		pBalances.setpQuantity(26.5);
		pBalancesDao.save(pBalances);
		PBalances pBalances1 = new PBalances();
		pBalances1.setpArticle("60225482");
		pBalances1.setpTitleArticle("Bianko25");
		pBalances1.setpQuantity(126.4);
		pBalancesDao.save(pBalances1);

		List<Balance> balance = service.balance();

		Assert.assertEquals("60225485", balance.get(1).getArticle());
		Assert.assertEquals(0.124, balance.get(1).getCoefficient(), 0);
		Assert.assertEquals(0.0, balance.get(0).getDifferenceQP(), 0);
		Assert.assertEquals(13.18, balance.get(1).getDifferenceQP(), 0);

	}
}
