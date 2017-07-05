
import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        HttpSession ses = req.getSession();
        try{
        String s1=req.getParameter("emailid");
        String s2=req.getParameter("password");
        String s3=req.getParameter("uniqueno");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
        String q="select * from registration where e_mail=? and password=? and uniqueno=?";
        PreparedStatement pst=con.prepareStatement(q);
        pst.setString(1, s1);
        pst.setString(2, s2);
        pst.setString(3, s3);
        ResultSet rs=pst.executeQuery();
        boolean b=rs.next();
        
        if(b)
        { 
            String name=rs.getString("name");
            String fname=rs.getString("f_name");
            String dob=rs.getString("dob");
            String email=rs.getString("e_mail");
        
            PreparedStatement ps = con.prepareStatement("select * from detail where e_mail =?");
            ps.setString(1,email);
            ResultSet rs1 = ps.executeQuery();
            boolean c=rs1.next();
            if(c)
            {    
                 Blob photo = rs1.getBlob("photo");
                 Blob resume = rs1.getBlob("resume");
                 Blob noc = rs1.getBlob("noc");
                 if(photo==null || resume==null || noc==null)
               {
                 ses.setAttribute("email",email);
                 resp.sendRedirect("doc.jsp");
               }
                 else 
               {
                ses.setAttribute("email",email);
                resp.sendRedirect("message.jsp");
               }
            }
            else
            {
                ses.setAttribute("name",name);
                ses.setAttribute("fname",fname);
                ses.setAttribute("dob", dob);
                ses.setAttribute("email",email);
                resp.sendRedirect("detailpage.jsp"); 
            }
        }
        else
        {
            resp.sendRedirect("loginfailed.html");
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