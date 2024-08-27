<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="/test" method="get">
        Name: <input type="text" name="name"> <br><br>
        Email: <input type="text" name="email"> <br><br>
        Gender: <input type="radio" name="gender" value="Male"> Male
                <input type="radio" name="gender" value="Female"> Female <br><br>

            <label for="course">Course:</label>
            <select name="course" id="course">

             <option > select </option>
                <option value= "core java">${msg.courseName}</option>
                <option value="Python">${msg.courseName}</option>
                <option value="C++">${msg.courseName}</option>
                <option value="Frontend">${msg.courseName}</option>
                <option value="backend">${msg.courseName}</option>
                <option value="Java Fullstack">${msg.courseName}</option>

            </select>


        <input type="submit" value="Submit">
    </form>
    <hr>

</body>
</html>
