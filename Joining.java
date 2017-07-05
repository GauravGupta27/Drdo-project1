
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Joining extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        int i=0;
        String emails[]=new String[130];
        for(int j=0;j<emails.length;j++)
        {
          emails[j]=" ";  
        }
        // String e1="abc@gmail.com";
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
        Statement st=con.createStatement();
        String cs="insert into JOINING select name,f_name,dob,e_mail,contactno from (select name,f_name,dob,e_mail,contactno from CSITINTERVIEW ORDER BY marks DESC) where ROWNUM<=30";
        String me="insert into JOINING select name,f_name,dob,e_mail,contactno from (select name,f_name,dob,e_mail,contactno from MEINTERVIEW ORDER BY marks DESC) where ROWNUM<=20";
        String ece="insert into JOINING select name,f_name,dob,e_mail,contactno from (select name,f_name,dob,e_mail,contactno from ECEINTERVIEW ORDER BY marks DESC) where ROWNUM<=30";
        String ee="insert into JOINING select name,f_name,dob,e_mail,contactno from (select name,f_name,dob,e_mail,contactno from EEINTERVIEW ORDER BY marks DESC) where ROWNUM<=10";
        String ch="insert into JOINING select name,f_name,dob,e_mail,contactno from (select name,f_name,dob,e_mail,contactno from CHINTERVIEW ORDER BY marks DESC) where ROWNUM<=10";
        String ph="insert into JOINING select name,f_name,dob,e_mail,contactno from (select name,f_name,dob,e_mail,contactno from PHINTERVIEW ORDER BY marks DESC) where ROWNUM<=30";
    
        st.executeUpdate("delete from JOINING");
        st.executeUpdate(cs);
        st.executeUpdate(me);
        st.executeUpdate(ece);
        st.executeUpdate(ee);
        st.executeUpdate(ch);
        st.executeUpdate(ph);
        
        String query="select e_mail from JOINING";
        ResultSet rs1=st.executeQuery(query);
        while(rs1.next())
        {
            emails[i++]=rs1.getString("e_mail");
        }
        
      //  emails = emails + e1;
        
        String port=req.getLocalPort()+"";
        String file=getServletContext().getRealPath("/")+"\\uploads\\"+"drdo joining letter.pdf";
        MailClass2 m=new MailClass2();
        int success=m.sendMail(emails,i,port,file);
        
        PrintWriter pw=resp.getWriter();
        
        if(success==1){
        pw.println("<html> "
                   + "<body>"
                   + " <h1> JOINING MAIL SENT SUCCESSFULLY !!! </h1> "
                   + "</body> "
                   + "</html>");

        }
        else{
            pw.println("<html> "
                   + "<body>"
                   + " <h1> JOINING MAIL NOT SENT !!! </h1> "
                   + "</body> "
                   + "</html>");

        
        }
        
        con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }   
}