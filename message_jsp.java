package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("<head> \n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("</head> \n");
      out.write("<body> \n");
      out.write("<div id=\"gg\"> \n");
      out.write("<h1 style=\"font-family:courier new;color : white;\">DEFENCE RESEARCH AND DEVELOPMENT<br> ORGANISATION-\n");
      out.write("NEW DELHI </h1> \n");
      out.write("    <p style=\"font-family:courier new;color :BLACK;\">(SUMMER TRAINING AND INTERNSHIP PROGRAM)  </p>\n");
      out.write("</div> \n");
      out.write("<div id=\"header\"> \n");
      out.write(" \n");
      out.write("<a href=\"index.html\" id=\"bb\" target=\"_top\"> HOME </a> \n");
      out.write("<a href=\"registration.html\" id=\"bb\"  target=\"_top\"> REGISTRATION </a> \n");
      out.write("<a href=\"login.html\" id=\"bb\" target=\"_top\" >  STUDENT LOGIN </a> \n");
      out.write("<a href=\"admin.html\" id=\"bb\" target=\"_top\">  ADMIN LOGIN </a>\n");
      out.write("</div> \n");
      out.write(" \n");
      out.write("<div id=\"nav\"> \n");
      out.write("    <form name=\"myForm2\" action=\"seedetail.jsp\" >\n");
      out.write("        <input type=\"submit\" value=\"SEE DETAILS\" style=\"width: 177px; height: 50px\" >\n");
      out.write(" </form>\n");
      out.write("     <form name=\"myForm2\" action=\"editdetail.jsp\" >\n");
      out.write("        <input type=\"submit\" value=\"SEE DETAILS\" style=\"width: 177px; height: 50px\" >\n");
      out.write(" </form>\n");
      out.write("\n");
      out.write("\n");
      out.write(" </div> \n");
      out.write("<div id=\"section\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <form name=\"myForm1\" action=\"logout\" align=\"RIGHT\" >\n");
      out.write("       <input type=\"submit\" value=\"LOGOUT\" style=\"width: 155px; height: 50px\" >\n");
      out.write("    </form>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("  <P >Dear candidate,<br>\n");
      out.write(" your have successfully submied your form.You will be soon recieving an <br>\n");
      out.write(" email if you will be selected for the interview .Selection is basically <br>\n");
      out.write(" based on your Resume and Academic result .<br>\n");
      out.write(" Thank you,</p>\n");
      out.write("  <br>\n");
      out.write("  <h>(It is strongly recommended to close the browser after logging out for security reasons.) </h>\n");
      out.write("  \n");
      out.write("  \n");
      out.write(" \n");
      out.write(" </div> \n");
      out.write("\n");
      out.write("<div id=\"footer\"> \n");
      out.write("Copyright © DRDO,NEW DELHI\n");
      out.write("</div> \n");
      out.write(" \n");
      out.write("</body> \n");
      out.write(" \n");
      out.write("</html> \n");
      out.write("\n");
      out.write("\n");
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
