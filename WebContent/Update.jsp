<html>
<head><title>Modifica una parola</title></head>
<body>
    <jsp:useBean id="diz"  class="mieibeans.Update"/>
    <jsp:setProperty name = "diz" property="parola" param="parola"/>
    <jsp:setProperty name = "diz" property="significato" param="significato"/>
    <jsp:getProperty name = "diz" property="update"/>
    <a href="\WebContent\index.jsp">Indietro</a>
</body>
</html>