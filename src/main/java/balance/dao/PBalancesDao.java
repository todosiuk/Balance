package balance.dao;

import java.util.List;

import balance.entity.PBalances;

public interface PBalancesDao {

	public void save(PBalances entity);

	public List<PBalances> read();

}
