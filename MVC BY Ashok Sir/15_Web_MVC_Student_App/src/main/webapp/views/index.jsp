<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
</head>
<body>
    <h1>Student Form</h1>
    	<p>
    		<font color='green'>${msg }</font>
    	</p>

    <form:form method="post" action="save" modelAttribute="student">
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>

            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>

                <tr>
                           <td>Gender:</td>
                           <td>
                               <form:radiobutton path="gender" value="Male" /> Male
                               <form:radiobutton path="gender" value="Female" /> Female
                           </td>
                 </tr>

             <tr>
                        <td>Course:</td>
                        <td>
                            <form:select path="course">
                                <form:option value="" label="Select a course" />
                                <form:options items = "${course}" />

                            </form:select>
                        </td>
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
