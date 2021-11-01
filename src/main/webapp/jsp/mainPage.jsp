<%--
  Created by IntelliJ IDEA.
  User: akhme
  Date: 12.10.2021
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scientific Science</title>
    <link rel="stylesheet" href="../css/mainPage.css">
</head>
<body>
<header>
    <jsp:include page="header.jsp"/>
</header>
<main>
    <div class="top-reads">
        <div class="top-reads-img">
            <img src="../images/top-reads-img.jpg" alt="top-reads-img">
        </div>

        <div class="top-reads-block">
            <h1>Our Top Reads</h1>
            <div class="top-reads-articles">
                <a href="#">The Republic of Nirivia: A <br/> Magical Micronation That<br/> Semi-exists on Lake Superior</a>
                <br/><!--ведут каждая на свою страницу-->
                <a href="#">The Orionid Meteor Shower <br/> Is Back - Here`s What You <br/> Need To Know</a><br/>
                <a href="#">Why Do British Lawyers Still <br/> Wear Wigs?</a><br/>
            </div>
        </div>
    </div>

    <div class="big-articles">

        <div class="health-big-article">
            <div class=article-header><h3>HEALTH</h3></div>
            <div class="health-mini-articles">
                <div class="mini-article">
                    <img src="../images/health-left-mini-article.jpg" alt="left-big-article">
                    <a href="#"><br/>If you want sustainable clothes, focus <br/>on the farms</a>
                    <p> Regenerative farming is trending in <br/>fashion, but does it get to the root of the <br/>clothing
                        industry's problem?</p>
                </div>

                <div class="mini-article">
                    <img src="../images/health-left-mini-article.jpg" alt="left-big-article">
                    <a href="#"><br/>If you want sustainable clothes, focus <br/>on the farms</a>
                    <p> Regenerative farming is trending in <br/>fashion, but does it get to the root of the <br/>clothing
                        industry's problem?</p>
                </div>
            </div>
        </div>

        <div class="science-big-article">
            <div class=article-header><h3>SCIENCE</h3></div>
            <div class="science-mini-articles">
                <div class="mini-article">
                    <img src="../images/science-left-mini-article.jpg" alt="left-big-article">
                    <a href="#"><br/>If you want sustainable clothes, focus <br/>on the farms</a>
                    <p> Regenerative farming is trending in <br/>fashion, but does it get to the root of the <br/>clothing
                        industry's problem?</p>
                </div>

                <div class="mini-article">
                    <img src="../images/science-left-mini-article.jpg" alt="left-big-article">
                    <a href="#"><br/>If you want sustainable clothes, focus <br/>on the farms</a>
                    <p> Regenerative farming is trending in <br/>fashion, but does it get to the root of the <br/>clothing
                        industry's problem?</p>
                </div>
            </div>
        </div>

    </div>

    <div class="four-mini-articles">
        <div class="mini-article">
            <div class=article-header><h3>HOME|GARDEN</h3></div>
            <img src="../images/science-left-mini-article.jpg" alt="left-big-article">
            <a href="#"><br/>If you want sustainable clothes, focus <br/>on the farms</a>
            <p> Regenerative farming is trending in <br/>fashion, but does it get to the root of the <br/>clothing
                industry's problem?</p>
        </div>

        <div class="mini-article">
            <div class=article-header><h3>TECH</h3></div>
            <img src="../images/science-left-mini-article.jpg" alt="left-big-article">
            <a href="#"><br/>If you want sustainable clothes, focus <br/>on the farms</a>
            <p> Regenerative farming is trending in <br/>fashion, but does it get to the root of the <br/>clothing
                industry's problem?</p>
        </div>

        <div class="mini-article">
            <div class=article-header><h3>ANIMAL</h3></div>
            <img src="../images/science-left-mini-article.jpg" alt="left-big-article">
            <a href="#"><br/>If you want sustainable clothes, focus <br/>on the farms</a>
            <p> Regenerative farming is trending in <br/>fashion, but does it get to the root of the <br/>clothing
                industry's problem?</p>
        </div>

        <div class="mini-article">
            <div class=article-header><h3>CULTURE</h3></div>
            <img src="../images/science-left-mini-article.jpg" alt="left-big-article">
            <a href="#"><br/>If you want sustainable clothes, focus <br/>on the farms</a>
            <p> Regenerative farming is trending in <br/>fashion, but does it get to the root of the <br/>clothing
                industry's problem?</p>
        </div>
    </div>
</main>

<footer>
    <jsp:include page="footer.jsp"/>
</footer>
</body>
</html>
