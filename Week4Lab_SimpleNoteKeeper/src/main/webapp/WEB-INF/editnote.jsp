<%-- 
    Document   : editnote
    Created on : Feb. 1, 2022, 8:10:32 p.m.
    Author     : parso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
          <link href="Style/stylesheet.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        
        <form action="note" method="POST">
            <label for="title">Title:</label> 
            <input type="text" name="title" id="title" placeholder="Title" style="background-color:#DAC4F3;" >
            </br><!-- comment -->
            </br>
            <label for="contents">Contents:</label>
            <input type="text" name="contents" id="contents" placeholder="Contents" style="height: 200px; background-color:#DAC4F3;">
            </br>
            <button type="submit" style="background-color:#DAC4F3;">Save</button>
            
            
        </form>
    </body>
</html>
