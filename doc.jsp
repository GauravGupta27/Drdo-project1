 <%
    Object email=session.getAttribute("email");
 %>

<html>
      <head>
          <link href="css.css" rel="stylesheet" type="text/css"/>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      </head>
      <% 
    if(email==null)
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
 
<a href="index.html" id="bb" target="_top" > HOME </a> 
<a href="registration.html" id="bb"  target="_top"> REGISTRATION </a> 
<a href="login.html" id="bb" target="_top">  STUDENT LOGIN </a> 
<a href="admin.html" id="bb" target="_top" style="background-color :#66CC00;">  ADMIN LOGIN </a>
</div> 
 
<div id="nav">

 
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
  
       <form method="post" action="detailpage2" enctype="multipart/form-data">
        <table border="0">
             <tr>
                <td>Portrait Photo: </td>
                <td><input type="file" name="photo" accept="image/jpeg,image,jif" style="margin-left: 28px"/></td>
             </tr>
             <tr>
                <td>Portrait Resume: </td>
                <td><input type="file" name="resume" accept="image/jpeg,image,jif" style="margin-left: 28px"/></td>
             </tr>
             <tr>
                <td>Portrait NOC: </td>
                <td><input type="file" name="noc" accept="image/jpeg,image,jif" style="margin-left: 28px"/></td>
             </tr>
             
             <tr>
                <td></td>
                <td><input type="email" name="emailid" value="<%=email%>" size="50" readonly="true" hidden="true"/></td>
             </tr>
             
            </table>
             <br>
             <input type="submit" value="Save" style="margin-left: 137px;width: 70px;height: 30px">
          </form>
         
      </div>
         <div id="footer"> 
Copyright © DRDO,NEW DELHI
</div> 
    
      
      </body>
       <% 
          }
       %>

     </html>
