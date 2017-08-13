<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hibernate Validator Example Demo</title>
    <spring:url value="/resources/main.css" var="mainCss" />
    <link href="${mainCss}" rel="stylesheet" />
  </head>
  <body>

  <hr>

  <form:form action="formresult" modelAttribute="bankCustomer">
    <form:input path="name" placeholder="Name"/><form:errors path="name" cssClass="error"/><br><br>

    <form:input path="surname" placeholder="Surname"/><form:errors path="surname" cssClass="error"/><br><br>

    <form:input path="email" placeholder="Email"/><form:errors path="email" cssClass="error"/><br><br>

    <form:input path="customerID" placeholder="ID"/><form:errors path="customerID" cssClass="error"/><br><br>

    <form:input path="bankCode" placeholder="ID"/><form:errors path="bankCode" cssClass="error"/><br><br>

    <input type="submit"/>
  </form:form>

  <hr>

  </body>
</html>
