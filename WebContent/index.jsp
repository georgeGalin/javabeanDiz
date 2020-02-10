<html>
    <head>
        <title>Dizionario</title>           
    </head>
    <body>



        <h1>Dizionario</h1>
        </br></br>

        <h3>Trova una parola</h3>

        <form action="Find.jsp" method="POST">
            Parola : <input type="text" name="parola">
            <button type="submit" border-radius: 8px>Cerca</button>
        </form></br>

        <h3>Aggiungi una nuova parola</h3>

        <form action="Add.jsp" method="POST">
        Parola :  <input type="text" name="parola"></br>
        Significato : <input type="text" name="significato"></br></br>
            <button type="submit">Aggiungi</button>
        </form></br>
             
            <h3>Elimina una parola</h3>

        <form action="Delete.jsp" method="POST">
            Parola : <input type="text" name="parola">
            <button type="submit">Cancella</button>
        </form></br>

            <h3>Modifica una parola</h3>

        <form action="Update.jsp" method="POST">
            Parola : <input type="text" name="parola"></br>
            Significato : <input type="text" name="significato"></br></br></br>
            <button type="submit">Modifica</button>
        </form></br>
        
    </body>
</html>