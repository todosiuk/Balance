package balance.controller;

import java.io.File;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import balance.entity.CSVFile;
import balance.entity.Coefficient;
import balance.helper.CSVHelperCoefficient;
import balance.helper.UploadFileHelper;

@Controller
@RequestMapping("/coefficientController")
public class CoefficientController {

	@RequestMapping(value = "/importCoefficient", method = RequestMethod.GET)
	public String importCoefficient(ModelMap modelMap) {
		modelMap.put("csvFileCoefficient", new CSVFile());
		return "index";
	}

	@RequestMapping(value = "/importingCoefficient", method = RequestMethod.POST)
	public String importingCoefficient(@ModelAttribute("csvFileCoefficient") CSVFile csvFile, ModelMap modelMap, HttpServletRequest request) {

		try{
			ProductModel pm = new ProductModel();
			Coefficient coefficientModel = new Coefficient();
			File file = UploadFileHelper.upload(csvFile.getFile(), request, true, "files");
			List<Coefficient>listCoefficients = CSVHelperCoefficient.readCoefficient(file.getAbsolutePath());
			for(Coefficient coefficient:listCoefficients){
				coefficientModel
			}
		}
	}

}
