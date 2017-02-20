package balance.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import balance.entity.QBalances;

@Repository
@Transactional
public class QBalancesDaoImpl implements QBalancesDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void save(QBalances entity) {
		manager.persist(entity);
	}

	@Override
	public List<QBalances> read() {
		String sqlQuery = "FROM QBalances";
		TypedQuery<QBalances> query = manager.createQuery(sqlQuery, QBalances.class);
		return query.getResultList();
	}
}
