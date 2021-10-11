<%@ page import="ru.kpfu.itis.akhmetova.models.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignedUsers</title>
    <link rel="stylesheet" href="/css/signupstyle.css" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please sign up
    </div>

    <form action="/signedUsers" method="post">
        <label for="name">
            <input class="input-field" type="text" id="name" name="name" placeholder="Name">
        </label>
        <label for="birthdate">
            <input class="input-field" type="text" id="birthdate" name="birthdate" placeholder="birth date">
        </label>
        <label for="password">
            <input class="input-field" type="password" id="password" name="password" placeholder="password">
        </label>
        <input type="submit" value="Sign up">
    </form>
</div>

<%--<%--%>
<%--    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");--%>
<%--%>--%>
<%--<div class = "form-style-2">--%>
<%--    <div class = "form-style-2-heading">Already registered</div>--%>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <th>User name</th>--%>
<%--            <th>Birth Date</th>--%>
<%--        </tr>--%>
<%--        <%for (User user : users) {%>--%>
<%--        <tr>--%>
<%--            <td><%= user.getName()%>--%>
<%--            </td>--%>
<%--            <td><%= user.getBirthdate()%>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <% }%>--%>

<%--    </table>--%>
<%--</div>--%>

</body>
</html>
