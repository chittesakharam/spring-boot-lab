<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
   
   <%@taglib uri="http://www.springframework.org/tags" prefix="sp" %>
   
   <h1 style="color:red;text-align:center;"> <sp:message code="home.welcome" /></h1>
   
   <h4> <sp:message code="home.title"/></h4>
   <h4> <sp:message code="home.name"/>:: ${name}</h4>
   <h4> <sp:message code="home.department"/>:: ${dept}</h4>
   
   
<a href="?lang=hi_IN"> Hindi </a>