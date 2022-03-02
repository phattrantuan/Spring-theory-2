<%@page import="com.phat.entity.Staff"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>heelllo</h2>


<!-- Model And Views -->
 ${user}
 <%= request.getAttribute("pass") %>
 
 <%= "Model map" %>
 <!-- ModelMaps -->
 ${username}
 <%= request.getAttribute("password") %>
 
 
 
  <%= "\n transmit and receive data from object\n" %>
 
  ${figure.getAddress()}
  
   <% Staff staff= (Staff)request.getAttribute("figure"); %>
  <!--  --><%="staff.getAge()" %> 
 
  <%= "\n transmit and receive data from list\n" %>
  <br><br>
   ${list[0].getAge()                                                                                                                                                   }

  <a href="RequestParam?id=2">Receive on browser with RequestParam</a>
  
   <a href="RequestParam/2/jaja">Receive on browser with Pathvariable</a>
    <a href="matrixVariable/2;goods=hha;date=12-2-15">Receive on browser with MatrixVariable</a>

<br><br><br><br>
<form action="post" method="post">
<input type="text" name="post1">
<input type="submit">
</form>



<!-- Static Resource -->
 <a href="Login">Login </a>

</body>
</html>