<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/header.css">
</head>
<body>
<header class="header">
    <div class="nav-bar">
        <h1>Scientific Science</h1>
        <div class="nav-bar-innerflex">

            ${sessionScope["userEmail"] != null ? "<a href='/userPage.jsp'>Профиль</a>" : "<a href = '/authorization'>Вход</a>"}
            ${sessionScope["userEmail"] != null ? "<a href = '/logout'>Выйти</a>": "<a href = '/registration.jsp'>Регистрация</a>"}

        </div>
    </div>

    <div class="menu-search">
        <div class="menu-flex">
            <a href="health.jsp">Health</a>
            <a href="science.jsp">Science</a>
            <a href="homegarden.jsp">Home|Garden</a>
            <a href="tech.jsp">Tech</a>
            <a href="animal.jsp">Animal</a>
            <a href="culture.jsp">Culture</a>
        </div>
        <div class="search-flex">
            <p><input type="search" name="q" class="search-field" placeholder="Поиск по сайту">
                <input type="submit" class="searchButton" value="Найти"></p>
        </div>
    </div>
</header>
<script src="ral.js"></script>
</body>
</html>
