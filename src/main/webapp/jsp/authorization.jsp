<%--
  Created by IntelliJ IDEA.
  User: akhme
  Date: 12.10.2021
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>authorization</title>
    <link rel="stylesheet" href="../css/registration.css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please sign up
    </div>

    <form action="/authorization" method="post">
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
