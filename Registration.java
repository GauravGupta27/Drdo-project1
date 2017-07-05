/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shubham060694
 */
@WebServlet(urlPatterns = {"/registration"})
public class Registration extends HttpServlet {

   
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        PrintWriter pw=resp.getWriter();
        try
       {
        String s1=req.getParameter("name");
        String s2=req.getParameter("fathername");
        String s3=req.getParameter("date");
        String s4=req.getParameter("emailid");
        String s5=req.getParameter("pass1");
        String s6=getTempId();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
       // con.setAutoCommit(false);
        Statement st=con.createStatement();
        
      /*  if((st.executeQuery("select * from registration where name='"+s1+"' and f_name='"+s2+"' and dob='"+s3+"'")).next())
        {
            resp.sendRedirect("registrationfailed1.html");
        }
        else */
          if((st.executeQuery("select * from registration where e_mail='"+s4+"'")).next())
        {
            resp.sendRedirect("registrationfailed2.html");
        }
        else
        {
            String port=req.getLocalPort()+"";
            MailClass m=new MailClass();
            int success=m.sendMail(s4,s6,port);
            if(success==1)
            {
             st.executeUpdate("insert into registration values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
             resp.sendRedirect("successfullregistration.html");
            }
            else{
                pw.println("<html> "
                   + "<body>"
                   + " <h4> REGISTRATION was not successful.Server is facing some technical error !!! </h4>"
                        + "<br> "
                        + "<h3> Please Try After Some Time </h3>"
                   + "</body> "
                   + "</html>");

            }
            st.close();
            con.close();
           }
        
       }catch(Exception e)
        {
           // System.out.println(e);
           pw.println(e);
        }
    }   
    String getTempId()
    {
        String s="";
        String r="0123456789";
        int len=r.length();
        for(int i=1;i<=6;i++)
        {
              int index=(int)(len*Math.random());
              s=s+r.charAt(index);
        }
        return s;
    }
    
}
