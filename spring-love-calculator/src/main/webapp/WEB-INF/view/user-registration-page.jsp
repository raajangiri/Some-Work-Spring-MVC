<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<style type="text/css">

.error{
color: red;
position:fixed;
text-align: left;
margin:30px;
}
</style>

</head>
<body>



	<h1 align="center">Please Register Here</h1>
	<hr>
	<div align="center">
		<form:form action="registration-success" method="GET"
			modelAttribute="userReg">
			<label>User:</label>
			<form:input path="name" />
			<br />

			<label>User Name:</label>
			<form:input path="userName" />

			<br />

			<label>Password</label>
			<form:password path="password" />
			<br />

			<label>Country</label>
			<form:select path="countryName">
				<form:option value="Nep" label="Nepal"></form:option>
				<form:option value="Ind" label="India"></form:option>
				<form:option value="Usa" label="UnitedStates"></form:option>
			</form:select>
			<br />

			<label>Hobbies:</label>
     Cricket:<form:checkbox path="hobbies" value="cricket" />
     Reading:<form:checkbox path="hobbies" value="reading" />
     Travel:<form:checkbox path="hobbies" value="travel" />
     Programming:<form:checkbox path="hobbies" value="programming" />
			<br />

			<label>Gender :</label>
  Male:<form:radiobutton path="gender" value="male" />
  Female:<form:radiobutton path="gender" value="female" />
Age:<form:input path="age" />
	<form:errors path="age" cssClass="error" />

			<br />
			<input type="submit" value="registration">

			<div align="center">
				<h1>Communication Link</h1>
				<label>email</label>
				<form:input path="communicationDTO.email" />
				<label>phone</label>
				<form:input path="communicationDTO.phone" />
		</form:form>

	</div>

</body>
</html>