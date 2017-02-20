<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Import CSV</title>
</head>
<body>
	<s:form method="post" commandName="csvFileCoefficient"
		action="/coefficientController/importCoefficient"
		enctype="multipart/form-data">
${error }
Выберите файл "Coefficients".
<input type="file" name="file">
		<br>
		<input type="submit" value="import">
	</s:form>
</body>
</html>