<#ftl encoding='UTF-8'>
<html lang="en">
<#include "base.ftl">
<head>
    <title><#macro title>Article</#macro></title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <link rel="stylesheet" href="css/article.css">
</head>
<body>
<header>
    <#include 'header.jsp'>
</header>
<main>
    <img src="images/health-left-mini-article.jpg" alt="health-img">

    <#macro content>
        <#if article??>
            <li>${article.title} ${article.content}</li>
        </#if>
    </#macro>
    <button>Save article</button>

    <div id="ajax-div">место куда будет записываться ответ

    </div>
    <form>
        <input type="button" id="ajax-button" value="Get hello message">
    </form>

    <button id = "button">Где посмотреть сохранунную статью?</button>

    <div id = "modal" class = "modal">
        <div class = "modal-content">
            <span class = "close">&times;</span>
            <p>Сохраненные статьи можно найти на странице вашего профиля</p>
        </div>
    </div>
</main>
<footer>
    <#include 'footer.jsp'>
</footer>
<script src = "ajax.js"></script>
<script src = "modal.js"></script>
</body>


</html>


