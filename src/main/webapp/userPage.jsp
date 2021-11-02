<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
    <script src="jsLib/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="css/userPage.css">
</head>
<body>
<header>
    <jsp:include page="header.jsp"/>
</header>

<main>
    <div class="container">

        <h1>Сохранённые статьи</h1>
        <a href="/addArticle">Предложить свою статью</a>
    </div>

</main>
<footer>
    <jsp:include page="footer.jsp"/>
</footer>
<script src="ral.js"></script>
</body>
</html>
