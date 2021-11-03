<#ftl encoding='UTF-8'>
<#include 'base.ftl'>
<html lang="en">
<head>
    <title><#macro title>Добавить статью</title></#macro>
    <link rel="stylesheet" href="#">
</head>
<body>
<#macro content>
    <h1>Добавить статью:</h1>
    <form action="/addArticle" method="post">

        <label for="subject"> Тема статьи:
            <input type="text" id="subject" name="subject">
        </label>

        <label for="title"> Название статьи:
            <input type="text" id="title" name="title">
        </label>

        <label for="content"> Статья:
            <input type="text" id="content" name="content">
        </label>

        <input type="submit" value="Сохранить"/>

    </form>
</#macro>

</body>
</html>