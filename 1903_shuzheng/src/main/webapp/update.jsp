<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    String baseurl=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath()+"/";
    pageContext.setAttribute("baseurl", baseurl);
%>

<head>
    <base href="${baseurl}">
    <title>Title</title>
    <style type="text/css">
        #look{
            position: absolute;
            top: 165px;
            left: 70px;
        }
    </style>
</head>
<body>

<span style="padding-left: 125px">修改新闻</span>
<form action="update/update" method="post" >
    <pre>
        <input type="hidden" name="newsId" value="${newById.newsId}">
    标题：<input type="text" name="title" value="${newById.title}"/>
    作者:<input type="text" name="author" value="${newById.author}"/>
    来源:<input type="text" name="source" value="${newById.source}"/>
    内容：<input type="text" name="content" value="${newById.content}"/>

    <input type="submit" name="sub" value="修改" />
    </pre>
</form>
<a href="news/select"  style="padding-left: 31px " id="look"><button>查看</button></a>

</body>
</html>
