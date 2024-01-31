<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    welcome to world

   <form action="add">
   enter the first num:<input type="text" name="num1" > <br>

     enter the Second num:<input type="text" name="num2" > <br>

     <input type="submit">
     </form>

     <br>
      <form action="addAlien" method="post">
        Enter id:<input type="text" name="aid" > <br>

          Enter Your Name:<input type="text" name="aname" > <br>

          <input type="submit">
          </form>

 <form action="getAlien">
        Enter id:<input type="text" name="aid" > <br>

          Enter Your Name:<input type="text" name="aname" > <br>

          <input type="submit">
          </form>
</body>
</html>