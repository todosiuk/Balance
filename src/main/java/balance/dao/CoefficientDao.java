package balance.dao;

import java.util.List;
import balance.entity.Coefficient;

public interface CoefficientDao {

	public void save(Coefficient entity);

	public List<Coefficient> read();

}
