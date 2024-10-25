<%--
  Created by IntelliJ IDEA.
  User: 84941
  Date: 10/25/2024
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>nhan vien</title>
</head>
<body>
<form action="../controller" method="get">
    <input type="hidden" name="action" value="add">
    ma nv : <input name="manv"/> <br/>
    ten nv : <input name="tennv"/> <br/>
    email : <input name="email" type="email"/> <br/>
    dia chi : <input name="diachi"/> <br/>
    dien thoai : <input name="dienthoai"/> <br/>
    <label>phong ban:</label>

    <select id="phongban">
        <option value="1" selected>1</option>
        <option value="2">2</option>
    </select>
    <br/>
    <input type="submit" value="insert">


</form>

</body>
</html>
