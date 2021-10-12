<%--
  Created by IntelliJ IDEA.
  User: akhme
  Date: 12.10.2021
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<header>

    <div class="nav-bar">
        <h1>Scientific Science</h1>
        <div class="nav-bar-innerflex">
            <%--нужна кнопка выхода их страницы пользователя--%>
<%--            <input type="button" value="Вход" id="authorization">--%>
<%--            <input type="button" value="Зарегистрироваться" id="registration">--%>
        </div>
    </div>

    <div class="menu-search">
        <div class="menu-flex">
            <a href="#">Health</a>
            <a href="#">Science</a>
            <a href="#">Home|Garden</a>
            <a href="#">Tech</a>
            <a href="#">Animal</a>
            <a href="#">Culture</a>
        </div>
        <div class="search-flex">
            <p><input type="search" name="q" class="search-field" placeholder="Поиск по сайту">
                <input type="submit" class="searchButton" value="Найти"></p>
        </div>
    </div>
</header>
</body>
</html>
