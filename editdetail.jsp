 <%@page language="java" import="java.sql.*;"%>
 
<%
    Object emailid=session.getAttribute("email");
    if(emailid==null)
    {
        out.println("<html>"
                + "<body>"
                + "<h1> Session Expired !!! </h1>"
                + "<br>"
                + "<h1> Please Login Again... "
                + "</body>"
                + "</html>");
    }
    else
    {
    String email=String.valueOf(emailid);
          String name="";
          String fname="";
          String mname="";
          String gender="";
          String dob="";
          String category="";
          String address="";
          String city="";
          String state="";
          String pincode="";
          String contactno="";
          String e_mail="";
          String tenboard="";
          String tenpercent="";
          String twelveboard="";
          String twelvepercent="";
          String college="";
          String collegepercent="";
          String branch="";
          String year="";
    try {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
          PreparedStatement ps = con.prepareStatement("select * from detail where e_mail =?");
          ps.setString(1,email);
          ResultSet rs1 = ps.executeQuery();
          boolean b=rs1.next();
          name=rs1.getString("name");
          fname=rs1.getString("f_name");
          mname=rs1.getString("m_name");
          gender=rs1.getString("gender");
          dob=rs1.getString("dob");
          category=rs1.getString("category");
          address=rs1.getString("address");
          city=rs1.getString("city");
          state=rs1.getString("state");
          pincode=rs1.getString("pincode");
          contactno=rs1.getString("contactno");
          e_mail=rs1.getString("e_mail");
          tenboard=rs1.getString("tenboard");
          tenpercent=rs1.getString("tenpercent");
          twelveboard=rs1.getString("twelveboard");
          twelvepercent=rs1.getString("twelvepercent");
          college=rs1.getString("college");
          collegepercent=rs1.getString("collegepercent");
          branch=rs1.getString("branch");
          year=rs1.getString("year");
        ps.close();
        con.close();
        }catch (Exception e) {
         e.printStackTrace();
         }
        
 %>
<!DOCTYPE html> 
<html> 
<head> 
    <link href="css.css" rel="stylesheet" type="text/css"/>
</head>
<% 
    if(e_mail.equalsIgnoreCase(""))
    {
        out.println("<body>"
                + "<h1> Session Expired !!! </h1>"
                + "<br>"
                + "<h1> Please Login Again... "
                + "</body>");
    }
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
    
<form name="myForm" action="editdetail"> 
    <h6 style="color: red">* please ensure that every field is properly and correctly field before clicking submit button <br>
               otherwise data inconsistency may occur and your form may get rejected !!! </h6> <hr>
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
FATHER'S NAME : 
</td>
<td><input type="text" name="fathername" value="<%=fname%>" readonly="true" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
MOTHER'S NAME : 
</td>
<td><input type="text" name="mothername" value="<%=mname%>" placeholder="Enter your mothers name" required/> 
 </td>


 <tr> 
<td> 
GENDER:
</td> 
<td> 
    male<input type="radio" name="gender" value="male"> 
 
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
<td><input type="text" name="address" value="<%=address%>" placeholder="Enter your address" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
CITY : 
</td>
<td><input type="text" name="city" value="<%=city%>" placeholder="Enter your city" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
STATE : 
</td>
<td><input type="text" name="state" value="<%=state%>" placeholder="Enter your  state" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
PINCODE : 
</td>
<td><input type="number" name="pincode" value="<%=pincode%>" placeholder="Enter your fathers name" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
CONTACT NO. : 
</td>
<td><input type="number" name="contact" value="<%=contactno%>" placeholder="Enter your mob.no" required/> 
 </td> 
 
</tr> 
<tr> 
<td> 
EMAIL ID :</td> 
<td>  <input type="email" name="emailid"  value="<%=e_mail%>" readonly="true" required/> 
 
</td> 
 
</tr>



<tr>
<td>
10TH BOARD : 
</td>
<td><input type="text" name="ten" value="<%=tenboard%>" placeholder="" required/> 
 </td> 
 
<td>
10TH % : 
</td>
<td><input type="number" name="tenpercent" value="<%=tenpercent%>" placeholder="" required/> 
 </td> 
 
</tr>  
 <tr>
<td>
12TH BOARD : 
</td>
<td><input type="text" name="twelve" value="<%=twelveboard%>" placeholder="" required/> 
 </td> 
 

<td>
12TH % : 
</td>
<td><input type="number" name="twelvepercent" value="<%=twelvepercent%>" placeholder="" required/> 
 </td>
 
<tr>
<td>
COLLEGE NAME : 
</td>
<td><input type="text" name="collage" value="<%=college%>" placeholder="" required/> 
 </td> 
 
<td>
COLLEGE AGGREGATE % : 
</td>
<td><input type="NUMBER" name="collagepercent" value="<%=collegepercent%>" placeholder="" required/> 
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
<input type="submit" value="SUBMIT" style="margin-left: 140px;width: 70px;height: 40px" /> 

</form> 


</div> 


 
<div id="footer"> 
Copyright © DRDO,NEW DELHI
</div> 
 
</body> 
 
</html>
<% 
   }
%>
