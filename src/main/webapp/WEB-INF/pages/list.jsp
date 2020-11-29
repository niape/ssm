<%--
  Created by IntelliJ IDEA.
  User: 16012
  Date: 2020/11/29
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${list}<br/>

    <table border="1px">
        <tr>
            <td>序号</td>
            <td>id</td>
            <td>name</td>
            <td>money</td>
        </tr>
        <c:forEach items="${list}" var="account" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.money}</td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
