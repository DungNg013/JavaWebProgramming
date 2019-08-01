<%-- 
    Document   : jsp
    Created on : Jul 28, 2019, 3:26:22 PM
    Author     : Dell E5440
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
          <div class="container">
       
        <table class="table table-dark table-striped">
            <tr>
                <th>TT</th>
                <th>Name</th>
                <th>Major</th>
                <th>DOB</th>
            </tr>
        <%
            userModel model = new userModel();
            List<User> Users = model.getUsers();
            
            for (User User : Users) { %>
            <tr>
                <td> <%= User.getHoten() %> </td>
                <td> <%= User.getKhoa() %> </td>
                <td> <%= User.getLop() %> </td>
               
            </tr>        
        <% } %>
        </table>    
        </div>
        
    </body>
</html>
