<html>
    <head>
        <title>Cancella contenuto da db</title>
    </head>
    <body>
        <jsp:useBean id="diz" class="mieibeans.Delete"/>
        <jsp:setProperty name="diz" property="parola" param="parola"/>
        <jsp:setProperty name="diz" property="parola"/>
        <jsp:getProperty name = "diz" property="delete"/>
        <a href="\WebContent\index.jsp">Indietro</a>
    </body>
</html>