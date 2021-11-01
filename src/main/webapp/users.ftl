<html lang="en">
<#include "base.ftl">
<head>
    <title><#macro title>Registered Users</#macro></title>
</head>
<body>

<main>
    <img src="images/health-left-mini-article.jpg" alt="health-img">

    <#macro content>
        Hello,
        <#if article??>
        <#--            <#if users?has_content>-->
        <#--                <#list users as u>-->
            <li>${article.title} ${article.content}</li>
        <#--                </#list>!-->
        <#--            </#if>-->
        </#if>
    </#macro>
    <button>Save article</button>
</main>
</body>


</html>


