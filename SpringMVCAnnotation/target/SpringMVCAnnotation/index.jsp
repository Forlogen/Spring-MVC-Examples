<%--
  Created by IntelliJ IDEA.
  User: dyliang
  Date: 2020/6/16
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="anno/testRequestParam?name=Forlogen">RequestParam</a><br>

    <a href="anno/testPathVariable/10">testPathVariable</a><br>

    <a href="anno/testRequestHeader">RequestHeader</a><br>

    <a href="anno/testCookieValue">CookieValue</a><br>


    <form action="anno/testRequestBody" method="post">
        用户姓名：<input type="text" name="username" /><br/>
        用户年龄：<input type="text" name="age" /><br/>
        <input type="submit" value="提交" />
    </form>

    <a href="anno/testSessionAttributes">testSessionAttributes</a>
    <a href="anno/getSessionAttributes">getSessionAttributes</a>
    <a href="anno/delSessionAttributes">delSessionAttributes</a>

    <form action="anno/testModelAttribute" method="post">
        用户姓名：<input type="text" name="username" /><br/>
        用户年龄：<input type="text" name="age" /><br/>
        <input type="submit" value="提交" />
    </form>

</body>
</html>
