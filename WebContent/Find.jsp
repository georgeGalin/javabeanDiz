<html>
<head><title>Cerca Parole dentro il dizionario!</title></head>
<body>
    <jsp:useBean id="diz" class="mieibeans.Find"/>
    <jsp:setProperty name="diz" property="parola" param="parola"/>
    <jsp:setProperty name="diz" property="parola"/>
    <jsp:getProperty name = "diz" property="find"/>
    <a href="\WebContent\index.jsp">Indietro</a>
</body>
</html>