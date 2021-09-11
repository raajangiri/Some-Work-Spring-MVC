<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>

User:${userReg.name }<br/>
UserName:${userReg.userName}<br/>
Password:${userReg.password}<br/>
Country:${userReg.countryName}<br/>

<c:forEach var= "temp" items="${userReg.hobbies }">
 Hobbies:${temp }
</c:forEach>
Gender:${userReg.gender}<br/>
Age:${userReg.age}<br/>

email:${userReg.communicationDTO.email}<br/>
phone:${userReg.communicationDTO.phone}<br/>



</body>
</html>