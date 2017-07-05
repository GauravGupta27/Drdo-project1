
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InterviewDetail extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {   
        String s1=req.getParameter("branch");
        PrintWriter pw=resp.getWriter();
        pw.println("<html>" +
                    "<body>" +
                    "<h1 align=center>"+s1+"</h1>" +
                    "<table align=center border=\"1\"> \n" +
                    "<tr> \n" +
                    "<td> \n" +
                    "STUDENT NAME  \n" +
                    "</td>\n" +
                    "<td>FATHER'S NAME\n" +
                    "</td> \n" +
                    "<td>D.O.B\n" +
                    "</td>\n" +
                    "<td>EMAIL ID\n" +
                    "\n" +
                    "</td>\n" +
                    "<td>CONTACT NO.\n" +
                    "\n" +
                    "</td>\n" +
                   "<td>PHOTO\n" +
                    "\n" +
                    "</td>\n" +
                    "<td>RESUME\n" +
                    "\n" +
                    "</td>\n" + 
                    "<td>N.O.C\n" +
                    "\n" +
                    "</td>\n" +
                    "\n" +
                   "</tr>");
        
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
        Statement st=con.createStatement();
        String q="select * from "+s1;
        ResultSet rs=st.executeQuery(q);
        while(rs.next())
        {
          String name=rs.getString("name");
          String fname=rs.getString("f_name");
          String dob=rs.getString("dob");
          String email=rs.getString("e_mail");
          String no=rs.getString("contactno");
          
          pw.println("<tr>"
                  + "<td>"+name+"</td>"
                  + "<td>"+fname+"</td>"
                  + "<td>"+dob+"</td>"
                  + "<td>"+email+"</td>"
                  + "<td>"+no+"</td>"
                  + "<td><img width='30' height='40' src=viewphoto?email="+email+" /></td>"
                  + "<td><img width='30' height='40' src=viewresume?email="+email+" /></td>"
                  + "<td><img width='30' height='40' src=viewnoc?email="+email+" /></td>"
                  + "</tr>");
          
        }
          pw.println("</table>\n" +
                     "</body>\n" +
                     "</html>\n");
        rs.close();
        st.close();
        con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }   
}