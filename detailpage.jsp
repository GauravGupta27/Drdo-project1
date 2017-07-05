 <%
    Object name=session.getAttribute("name");
    Object fname=session.getAttribute("fname");
    Object dob=session.getAttribute("dob");
    Object email=session.getAttribute("email");
 %>
<!DOCTYPE html> 
<html> 
<head> 
    <link href="css.css" rel="stylesheet" type="text/css"/>
</head>
<% 
    if(name==null || fname==null || dob==null || email==null)
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
    
<form name="myForm" action="detailpage1"> 
    
<table align=center style="color:black"> 
<tr> 
<td> 
NAME : 
</td>
<td><input type="text" name="name" value="<%=name%>" readonly="true" required/> 
</td> 
</tr>
<tr> 
<td> 
FATHER NAME : 
</td>
<td><input type="text" name="fathername" value="<%=fname%>" readonly="true" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
MOTHER NAME:
</td>
<td><input type="text" name="mothername" placeholder="Enter your mothers name" required/> 
 </td>


 <tr> 
<td> 
GENDER:
</td> 
<td> 
male<input type="radio" name="gender" value="male" checked> 
 
female<input type="radio" name="gender" value="female"> 
</td>
</tr> 
<br>
<tr> 
<td>
D.O.B :
</td> 
<td><input type="text" name="date" value="<%=dob%>" readonly="true" required/> 
 
</td> 
</tr>  
<tr> 
<td> 
 
CATEGORY</td><td> 
<select name="category"> 
<option>--select--</opiton> 
<option>GENRAL</opiton> 
<option>OBC</opiton> 
<option>SC</opiton> 
<option>ST</opiton> 
 
 
</select> 
</td> 

</tr> 

 
 
<tr> 
<td> 
ADDRESS : 
</td>
<td><input type="text" name="address" placeholder="Enter your address" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
CITY : 
</td>
<td><input type="text" name="city" placeholder="Enter your city" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
STATE : 
</td>
<td><input type="text" name="state" placeholder="Enter your  state" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
PINCODE : 
</td>
<td><input type="number" name="pincode" placeholder="Enter your fathers name" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
CONTACT NO. : 
</td>
<td><input type="number" name="contact" placeholder="Enter your mob.no" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
EMAIL ID :</td> 
<td>  <input type="email" name="emailid"  value="<%=email%>" readonly="true" required/> 
 
</td> 
 
</tr>



<tr>
<td>
10TH BOARD : 
</td>
<td><input type="text" name="ten" placeholder="" required/> 
 </td> 
 
<td>
10TH % : 
</td>
<td><input type="number" name="tenpercent" placeholder="" required/> 
 </td> 
 
</tr>  
 <tr>
<td>
12TH BOARD : 
</td>
<td><input type="text" name="twelve" placeholder="" required/> 
 </td> 
 

<td>
12TH % : 
</td>
<td><input type="number" name="twelvepercent" placeholder="" required/> 
 </td>
 
<tr>
<td>
COLLEGE NAME
</td>
<td><input type="text" name="collage" placeholder="" required/> 
 </td> 
 
<td>
COLLEGE AGGREGATE % : 
</td>
<td><input type="NUMBER" name="collagepercent" placeholder="" required/> 
 </td> 

</tr>

<tr> 
<td> 
 
BRANCH :
</td>
<td> 
<select name="branch"> 
<option>--select--</opiton> 
<option value="computer science">COMPUTER SCIENCE/INFORMATION TECHNOLOGY </opiton> 
<option value="mechanical">MECHANICAL ENGG./AERONAUTICAL ENGG.</opiton> 
<option value="electrical">ELECTRICAL ENGG.</opiton> 
<option value="electronics">ELECTRONICS ENGG.</opiton>
<option value="chemical">CHEMICAL ENGG./CHEMISTRY</opiton>
<option value="physics">PHYSICS</opiton>


 
 
</select>
</td> 


</tr> 


<tr> 
<td> 
 
YEAR OF STUDYING</td><td> 
<select name="year"> 
<option>--select--</opiton> 
<option>I </opiton> 
<option>II</opiton> 
<option>III</opiton> 
<option>IV</opiton>
<option>V</opiton>

 
 
</select>
</td> 


</tr> 

</table>
<br>
<input type="submit" value="NEXT" style="margin-left: 140px;width: 70px;height: 40px" /> 

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