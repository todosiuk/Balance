package balance.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import balance.entity.Coefficient;

@Repository
@Transactional
public class CoefficientDaoImpl implements CoefficientDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void save(Coefficient entity) {
		manager.persist(entity);
	}
	@Override
	public List<Coefficient> read() {
		String sqlQuery = "FROM Coefficient";
		TypedQuery<Coefficient> query = manager.createQuery(sqlQuery, Coefficient.class);
		return query.getResultList();
	}
}
