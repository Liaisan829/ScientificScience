<#ftl encoding='UTF-8'>
<html lang="en">
<#include "base.ftl">
<head>
    <title><#macro title>Article</#macro></title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <link rel="stylesheet" href="css/article.css">
</head>
<body>

<main>

    <div class="content">

        <#macro content>
            <#if article??>
                <h1>${article.title}</h1>
                <br>
                <img src="images/health-left-mini-article.jpg" alt="health-img">
                <br>
                <p>${article.content}</p>
            </#if>
        </#macro>
    </div>
    <div class = "button-flex">
        <button>Save article</button>
        <button id="button">Где посмотреть сохранунную статью?</button>
    </div>

    <div id="modal" class="modal">
        <div class="modal-content">
            <span class="close">&times;</span>
            <p>Сохраненные статьи можно найти на странице вашего профиля</p>
        </div>
    </div>
</main>
<#--    <div id="ajax-div">место куда будет записываться ответ-->

<#--    </div>-->
<#--    <form>-->
<#--        <button></button>-->
<#--    </form>-->

<script src="ajax.js"></script>
<script src="modal.js"></script>
</body>


</html>


