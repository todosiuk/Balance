package balance.service;

import java.util.List;

import balance.entity.Coefficient;
import balance.entity.QBalances;
import balance.entity.QBalancesSquareMeters;

public interface QBalancesService {

	public List<QBalancesSquareMeters> countingPiecesInSquareMeters();
}
