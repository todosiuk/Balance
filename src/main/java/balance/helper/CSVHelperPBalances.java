package balance.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import balance.entity.PBalances;

/**This class reads file with data from Potamus
 * and divides them by the sign ";" */

public class CSVHelperPBalances {

	public static List<PBalances> readPBalances(String fileName) {
		try {
			List<PBalances> listPBalances = new ArrayList<PBalances>();
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				PBalances pBalances = new PBalances();
				String[] strPBalances = line.trim().split(";");
				pBalances.setpArticle(strPBalances[0].trim());
				pBalances.setpTitleArticle(strPBalances[1].trim());
				pBalances.setpQuantity(Double.parseDouble(strPBalances[2].trim()));
				listPBalances.add(pBalances);
			}
			bufferedReader.close();
			return listPBalances;
		} catch (Exception e) {
			return null;
		}
	}
}
