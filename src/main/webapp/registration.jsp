<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
    <link rel="stylesheet" href="css/registration.css" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please sign up
    </div>

    <%
        String email = "", pas = "", remember = "";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userEmail")) {
                    email = cookie.getValue();
                } else if (cookie.getName().equals("userPassword")) {
                    pas = cookie.getValue();
                } else if (cookie.getName().equals("userPassword")) {
                    remember = cookie.getValue();
                }
            }
        }
    %>

    <form action="/registration" method="post">
        <label for="name">Name:
            <input class="input-field" type="text" id="name" name="name">
            <%--name для параметра пост запроса нужен так что в сервелете и здесь пишем одинаково--%>
        </label>
        <label for="email"> Почта:
            <input class="input-field" type="email" id="email" name="email">
        </label>
        <label for="password"> Пароль (хотя бы одна заглавная буква и цифра):
            <input class="input-field" type="password" id="password" name="password">
        </label>

        <input type="submit" value="Sign up"/>
    </form>
</div>

</body>
</html>
