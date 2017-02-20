package balance.dao;

import java.util.List;
import balance.entity.QBalances;

public interface QBalancesDao {

	public void save(QBalances entity);

	public List<QBalances> read();
}
