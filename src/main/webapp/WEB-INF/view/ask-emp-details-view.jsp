<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>input details</h2>
<br>
<br>
<%--this one is for simple view--%>
<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="empName"--%>
<%--    placeholder="input name"/>--%>
<%--    <input type="submit">--%>
<%--</form>--%>

<%--this one is for view with model--%>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <br>
    <br>
    salary <form:input path="salary"/>
    <br>
    <br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>