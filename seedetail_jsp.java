package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class seedetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write(" \n");

    Object emailid=session.getAttribute("email");
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
          tenboard=rs1.getString("10board");
          tenpercent=rs1.getString("10percent");
          twelveboard=rs1.getString("12board");
          twelvepercent=rs1.getString("12percent");
          college=rs1.getString("college");
          collegepercent=rs1.getString("collegepercent");
          branch=rs1.getString("branch");
          year=rs1.getString("year");
        ps.close();
        con.close();
        }catch (Exception e) {
         e.printStackTrace();
         }
        
 
      out.write("\n");
      out.write("<html> \n");
      out.write("<head> \n");
      out.write("<style> \n");
      out.write("body {\n");
      out.write("    background-color: #b0c4de;\n");
      out.write("}\n");
      out.write("a:link {\n");
      out.write("    color: white;\n");
      out.write("    background-color: transparent;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 15px;\n");
      out.write("}\n");
      out.write("a:visited {\n");
      out.write("    color: white;\n");
      out.write("    background-color: transparent;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("    color: white;\n");
      out.write("    background-color: #66CC00;\n");
      out.write("   text-decoration: none;\n");
      out.write("}\n");
      out.write("a:active {\n");
      out.write("    color: green;\n");
      out.write("    background-color:  #66CC00;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("#gg {  \n");
      out.write("   \n");
      out.write("    \n");
      out.write("     margin-top:-22px;\n");
      out.write("      margin-left: 175px;\n");
      out.write("    margin-right: auto;\n");
      out.write("    width:1000px;\n");
      out.write("    height:40px;\n");
      out.write("   \n");
      out.write("    background-color:white;\n");
      out.write("    color:#A9A9A9;\n");
      out.write("    text-align:left;\n");
      out.write("    \n");
      out.write("   \n");
      out.write("}\n");
      out.write("#bb{\n");
      out.write("    padding-top: 0px;\n");
      out.write("    padding-right: 20px;\n");
      out.write("    padding-bottom: 14px;\n");
      out.write("    padding-left:30px;\n");
      out.write("    background-color:#66CC00; \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("}\n");
      out.write(" \n");
      out.write("#header {\n");
      out.write("    background-color:#696969;\n");
      out.write("    \n");
      out.write("    align:centre;\n");
      out.write("    width:1000px;\n");
      out.write("    margin-left: 175px;\n");
      out.write("    margin-right: auto;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("    height:35px;\n");
      out.write("    text-align:left;\n");
      out.write("    font-family:verdana;\n");
      out.write("    font-color:white\n");
      out.write("    \n");
      out.write("}\n");
      out.write("#nav {\n");
      out.write("    line-height:30px;\n");
      out.write("    background-color:#eeeeee;\n");
      out.write("    height:800px;\n");
      out.write("    margin-left:175px;\n");
      out.write("    margin-right: auto;\n");
      out.write("    width:180px;\n");
      out.write("    float:left;\n");
      out.write("    \t      \n");
      out.write("}\n");
      out.write("#section {\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    height:800px;\n");
      out.write("      background-color:white;\n");
      out.write("    width:820px;\n");
      out.write("    float:left;\n");
      out.write("    \t \t \n");
      out.write("}\n");
      out.write("#footer {\n");
      out.write("margin-left: 175px;\n");
      out.write(" width:1000px;\n");
      out.write("    \n");
      out.write("    background-color:#008B8B;\n");
      out.write("    color:white;\n");
      out.write("    clear:both;\n");
      out.write("    text-align:center;\n");
      out.write("   \t \t \n");
      out.write("}\n");
      out.write(" \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body> \n");
      out.write("<div id=\"gg\"> \n");
      out.write("<h1 style=\"font-family:verdana\">DRDO</h1> \n");
      out.write("</div> \n");
      out.write("<div id=\"header\"> \n");
      out.write(" \n");
      out.write("<a href=\"index.html\" id=\"bb\" target=\"_top\"> HOME </a> \n");
      out.write("<a href=\"registration.html\" id=\"bb\"  target=\"_top\"> REGISTRATION </a> \n");
      out.write("<a href=\"login.html\" id=\"bb\" target=\"_top\" >  STUDENT LOGIN </a> \n");
      out.write("<a href=\"admin.html\" id=\"bb\" target=\"_top\" >  ADMIN LOGIN </a>\n");
      out.write(" \n");
      out.write("</div> \n");
      out.write(" \n");
      out.write("<div id=\"nav\"> \n");
      out.write("</div> \n");
      out.write("<div id=\"section\"> \n");
      out.write("<h1 align=\"center\"> \tSTUDENT DETAILS</H1>\n");
      out.write("\n");
      out.write("<table align=center style=\"color:black\"> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("NAME : \n");
      out.write("</td>\n");
      out.write("<td> ");
      out.print(name);
      out.write("\n");
      out.write("</td> \n");
      out.write("</tr>\n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("FATHER'S NAME : \n");
      out.write("</td>\n");
      out.write("<td> ");
      out.print(fname);
      out.write(" \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("MOTHER'S NAME : \n");
      out.write("</td>\n");
      out.write("<td> ");
      out.print(mname);
      out.write(" \n");
      out.write(" </td>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <tr> \n");
      out.write("<td> \n");
      out.write("GENDER:\n");
      out.write("</td> \n");
      out.write("<td> \n");
      out.write(" ");
      out.print(gender);
      out.write("</td>\n");
      out.write("</tr> \n");
      out.write("<br>\n");
      out.write("<tr> \n");
      out.write("<td>\n");
      out.write("D.O.B :\n");
      out.write("</td> \n");
      out.write("<td>");
      out.print(dob);
      out.write(" \n");
      out.write(" \n");
      out.write("</td> \n");
      out.write("</tr>  \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write(" \n");
      out.write("CATEGORY</td>\n");
      out.write("<td> \n");
      out.write("    ");
      out.print(category);
      out.write("\n");
      out.write("</td> \n");
      out.write("\n");
      out.write("</tr> \n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("ADDRESS : \n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("    ");
      out.print(address);
      out.write("\n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("CITY : \n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("    ");
      out.print(city);
      out.write(" \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("STATE : \n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("    ");
      out.print(state);
      out.write(" \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("PINCODE : \n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("    ");
      out.print(pincode);
      out.write(" \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("CONTACT NO. : \n");
      out.write("</td>\n");
      out.write("<td>");
      out.print(contactno);
      out.write(" \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("EMAIL ID :</td> \n");
      out.write("<td> ");
      out.print(e_mail);
      out.write("\n");
      out.write(" \n");
      out.write("</td> \n");
      out.write(" \n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("10TH BOARD : \n");
      out.write("</td>\n");
      out.write("<td>");
      out.print(tenboard);
      out.write("\n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("<td>\n");
      out.write("10TH % : \n");
      out.write("</td>\n");
      out.write("<td>");
      out.print(tenpercent);
      out.write(" \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr>  \n");
      out.write(" <tr>\n");
      out.write("<td>\n");
      out.write("12TH BOARD : \n");
      out.write("</td>\n");
      out.write("<td>");
      out.print(twelveboard);
      out.write(" \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("\n");
      out.write("<td>\n");
      out.write("12TH % : \n");
      out.write("</td>\n");
      out.write("<td>");
      out.print(twelvepercent);
      out.write(" \n");
      out.write(" </td>\n");
      out.write(" \n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("COLLEGE NAME : \n");
      out.write("</td>\n");
      out.write("<td>");
      out.print(college);
      out.write(" \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("<td>\n");
      out.write("COLLAGE AGGREGATE % : \n");
      out.write("</td>\n");
      out.write("<td> ");
      out.print(collegepercent);
      out.write(" \n");
      out.write(" </td> \n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("BRANCH :\n");
      out.write("</td>\n");
      out.write("<td> \n");
      out.print(branch);
      out.write("</td> \n");
      out.write("</tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write(" \n");
      out.write("YEAR OF STUDYING:</td><td> \n");
      out.write(" ");
      out.print(year);
      out.write("</td> \n");
      out.write("\n");
      out.write("</tr> \n");
      out.write("<tr>\n");
      out.write("    <td> PHOTO: </td>\n");
      out.write("    <td><img width='50' height='50' src=viewphoto?email=");
      out.print(e_mail);
      out.write(" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td> RESUME: </td>\n");
      out.write("    <td><img width='50' height='50' src=viewresume?email=");
      out.print(e_mail);
      out.write(" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td> N.O.C: </td>\n");
      out.write("    <td><img width='50' height='50' src=viewnoc?email=");
      out.print(e_mail);
      out.write(" /></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div> \n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<div id=\"footer\"> \n");
      out.write("Copyright © utthan.com\n");
      out.write("</div> \n");
      out.write(" \n");
      out.write("</body> \n");
      out.write("</html> ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}