
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InterviewResultUpdate extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        PrintWriter pw=resp.getWriter();
        try{
        String branch=req.getParameter("branch");
        String c=req.getParameter("count");
        int count=Integer.parseInt(c);
        int marks[]=new int[count];
        String email[]=new String[count];
        for(int i=0;i<count;i++){
            String m="marks"+String.valueOf(i);
            String e="email"+String.valueOf(i);
            marks[i]=Integer.parseInt(req.getParameter(m));
            email[i]=req.getParameter(e);
        }
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
        Statement st=con.createStatement();
        for(int i=0;i<count;i++){
        String q="update "+branch+" set marks="+marks[i]+" where e_mail='"+email[i]+"'";
        st.executeUpdate(q);
        }
        st.close();
        con.close();
        pw.println("<html>"
                + "<body>"
                + "<h1>Interview Marks Successfully Updated</h1>"
                + "</body>"
                + "</html>");
        }catch(Exception e)
        {
            System.out.println(e);
            pw.println("<html>"
                + "<body>"
                + "<h3>Please enter interview marks in every column.Enter 0 in case candidate do not appear for interview...</h3>"
                + "</body>"
                + "</html>");
        
        }
    }   
}