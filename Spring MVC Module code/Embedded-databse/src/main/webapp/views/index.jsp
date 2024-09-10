<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
</head>
<body>
    <h1>Product List</h1>

        <p>
    		<font color='blue'>  ${msg}   </font>
    	</p>


    <form:form method="post" action="submit" modelAttribute="loadProduct">
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>

            <tr>
                <td>Price:</td>
                <td><form:input path="price" /></td>
            </tr>

                <tr>
                                          <td>Quantity:</td>
                                           <td><form:input path="quantity" /></td>
                 </tr>


            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form:form>


</body>
</html>
