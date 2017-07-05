
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head> 
<link href="css.css" rel="stylesheet" type="text/css"/> 
</head> 
<%  
    Object emailid=session.getAttribute("email");
    if(emailid==null)
    {
        out.println("<body>"
                + "<h1> Session Expired !!! </h1>"
                + "<br>"
                + "<h1> Please Login Again... "
                + "</body>");
    }
    else
    {
%>

<body> 
<div id="gg"> 
<h1 style="font-family:courier new;color : white;">DEFENCE RESEARCH AND DEVELOPMENT<br> ORGANISATION-
NEW DELHI </h1> 
    <p style="font-family:courier new;color :BLACK;">(SUMMER TRAINING AND INTERNSHIP PROGRAM)  </p>
</div> 
<div id="header"> 
 
<a href="index.html" id="bb" target="_top"> HOME </a> 
<a href="registration.html" id="bb"  target="_top"> REGISTRATION </a> 
<a href="login.html" id="bb" target="_top" >  STUDENT LOGIN </a> 
<a href="admin.html" id="bb" target="_top">  ADMIN LOGIN </a>
</div> 
 
<div id="nav"> 
    <form name="myForm2" action="seedetail.jsp" >
        <input type="submit" value="SEE DETAILS" style="width: 177px; height: 50px" >
 </form>
     <form name="myForm2" action="editdetail.jsp" >
        <input type="submit" value="EDIT DETAILS" style="width: 177px; height: 50px" >
 </form>


 </div> 
<div id="section">
    <table>
        <tr>
            <td style="width: 560px">
               <h1 align="center">STUDENT DETAILS</H1> 
            </td>
            <td style="width: 250px">
                <form name="myForm1" action="logout" style="margin-left: 100px;margin-bottom: 15px" >
                    <input type="submit" value="LOGOUT" style="width: 155px;height: 50px">
                </form>

            </td>
        </tr>
    </table>
    
   
    <h3>Dear candidate,</h3>
    <P>  Your Form was edited successfully.<br>
     Thank you,
    <br>
    <br>
   (It is strongly recommended to close the browser after logging out for security reasons.)
  </p>
  
 
 </div> 

<div id="footer"> 
Copyright © DRDO,NEW DELHI
</div> 
 
</body> 
<% 
   }
%>

</html> 


