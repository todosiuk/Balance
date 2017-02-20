package balance.dao.test;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import balance.dao.PBalancesDaoImpl;
import balance.entity.PBalances;

@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class PBalancesDaoImplTest {

	@Autowired
	private PBalancesDaoImpl dao;

	@Test
	@Transactional
	public void testCreateAndReadCoefficient() {
		PBalances pBalances = new PBalances();
		pBalances.setpArticle("60205520");
		pBalances.setpTitleArticle("Roveze");
		pBalances.setpQuantity(236.2);
		dao.save(pBalances);
		List<PBalances> list = dao.read();
		Assert.assertEquals("60205520", list.get(0).getpArticle());
		Assert.assertEquals("Roveze", list.get(0).getpTitleArticle());
		Assert.assertEquals(236.2, list.get(0).getpQuantity(), 0);
	}
}
