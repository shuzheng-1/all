<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%
    String baseurl=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath()+"/";
    pageContext.setAttribute("baseurl", baseurl);
%>

<head>
    <base href="${baseurl}">
    <title>Title</title>
</head>
<body>
<table border="1">
    <c:forEach var="news" items="${news}">
    <tr>
        <td>${news.newsId}</td>
        <td>${news.title}</td>
        <td>${news.author}</td>
        <td>${news.source}</td>
        <td>${news.content}</td>
        <td>${news.time}</td>
        <td><a href="update/selectById?newsid=${news.newsId}">update</a></td>
        <td><a href="update/delete?newsid=${news.newsId}">delete</a></td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
