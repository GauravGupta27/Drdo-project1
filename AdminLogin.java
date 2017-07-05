/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author shubham060694
 */
public class AdminLogin extends HttpServlet {

   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {   
       PrintWriter pw=resp.getWriter();
       String s1=req.getParameter("id");
       String s2=req.getParameter("password");
       if(s1.equalsIgnoreCase("system") && s2.equalsIgnoreCase("12345"))
       {
           resp.sendRedirect("welcomeadmin.html");
       }
       else{
           pw.println("<html> "
                   + "<body>"
                   + " <h1> INVALID CREDENTIALS !!! </hi> "
                   + "</body> "
                   + "</html>");
       }
   }
    
}
