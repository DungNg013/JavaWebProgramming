<%-- 
    Document   : jsp
    Created on : Jul 27, 2019, 3:32:59 PM
    Author     : Dell E5440
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
<!--        <h1>Danh sách sinh viên</h1>-->
        <table class="table table-dark table-striped">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Major</th>
                <th>DOB</th>
            </tr>
        <%
            UserModel model = new UserModel();
            List<User> users = model.getUsers();
            
            for (User stud : users) { %>
            <tr>
                <td> <%= stud.getId() %> </td>
                <td> <%= stud.getName() %> </td>
                <td> <%= stud.getMajor() %> </td>
                <td> <%= stud.getDob() %> </td>
            </tr>        
        <% } %>
        </table>    
        </div>
    </body>
</html>
