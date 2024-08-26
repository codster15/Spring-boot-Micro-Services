
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Book Details</h2>

       <form action="/kitab">

        Book ID : <input type="text" name="id">
        <input type="submit" value="search">

    </form>
     <hr>

    BookID : ${kitab.bookId}        <br>
    Book Name : ${kitab.bookName}   <br>
    Book Price : ${kitab.bookPrice}  <br>






</body>
</html>