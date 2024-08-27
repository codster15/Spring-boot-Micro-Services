<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
</head>
<body>
    <h1>Student Form</h1>
    <form:form method="post" action="save" modelAttribute="bacche">
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
                               <form:radiobutton path="gender" value="M" /> Male
                               <form:radiobutton path="gender" value="F" /> Female
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
                                          <!-- Time Selection using Checkboxes -->

                                     <tr>
                                     				<td>Timings</td>
                                     				<td><form:checkboxes items="${availableTime}" path="timings" /></td>
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
