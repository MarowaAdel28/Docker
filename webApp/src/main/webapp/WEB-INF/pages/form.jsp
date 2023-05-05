
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<body>
    
    <form:form method="POST" modelAttribute="user" action="/lab2/form" >

        <b><spring:message code="field.userName"/></b>
        <form:input path="user_name"/>
        <form:errors path="user_name"/>
        <br/>

        <b><spring:message code="field.password"/></b>
        <form:input path="password"/>
        <form:errors path="password"/>
        <br/>

        <input type="submit"/>

    </form:form>

</body>

</html>