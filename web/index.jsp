<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: SongYunMin--%>
<%--  Date: 2020-11-12--%>
<%--  Time: 오후 4:03--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ page import="java.util.*" %>--%>
<%--<%@ page import="example.HelloWorld" %>--%>
<%--<%@ page import="example.HelloWorld_2" %>--%>
<%--<html>--%>
<%--<html>--%>
<%--    <head>--%>
<%--    <title>$Title$</title>--%>
<%--    <link rel="stylesheet" type="text/css" href="test.css"/>--%>
<%--  </head>--%>

<%--  <body>--%>
<%--  <div class="body">--%>
<%--  $END$--%>
<%--  JavaTestFile--%>
<%--  </div>--%>
<%--  <%--%>
<%--    HelloWorld h = new HelloWorld();--%>
<%--    HelloWorld_2 h2 = new HelloWorld_2();--%>
<%--    String result,result_2;--%>
<%--    result = h.sayHelloWorldFrom("Yun min");--%>
<%--    h2.init();--%>

<%--    // 80px--%>
<%--    out.println("<div class=\"test\">");--%>
<%--    out.println(result);--%>
<%--    out.println("</div>");--%>
<%--  %>--%>

<%--  </body>--%>
<%--</html>--%>

<!DOCTYPE html>
<html>
<head>
    <title>Insert Data</title>
</head>
<body>
<!-- Give Servlet reference to the form as an instances
GET and POST services can be according to the problem statement-->
<form action="./InsertData" method="post">
    <p>ID:</p>
    <!-- Create an element with mandatory name attribute,
    so that data can be transfer to the servlet using getParameter() -->
    <input type="text" name="id"/>
    <br/>
    <p>String:</p>
    <input type="text" name="string"/>
    <br/><br/><br/>
    <input type="submit"/>
</form>
</body>
</html>
