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
            top: 146px;
            left: 90px;
        }
    </style>
</head>
<body>
<span style="padding-left: 125px">发布新闻</span>
<form action="news/add" method="post" >
    <pre>
    标题：<input type="text" name="title" />
    作者:<input type="text" name="author"/>
    来源:<input type="text" name="source"/>
    内容：<input type="text" name="content"/>

    <input type="submit" name="sub" value="提交" />
    </pre>
</form>
<a href="news/select"  id="look"><button >查看</button></a>

</body>
</html>
