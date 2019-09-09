<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML>
<html>
       <head>
              <title>
              </title>
              <link rel="stylesheet" type="text/css" href="./style/style.css">
               
       </head>
       <body>
              <header class="cmpy-header">
                     <div class="cmpy-properties">
                           <h1>yo!yo!</h1>
                           <img src="./images/hotel.png" id="cmpy-logo" alt="company logo"/>
                     </div>
                     <nav class='nav-bar'>
                           <a href="./">HOME</a>
                           <a href="./">LOGOUT</a>
                     </nav>
              </header>
              <div class="admin_Container">
              
<form name="Addform" action="AddHotel.jsp">
<button id="admin-btn">Add Hotel</button>
</form>
                     
<form name="editform" action="EditServlet">
          <input type="submit" id="admin-btn" name="eId" value="Edit Hotel" onchange="document.editform.submit()">
          <div id="editDisabled">
                <select id="id" name="id">
                     <option value="" required >Select Id</option>
                     <c:forEach items="${id}" var="item1">
                           <option value="${item1}">${item1}</option>
                     </c:forEach>
                  </select>
              </div>
</form>                    

<form name="Deleteform" action="DeleteServlet">
<input type="submit" id="admin-btn" name="dId" value="Delete Hotel" onchange="document.Deleteform.submit()" >
<div id="editDisabled">
                <select id="id" name="id">
                     <option value="" required >Select Id</option>
                     <c:forEach items="${id}" var="item1">
                           <option value="${item1}">${item1}</option>
                     </c:forEach>
                  </select>
              </div>
</form>

              </div>
              <footer class="cmpy-footer">
			<a href="About.jsp">ABOUT US</a>
			<a href="Contact.jsp">CONTACT US</a>
		</footer>
       </body>
</html>
