<html>
<head>
<title>Login</title>
</head>
<body>
    <p><font color="red">${errorMessage}</font></p>
    <form action="/login" method="POST">
        Username : <input name="u" type="text" /> <br>
        Email : <input name="e" type="email" /> <br>
        Password : <input name="p" type="password" /> <br>
        <input type="submit" value="Login"/>
    </form>
</body>
</html>