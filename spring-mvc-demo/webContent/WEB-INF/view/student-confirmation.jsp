<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!Doctype html>
<html>
	<head>
		<title>Student Confirmation Page</title>
	</head>
	<Body>
		The Student is Confirmed: ${student.firstName} ${student.lastName }
		<br><br>
		Hey you have selected: ${student.country} 
		<br><br>
		Favourite Language: ${student.favouriteLanguage}
		<br><br>
		Operating System: 
			<ul>
				<c:forEach var="temp" items="${student.operatingSystem}">
					<li>${temp }</li>
				</c:forEach>
			</ul>
	</Body>
</html>