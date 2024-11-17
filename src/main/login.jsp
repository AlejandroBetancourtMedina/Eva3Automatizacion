<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="login" method="post">
        <label>Email:</label>
        <input type="email" name="email" required><br>
        <label>Password:</label>
        <input type="password" name="password" required><br>
        <button type="submit">Ingresar</button>
    </form>
    <% if (request.getParameter("error") != null) { %>
        <p style="color:red;">Credenciales incorrectas.</p>
    <% } %>
</body>
</html>
