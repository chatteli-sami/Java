<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Reading Book</title>
  </head>
  <body>
    <h1>All Books</h1>
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Title</th>
          <th>Language</th>
          <th>Number of Pages</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="book" items="${books}">
          <tr>
            <td><c:out value="${book.id}" /></td>
            <td><c:out value="${book.title}" /></td>
            <td><c:out value="${book.language}" /></td>
            <td><c:out value="${book.numberOfPages}" /></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
