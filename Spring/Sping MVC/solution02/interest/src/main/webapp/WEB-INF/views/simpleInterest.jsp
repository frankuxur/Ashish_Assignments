<html>
<head>
<title></title>
</head>
<body>
    <p><font color="red">${errorMessage}</font></p>
    <form action="/SIcalculator" method="POST">
        P : <input name="principal" type="text" /> <br> 
        R : <input name="rate" type="text" /> <br> 
        T : <input name="time" type="text" /> <br> 
        <input type="submit" value="Calculate Simple Interest"/>
    </form>
</body>
</html>