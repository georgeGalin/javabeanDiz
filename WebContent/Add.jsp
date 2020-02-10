<html>
<head>
    <title>Aggiungi una parola</title>
</head>
<body>
    <jsp:useBean id="diz" class="mieibeans.Add"/>
    <jsp:setProperty name = "diz" property="parola" param="parola"/>
    <jsp:setProperty name = "diz" property="significato" param="significato"/>
    <jsp:getProperty name = "diz" property="add"/>
    <a href="\WebContent\index.jsp">Indietro</a>

</body>
</html>