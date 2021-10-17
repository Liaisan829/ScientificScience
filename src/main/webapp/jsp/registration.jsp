<%@ page import="ru.kpfu.itis.akhmetova.models.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
    <link rel="stylesheet" href="../css/registration.css" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please sign up
    </div>

    <form action="/registration" method="post">
        <label for="name">
            <input class="input-field" type="text" id="name" name="name" placeholder="Name">
            <%--name для параметра пост запроса нужен так что в сервелете и здесь пишем одинаково--%>
        </label>
        <label for="email">
            <input class="input-field" type="email" id="email" name="email" placeholder="name@email.com">
        </label>
        <label for="password">
            <input class="input-field" type="password" id="password" name="password" placeholder="password">
        </label>
        <input type="submit" value="Sign up">
    </form>
</div>

</body>
</html>
