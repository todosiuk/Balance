package balance.dao.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import balance.dao.CoefficientDaoImpl;
import balance.entity.Coefficient;
import org.junit.Assert;
import org.junit.Test;

@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class CoefficientDaoImplTest {

	@Autowired
	private CoefficientDaoImpl dao;

	@Test
	@Transactional
	public void testCreateAndReadCoefficient() {
		Coefficient coefficient = new Coefficient();
		coefficient.setArticle("60205520");
		coefficient.setTitleArticle("Roveze");
		coefficient.setCoef(0.256);
		dao.save(coefficient);
		List<Coefficient> list = dao.read();
		Assert.assertEquals("60205520", list.get(0).getArticle());
		Assert.assertEquals("Roveze", list.get(0).getTitleArticle());
		Assert.assertEquals(0.256, list.get(0).getCoef(), 0);
	}
}
