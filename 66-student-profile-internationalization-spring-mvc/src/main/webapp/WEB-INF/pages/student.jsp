<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="sp"%>

    <h1 style="color:red;text-align:center;"><sp:message code="msg.welcome"/></h1>
   <h4> <sp:message code="msg.title"/>  </h4>
    <table border="1px">
    <tr>
    <td><sp:message code="msg.student"/> :: </td>
    <td>${name}</td>
    </tr>
    <tr>
    <td><sp:message code="msg.course"/> :: </td>
    <td>${course}</td>
    </tr>
    </table>
    
    <h5><sp:message code="msg.thank"/></h5>
    
    <p>
    <a href="?lang=hi" > English</a>
    <a href="?lang=hi_IN">Hindi</a>
    <a href="?lang=fr_FR">French</a>
    <a href="?lang=de_DE">German</a>
    <a href="?lang=mr_IN">Marathi</a>
    
    </p>