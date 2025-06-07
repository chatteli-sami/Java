<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <h1>Login</h1>
    <form action="/login" method="get">
      <label>Email:</label>
      <input type="text" name="email" />
      <label>Password:</label>
      <input type="text" name="password" />
      <input type="submit" value="login" />
    </form>
  </body>
</html>
