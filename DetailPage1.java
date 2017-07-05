import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DetailPage1 extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        HttpSession ses = req.getSession();
        PrintWriter pw=resp.getWriter();
     if(ses.getAttribute("email")==null)
    {
        pw.println("<html>"
                + "<body>"
                + "<h1> Session Expired !!! </h1>"
                + "<br>"
                + "<h1> Please Login Again... "
                + "</body>"
                + "</html>");
    }
     else
     {
        try{
        String s1=req.getParameter("name");
        String s2=req.getParameter("fathername");
        String s3=req.getParameter("mothername");
        String s4=req.getParameter("gender");
        String s5=req.getParameter("date");
        String s6=req.getParameter("category");
        String s7=req.getParameter("address");
        String s8=req.getParameter("city");
        String s9=req.getParameter("state");
        String s10=req.getParameter("pincode");
        String s11=req.getParameter("contact");
        String s12=req.getParameter("emailid");
        String s13=req.getParameter("ten");
        String s14=req.getParameter("tenpercent");
        String s15=req.getParameter("twelve");
        String s16=req.getParameter("twelvepercent");
        String s17=req.getParameter("collage");
        String s18=req.getParameter("collagepercent");
        String s19=req.getParameter("branch");
        String s20=req.getParameter("year");
        float f1=Float.parseFloat(s14);
        float f2=Float.parseFloat(s16);
        float f3=Float.parseFloat(s18);
        float s21=(f1+f2+f3)/3;
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
        Statement st=con.createStatement();
        String q="select * from detail where name=? and f_name=? and e_mail=?";
        PreparedStatement pst=con.prepareStatement(q);
        pst.setString(1, s1);
        pst.setString(2, s2);
        pst.setString(3, s12);
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
         resp.sendRedirect("formfillfailed.html");   
        }
        else
        {
            st.executeUpdate("insert into detail values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"','"+s14+"','"+s15+"','"+s16+"','"+s17+"','"+s18+"','"+s19+"','"+s20+"','"+s21+"',null,null,null)");
          //  String s="doc.jsp?emailid="+s12;
            ses.setAttribute("email", s12);
            resp.sendRedirect("doc.jsp");
        }
        rs.close();
        pst.close();
        con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
      }
    }   
}