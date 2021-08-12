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
<form:form action="showDetails" modelAttribute="employee" method="get">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    salary <form:input path="salary"/>
    <br>
    <br>
<%--    this option uses if we input possible options directly in jsp page--%>
<%--    department <form:select path="department">--%>
<%--                    <form:option value="Info tech" label="IT"/>--%>
<%--                    <form:option value="Human res" label="HR"/>--%>
<%--                    <form:option value="Publ rel" label="PR"/>--%>
<%--               </form:select>--%>

    <%--    this option uses if we get possible options from object of Employee.class--%>
    department <form:select path="department">
                    <form:options items="${employee.departments}"/>
               </form:select>

    <br>
    <br>
<%--    &lt;%&ndash;    this option uses if we input possible options directly in jsp page&ndash;%&gt;--%>
<%--    which car do you want?--%>
<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    Mers <form:radiobutton path="carBrand" value="Mers"/>--%>
    <%--    this option uses if we get possible options from object of Employee.class--%>
    which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}" />
    <br>
    <br>

<%--    &lt;%&ndash;    &lt;%&ndash;    this option uses if we input possible options directly in jsp page&ndash;%&gt;&ndash;%&gt;--%>
<%--    foreign language(s)?--%>
<%--    EN <form:checkbox path="languages" value="English" />--%>
<%--    FR <form:checkbox path="languages" value="Franch" />--%>
<%--    SP <form:checkbox path="languages" value="Spanish" />--%>

    <%--  this option uses if we we get possible options from object of Employee.class --%>
    foreign language(s)?
    <form:checkboxes path="languages" items="${employee.languagesList}"/>
    <br>
    <br>

    phoneNumber <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>

    email <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>

    <input type="submit" value="OK">

</form:form>

</body>
</html>