<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Müsterilerin Bilgileri</title>
</head>

<body>
   <s:form action="olay" method="get">
      <s:textfield name="isim" label="isminiz" size="20" />
      <s:textfield name="yas" label="yasiniz" size="20" />
      <s:submit name="submit" value="Bilgileri Gonder" align="center" />
   </s:form>
</body>
</html>