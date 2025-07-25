<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ page isErrorPage="true" %> <%@ taglib
uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%> <%@ taglib prefix = "c" uri =
"http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="css/addPage.css" />
    <title style="color: red">Book Club</title>
  </head>
  <body>
    <div class="container">
      <h1>Add to Your Book Shelf</h1>

      <a href="/home">back to shelves</a>

      <div class="container">
        <form:form
          action="/books"
          modelAttribute="book"
          class="form"
          method="post"
        >
          <div class="form-row">
            <form:errors path="title" class="error" />
            <form:label for="title" path="title">Title:</form:label>
            <form:input type="text" path="title" class="form-control" />
          </div>

          <div class="form-row">
            <form:errors path="author" class="error" />
            <form:label for="author" path="author">Author:</form:label>
            <form:input type="text" path="author" class="form-control" />
          </div>

          <div class="form-row">
            <form:errors path="thoughts" class="error" />
            <form:label for="thoughts" path="thoughts">Thoughts:</form:label>
            <form:textarea path="thoughts" class="form-control" />
          </div>

          <div class="form-row">
            <form:errors path="user" class="error" />
            <form:input
              type="hidden"
              path="user"
              value="${user.id}"
              class="form-control"
            />
          </div>

          <div class="form-row">
            <input type="submit" value="Submit" class="btn-primary" />
          </div>
        </form:form>
      </div>
    </div>
  </body>
</html>
