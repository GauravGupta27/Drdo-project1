import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditDetail extends HttpServlet
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
        pst.setString(1,s1);
        pst.setString(2,s2);
        pst.setString(3,s12);
        ResultSet rs=pst.executeQuery();
            if(rs.next())
              {
                st.executeUpdate("update detail set name='"+s1+"',f_name='"+s2+"',m_name='"+s3+"',gender='"+s4+"',dob='"+s5+"',"
                        + "category='"+s6+"',address='"+s7+"',city='"+s8+"',state='"+s9+"',pincode='"+s10+"',"
                        + "contactno='"+s11+"',e_mail='"+s12+"',tenboard='"+s13+"',tenpercent='"+s14+"',twelveboard='"+s15+"',"
                        + "twelvepercent='"+s16+"',college='"+s17+"',collegepercent='"+s18+"',branch='"+s19+"',year='"+s20+"',"
                        + "overall="+s21+" where e_mail='"+s12+"'");
                ses.setAttribute("email", s12);
                resp.sendRedirect("editmessage.jsp");
              }
            else{
                  pw.println("Session Expired,Please Login Again...");
            }
        rs.close();
        st.close();
        pst.close();
        con.close();
        }catch(Exception e)
        {
            System.out.println(e);
            pw.println("<html>"
                    + "<body>"
                    + "<h1> Please ensure that every field is properly filled and then click submit button... </h1>"
                    + "</body>"
                    + "</html>");
        }
    }
  }
}