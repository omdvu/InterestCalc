<%-- 
    Document   : index
    Created on : Jul 31, 2025, 12:57:22 PM
    Author     : om
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            Enter principal amount :<input type="text" name="principal">
            <br>
               Enter rate :<input type="text" name="rate">
                  <br>
                  Enter time :<input type="text" name="time">
                  <br>
                  Enter number of times to compound annually :<input type="text" name="n">
                  <br>
                  
             <input type="submit" name="type" value="simple">    
              <br>
              <input type="submit" name="type" value="compound">   <br>
              Enter number to find factorial:<input type="text" name="num">
              <input type="submit" name="type" value="factorial"> 
        </form>
    </body>
</html>
