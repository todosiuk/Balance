package balance.dao.test;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import balance.dao.QBalancesDaoImpl;
import balance.entity.QBalances;

@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class QBalanceDaoImplTest {

	@Autowired
	private QBalancesDaoImpl dao;

	@Test
	@Transactional
	public void testCreateAndReadCoefficient() {
		QBalances qBalances = new QBalances();
		qBalances.setqArticle("60205520");
		qBalances.setqTitleArticle("Roveze");
		qBalances.setqQuantity(236.2);
		dao.save(qBalances);
		List<QBalances> list = dao.read();
		Assert.assertEquals("60205520", list.get(0).getqArticle());
		Assert.assertEquals("Roveze", list.get(0).getqTitleArticle());
		Assert.assertEquals(236.2, list.get(0).getqQuantity(), 0);
	}
}
