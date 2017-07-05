
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InterviewResult extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        int i=0;
        String s1=req.getParameter("branch");
        PrintWriter pw=resp.getWriter();
        pw.println("<html>" +
                    "<body>" +
                    "<form name=\"myForm\" action=\"interviewresultupdate\"> \n"+
                    "<h1 align=center>"+s1+"</h1>" +
                    "<input type=\"text\" name=\"branch\" value="+s1+" readonly=\"true\" hidden=\"true\" >" +
                    "<table align=center border=\"1\"> \n" +
                    "<tr> \n" +
                    "<td> \n" +
                    "STUDENT NAME  \n" +
                    "</td>\n" +
                    "<td>FATHER'S NAME\n" +
                    "</td> \n" +
                    "<td>D.O.B\n" +
                    "</td>\n" +
                    "<td>MARKS\n" +
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
        { String marks="marks"+String.valueOf(i);
          String email="email"+String.valueOf(i);
          
          String name=rs.getString("name");
          String fname=rs.getString("f_name");
          String dob=rs.getString("dob");
          String emailid=rs.getString("e_mail");
          String mark=rs.getString("marks");
          
          pw.println("<tr>"
                  + "<td>"+name+"</td>"
                  + "<td>"+fname+"</td>"
                  + "<td>"+dob+"</td>"
                  + "<td><input type=\"number\" name="+marks+" value='"+mark+"' required/></td>"
                  + "<td><input type=\"text\" name="+email+" value="+emailid+" readonly=\"true\" hidden=\"true\" ></td>"
                  + "</tr>");
          i++;
        }
          pw.println("</table>"
                  + "<input type=\"text\" name=\"count\" value="+i+" readonly=\"true\" hidden=\"true\" >"
                  + "<br> <br> <br>"
                  + "<input style=margin-left:700px type=\"submit\" value=\"SUBMIT\" >"
                  + "</form>"
                  + "</body>"
                  + "</html>");
        rs.close();
        st.close();
        con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }   
}