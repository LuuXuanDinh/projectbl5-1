<%-- 
    Document   : list
    Created on : Dec 5, 2021, 11:49:50 AM
    Author     : XuanDinh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("student");
    %>
    <body>
        <table border="1px"> 
            <tr>
                <td>ID</td>
                <td>Lop</td>
                <td>Name</td>
                <td>MSSV</td>
                <td>Attendance report</td>
            </tr>
            <% for (Student s : students) {%>
            <tr>
                <td><%=s.getIdhocsinh()%></td>
              
                <td><%=s.getName()%></td>
                <td><%=s.getMssv()%></td>
                 
                <td>
                    <input type="button" value="update" 
                           onclick="window.location.href = 'update?id=<%=s.getIdhocsinh()%>'" />
                </td>
                <td>
                    <input type="button" value="delete" 
                           onclick="window.location.href = 'delete?id=<%=s.getIdhocsinh()%>'" />
                </td>
            </tr>    
            <%}%>
        </table>
    </body>
</html>
