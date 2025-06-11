<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Book Details</title>
    <style>
      body {
        font-family: Arial, sans-serif;
        margin: 40px;
      }
      .book-details {
        border: 1px solid #ccc;
        padding: 20px;
      }
    </style>
  </head>
  <body>
    <h1>Book Details</h1>
    <div class="book-details">
      <p><strong>ID:</strong> ${book.id}</p>
      <p><strong>Title:</strong> ${book.title}</p>
      <p><strong>Author:</strong> ${book.author}</p>
      <p><strong>Description:</strong> ${book.description}</p>
    </div>
  </body>
</html>
