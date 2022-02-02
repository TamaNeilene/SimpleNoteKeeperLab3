<%-- 
    Document   : viewnote
    Created on : Feb. 1, 2022, 8:10:20 p.m.
    Author     : parso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
          <link href="Style/stylesheet.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="design">
         <h1>View Note</h1>
        
        <p>Title: ${note.title}</p>
        <p>Contents: ${note.contents}</p>
        
        
        <a href="note?edit=true">Edit Note</a>
        </div>
    </body>
</html>
