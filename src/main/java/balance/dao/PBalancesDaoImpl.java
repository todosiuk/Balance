package balance.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import balance.entity.PBalances;

@Repository
@Transactional
public class PBalancesDaoImpl implements PBalancesDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void save(PBalances entity) {
		manager.persist(entity);
	}

	@Override
	public List<PBalances> read() {
		String sqlQuery = "FROM PBalances";
		TypedQuery<PBalances> query = manager.createQuery(sqlQuery, PBalances.class);
		return query.getResultList();
	}
}
