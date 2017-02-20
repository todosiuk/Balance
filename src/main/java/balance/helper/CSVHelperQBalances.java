package balance.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import balance.entity.QBalances;

/**
 * This class reads file with data from Qguar and divides them by the sign ";"
 */
public class CSVHelperQBalances {

	public static List<QBalances> readQBalances(String fileName) {
		try {
			List<QBalances> listQBalances = new ArrayList<QBalances>();
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				QBalances qBalances = new QBalances();
				String[] strQBalances = line.trim().split(";");
				qBalances.setqArticle(strQBalances[0].trim());
				qBalances.setqTitleArticle(strQBalances[1].trim());
				qBalances.setqQuantity(Double.parseDouble(strQBalances[3].trim()));
				listQBalances.add(qBalances);
			}
			bufferedReader.close();
			return listQBalances;
		} catch (Exception e) {
			return null;
		}
	}
}