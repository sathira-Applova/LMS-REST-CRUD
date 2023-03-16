<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addBook">
    <label for="bookID">Book ID : </label>
    <input type="text" id="bookID" name="bookID"><br>
    <label for="bookName">Book Name : </label>
    <input type="text" id="bookName" name="bookName"><br>
    <label for="noOfCopies">Number of Copies : </label>
    <input type="text" id="noOfCopies" name="noOfCopies"><br>
    <input type="submit"><br>
    <button type="submit" formaction="/allbooks">View All Books</button>
</form>
</body>
</html>