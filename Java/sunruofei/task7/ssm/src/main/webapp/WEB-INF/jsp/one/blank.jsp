<%--
  Created by IntelliJ IDEA.
  User: 孙若飞
  Date: 2019/2/23
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" isErrorPage="true" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<json:object>
<json:property name="code" value="${code}"/>
    <json:property name="message">
        <spring:message code="${code}"/>
    </json:property>
</json:object>


