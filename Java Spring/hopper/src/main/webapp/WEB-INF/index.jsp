<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Receipt for Purchase</title>
  </head>
  <body>
    <h1>Receipt for Single Item Purchase</h1>
    <p>Buyer: <c:out value="${name}" /></p>
    <p>Item: <c:out value="${itemName}" /></p>
    <p>Description: <c:out value="${description}" /></p>
    <p>Price: $<c:out value="${price}" /></p>
    <p>Vendor: <c:out value="${vendor}" /></p>
  </body>
</html>
