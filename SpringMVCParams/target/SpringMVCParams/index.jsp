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
    <%--
    <a href="param/testParam?account=Forlogen">请求参数绑定</a>

    <form action="param/saveAccount" method="post">
        ID：<input type="text" name="id" /><br/>
        姓名：<input type="text" name="username" /><br/>
        年龄：<input type="text" name="age" /><br/>
        <input type="submit" value="提交" />
    </form>
    --%>

    <form action="param/saveUser" method="post">
        姓名：<input type="text" name="username" /><br/>
        宠物姓名：<input type="text" name="list[0].name"/><br/>
        宠物年龄：<input type="text" name="list[0].age"/><br/>

        宠物姓名：<input type="text" name="map['one'].name"/><br/>
        宠物年龄：<input type="text" name="map['one'].age"/><br/>

        <input type="submit" value="提交" />
    </form>

    <a href="param/testServletAPI">测试....</a>
</body>
</html>
