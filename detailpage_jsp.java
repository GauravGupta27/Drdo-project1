package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detailpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');

    Object name=session.getAttribute("name");
    Object fname=session.getAttribute("fname");
    Object dob=session.getAttribute("dob");
    Object email=session.getAttribute("email");
 
      out.write("\n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html> \n");
      out.write("<head> \n");
      out.write("    <link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
 
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

      out.write("\n");
      out.write("\n");
      out.write("<body> \n");
      out.write("    <div id=\"gg\"> \n");
      out.write("<h1 style=\"font-family:courier new;color : white;\">DEFENCE RESEARCH AND DEVELOPMENT<br> ORGANISATION-\n");
      out.write("NEW DELHI </h1> \n");
      out.write("    <p style=\"font-family:courier new;color :BLACK;\">(SUMMER TRAINING AND INTERNSHIP PROGRAM)  </p>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<div id=\"header\"> \n");
      out.write(" \n");
      out.write("<a href=\"index.html\" id=\"bb\" target=\"_top\" > HOME </a> \n");
      out.write("<a href=\"registration.html\" id=\"bb\"  target=\"_top\"> REGISTRATION </a> \n");
      out.write("<a href=\"login.html\" id=\"bb\" target=\"_top\">  STUDENT LOGIN </a> \n");
      out.write("<a href=\"admin.html\" id=\"bb\" target=\"_top\" style=\"background-color :#66CC00;\">  ADMIN LOGIN </a>\n");
      out.write("</div> \n");
      out.write(" \n");
      out.write("<div id=\"nav\">\n");
      out.write("\n");
      out.write(" \n");
      out.write("</div> \n");
      out.write(" \n");
      out.write("<div id=\"section\"> \n");
      out.write("<h1 align=\"center\">STUDENT DETAILS</H1>\n");
      out.write("<form name=\"myForm1\" action=\"logout\" align=\"RIGHT\" >\n");
      out.write("    <input type=\"submit\" value=\"LOGOUT\" >\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form name=\"myForm\" action=\"detailpage1\"> \n");
      out.write("    \n");
      out.write("<table align=center style=\"color:black\"> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("NAME : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" readonly=\"true\" required/> \n");
      out.write("</td> \n");
      out.write("</tr>\n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("FATHER'S NAME : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"text\" name=\"fathername\" value=\"");
      out.print(fname);
      out.write("\" readonly=\"true\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("MOTHER'S NAME : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"text\" name=\"mothername\" placeholder=\"Enter your mothers name\" required/> \n");
      out.write(" </td>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <tr> \n");
      out.write("<td> \n");
      out.write("GENDER:\n");
      out.write("</td> \n");
      out.write("<td> \n");
      out.write("male<input type=\"radio\" name=\"gender\" value=\"male\" checked> \n");
      out.write(" \n");
      out.write("female<input type=\"radio\" name=\"gender\" value=\"female\"> \n");
      out.write("</td>\n");
      out.write("</tr> \n");
      out.write("<br>\n");
      out.write("<tr> \n");
      out.write("<td>\n");
      out.write("D.O.B :\n");
      out.write("</td> \n");
      out.write("<td><input type=\"text\" name=\"date\" value=\"");
      out.print(dob);
      out.write("\" readonly=\"true\" required/> \n");
      out.write(" \n");
      out.write("</td> \n");
      out.write("</tr>  \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write(" \n");
      out.write("CATEGORY</td><td> \n");
      out.write("<select name=\"category\"> \n");
      out.write("<option>--select--</opiton> \n");
      out.write("<option>GENRAL</opiton> \n");
      out.write("<option>OBC</opiton> \n");
      out.write("<option>SC</opiton> \n");
      out.write("<option>ST</opiton> \n");
      out.write(" \n");
      out.write(" \n");
      out.write("</select> \n");
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
      out.write("<td><input type=\"text\" name=\"address\" placeholder=\"Enter your address\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("CITY : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"text\" name=\"city\" placeholder=\"Enter your city\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("STATE : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"text\" name=\"state\" placeholder=\"Enter your  state\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("PINCODE : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"number\" name=\"pincode\" placeholder=\"Enter your fathers name\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("CONTACT NO. : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"number\" name=\"contact\" placeholder=\"Enter your mob.no\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr> \n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write("EMAIL ID :</td> \n");
      out.write("<td>  <input type=\"email\" name=\"emailid\"  value=\"");
      out.print(email);
      out.write("\" readonly=\"true\" required/> \n");
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
      out.write("<td><input type=\"text\" name=\"ten\" placeholder=\"\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("<td>\n");
      out.write("10TH % : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"number\" name=\"tenpercent\" placeholder=\"\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("</tr>  \n");
      out.write(" <tr>\n");
      out.write("<td>\n");
      out.write("12TH BOARD : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"text\" name=\"twelve\" placeholder=\"\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("\n");
      out.write("<td>\n");
      out.write("12TH % : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"number\" name=\"twelvepercent\" placeholder=\"\" required/> \n");
      out.write(" </td>\n");
      out.write(" \n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("COLLAGE NAME : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"text\" name=\"collage\" placeholder=\"\" required/> \n");
      out.write(" </td> \n");
      out.write(" \n");
      out.write("<td>\n");
      out.write("COLLAGE AGGREGATE % : \n");
      out.write("</td>\n");
      out.write("<td><input type=\"NUMBER\" name=\"collagepercent\" placeholder=\"\" required/> \n");
      out.write(" </td> \n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write(" \n");
      out.write("BRANCH :\n");
      out.write("</td>\n");
      out.write("<td> \n");
      out.write("<select name=\"branch\"> \n");
      out.write("<option>--select--</opiton> \n");
      out.write("<option value=\"computer science\">COMPUTER SCIENCE/INFORMATION TECHNOLOGY </opiton> \n");
      out.write("<option value=\"mechanical\">MECHANICAL ENGG./AERONAUTICAL ENGG.</opiton> \n");
      out.write("<option value=\"electrical\">ELECTRICAL ENGG.</opiton> \n");
      out.write("<option value=\"electronics\">ELECTRONICS ENGG.</opiton>\n");
      out.write("<option value=\"chemical\">CHEMICAL ENGG./CHEMISTRY</opiton>\n");
      out.write("<option value=\"physics\">PHYSICS</opiton>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</select>\n");
      out.write("</td> \n");
      out.write("\n");
      out.write("\n");
      out.write("</tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("<tr> \n");
      out.write("<td> \n");
      out.write(" \n");
      out.write("YEAR OF STUDYING</td><td> \n");
      out.write("<select name=\"year\"> \n");
      out.write("<option>--select--</opiton> \n");
      out.write("<option>I </opiton> \n");
      out.write("<option>II</opiton> \n");
      out.write("<option>III</opiton> \n");
      out.write("<option>IV</opiton>\n");
      out.write("<option>V</opiton>\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</select>\n");
      out.write("</td> \n");
      out.write("\n");
      out.write("\n");
      out.write("</tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<input type=\"submit\" value=\"NEXT\" align=\"center\" /> \n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</form> \n");
      out.write("\n");
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
 
   }

      out.write("\n");
      out.write(" \n");
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
