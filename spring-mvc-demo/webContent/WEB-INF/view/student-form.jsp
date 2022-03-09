<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!Doctype html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<Body><div>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/><br><br>
			Last Name : <form:input path="lastName"/><br><br>
			<form:select path="country">
				<form:options items="${student.countryOptions }"/>
			</form:select>
			<br>
    	  java <form:radiobutton path="favouriteLanguage" value="Java" />
	      C#   <form:radiobutton path="favouriteLanguage" value="C#"/>
	      PHP  <form:radiobutton path="favouriteLanguage" value="PHP"/>
	      Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
	      <br>
	      Linux <form:checkbox path="operatingSystem" value="Linux"/>
		  Mac OS<form:checkbox path="operatingSystem" value="Mac OS"/>
		  MS Windows<form:checkbox path="operatingSystem" value="MS Windows"/>
		  <br>
		<input type="submit" value="submit"/>
		</form:form>
		</div>
	</Body>
</html>