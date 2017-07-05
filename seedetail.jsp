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
 
<a href="index.html" id="bb" target="_top"> HOME </a> 
<a href="registration.html" id="bb"  target="_top"> REGISTRATION </a> 
<a href="login.html" id="bb" target="_top" >  STUDENT LOGIN </a> 
<a href="admin.html" id="bb" target="_top" >  ADMIN LOGIN </a>
 
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
<table align=center style="color:black"> 
<tr> 
<td> 
NAME : 
</td>
<td> <%=name%>
</td> 
</tr>
<tr> 
<td> 
FATHER'S NAME : 
</td>
<td> <%=fname%> 
 </td> 
 
</tr> 
<tr> 
<td> 
MOTHER'S NAME : 
</td>
<td> <%=mname%> 
 </td>


 <tr> 
<td> 
GENDER:
</td> 
<td> 
 <%=gender%></td>
</tr> 
<br>
<tr> 
<td>
D.O.B :
</td> 
<td><%=dob%> 
 
</td> 
</tr>  
<tr> 
<td> 
 
CATEGORY</td>
<td> 
    <%=category%>
</td> 

</tr> 

 
 
<tr> 
<td> 
ADDRESS : 
</td>
<td>
    <%=address%>
 </td> 
 
</tr> 
<tr> 
<td> 
CITY : 
</td>
<td>
    <%=city%> 
 </td> 
 
</tr> 
<tr> 
<td> 
STATE : 
</td>
<td>
    <%=state%> 
 </td> 
 
</tr> 
<tr> 
<td> 
PINCODE : 
</td>
<td>
    <%=pincode%> 
 </td> 
 
</tr> 
<tr> 
<td> 
CONTACT NO. : 
</td>
<td><%=contactno%> 
 </td> 
 
</tr> 
<tr> 
<td> 
EMAIL ID :</td> 
<td> <%=e_mail%>
 
</td> 
 
</tr>



<tr>
<td>
10TH BOARD : 
</td>
<td><%=tenboard%>
 </td> 
 
<td>
10TH % : 
</td>
<td><%=tenpercent%> 
 </td> 
 
</tr>  
 <tr>
<td>
12TH BOARD : 
</td>
<td><%=twelveboard%> 
 </td> 
 

<td>
12TH % : 
</td>
<td><%=twelvepercent%> 
 </td>
 
<tr>
<td>
COLLEGE NAME : 
</td>
<td><%=college%> 
 </td> 
 
<td>
COLLAGE AGGREGATE % : 
</td>
<td> <%=collegepercent%> 
 </td> 

</tr>

<tr> 
<td> 
BRANCH :
</td>
<td> 
<%=branch%></td> 
</tr> 


<tr> 
<td> 
 
YEAR OF STUDYING:</td><td> 
 <%=year%></td> 

</tr> 
<tr>
    <td> PHOTO: </td>
    <td><img width='50' height='50' src=viewphoto?email=<%=e_mail%> /></td>
</tr>
<tr>
    <td> RESUME: </td>
    <td><img width='50' height='50' src=viewresume?email=<%=e_mail%> /></td>
</tr>
<tr>
    <td> N.O.C: </td>
    <td><img width='50' height='50' src=viewnoc?email=<%=e_mail%> /></td>
</tr>

</table>

</div> 


 
<div id="footer"> 
Copyright © DRDO,NEW DELHI
</div> 
 
</body>
</html> 
<% 
   }
%>

