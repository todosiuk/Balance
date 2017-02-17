package balance.helper;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

public class UploadFileHelper {

	public static File upload(MultipartFile file, HttpServletRequest request, boolean encrypt_file_name,
			String upload_folder) {
		String fileName = null;
		File serverFile = null;
		try {
			if (!file.isEmpty()) {
				@SuppressWarnings("deprecation")
				String applicationPath = request.getRealPath("");
				if (encrypt_file_name) {
					String currentFileName = file.getOriginalFilename();
					String extension = currentFileName.substring(currentFileName.lastIndexOf("."),
							currentFileName.length());
					Long nameRadom = Calendar.getInstance().getTimeInMillis();
					String newFileName = nameRadom + extension;
					fileName = newFileName;
				} else
					fileName = file.getOriginalFilename();
				byte[] bytes = file.getBytes();
				String rootPath = applicationPath;
				File dir = new File(rootPath + File.separator + upload_folder);

				if (!dir.exists())
					dir.mkdirs();
				serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				return serverFile;
			} else {
				serverFile = null;
			}
		} catch (Exception e) {
			serverFile = null;
		}
		return serverFile;
	}

	public static List<String> multipleFileUpload(List<MultipartFile> files, HttpServletRequest request,
			boolean encrypt_file_name, String upload_folder) {
		List<String> fileNames = new ArrayList<String>();
		try {
			if (files.size() != 0) {
				BufferedOutputStream stream = null;
				@SuppressWarnings("deprecation")
				String applicationPath = request.getRealPath("");
				for (MultipartFile file : files) {
					String fileName = "";
					if (encrypt_file_name) {
						String currentFileName = file.getOriginalFilename();
						String extension = currentFileName.substring(currentFileName.lastIndexOf("."),
								currentFileName.length());
						Long nameRadom = Calendar.getInstance().getTimeInMillis();
						String newFileName = nameRadom + extension;
						fileName = newFileName;
					} else
						fileName = file.getOriginalFilename();
					byte[] bytes = file.getBytes();
					String rootPath = applicationPath;
					File dir = new File(rootPath + File.separator + upload_folder);

					if (!dir.exists())
						dir.mkdirs();
					File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);
					stream = new BufferedOutputStream(new FileOutputStream(serverFile));
					stream.write(bytes);
					System.out.println(fileName);
					fileNames.add(fileName);
				}
				stream.close();
			} else {
				fileNames = null;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			fileNames = null;
		}
		return fileNames;
	}
}
