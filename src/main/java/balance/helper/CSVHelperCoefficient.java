package balance.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import balance.entity.Coefficient;

public class CSVHelperCoefficient {

	public static List<Coefficient> readCoefficient(String fileName) {
		try {
			List<Coefficient> coefficients = new ArrayList<Coefficient>();
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				Coefficient coefficient = new Coefficient();
				String[] strCoefficient = line.trim().split(";");
				coefficient.setArticle(strCoefficient[0].trim());
				coefficient.setTitleArticle(strCoefficient[1].trim());
				coefficient.setCoef(Double.parseDouble(strCoefficient[2].trim()));
				coefficients.add(coefficient);
			}
			bufferedReader.close();
			return coefficients;
		} catch (Exception e) {
			return null;
		}
	}

}
