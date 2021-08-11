<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>you are welcome</h2>
<br>
<br>

<%--this one for simple view--%>
<%--your name : ${empName}--%>

<%--this one for view vith models--%>
your name : ${employee.name}
<br>
<br>
your surname : ${employee.surname}
<br>
<br>
your salary : ${employee.salary}
<br>
<br>
your department : ${employee.department}
<br>
<br>
your brand : ${employee.carBrand}
<br>
<br>
language(s) :
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>

</ul>
<br>
<br>
your phone number : ${employee.phoneNumber}
<br>
<br>

your email : ${employee.email}
<br>
<br>

</body>
</html>