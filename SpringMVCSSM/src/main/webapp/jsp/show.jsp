<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2020/9/29
  Time: 4:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="emp">

    ${emp.empno}
    ${emp.ename}

    ${emp.job}

    ${emp.mgr}

    ${emp.hiredate}

    ${emp.sal}
    ${emp.comm}
    ${emp.deptno}
    ${emp.dept.dname}
    ${emp.dept.loc}<br/>



</c:forEach>



</body>
</html>
