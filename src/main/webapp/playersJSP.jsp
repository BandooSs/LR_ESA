<%@ page import="java.util.List" %>
<%@ page import="models.Player" %><%--
  Created by IntelliJ IDEA.
  User: nikit
  Date: 07.01.2024
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All_Players</title>
</head>
<body>
<h1><%= "!!!!!All players:" %>
    <ul>
        <%
            List<Player> playerNames = (List<Player>)request.getAttribute("playersList");
            for (Player playerName : playerNames) {
        %>
        <li><%= playerName.toString() %></li>
        <%
            }
        %>
    </ul>
</body>
</html>
