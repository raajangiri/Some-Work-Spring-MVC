<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById("yn").value;
		if (userName.length < 2) {
			alert("your name should be more than of 2 character");
			return false;
		} else
			return true;

	}
</script>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin: 30px;
}
</style>



</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<form:form method="get" action="home-process" modelAttribute="userInfo"
		onsubmit=" return validateUserName()">
		<div align="center">
			<p>
				<label for="yn">User Name:</label>
				<form:input id="yn" path="userName" />
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>
			<p>
				<label for="cn">Crush Name:</label>
				<form:input id="cn" path="crushName" />
			</p>

			<input type="submit" value="calculate">

			<form:checkbox path="termandCondition" id="check" />
			<label>i am agreeing this for fun </label>
			<form:errors path="termandCondition" cssClass="error"></form:errors>

		</div>
	</form:form>

</body>
</html>