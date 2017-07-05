
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interview extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        int i=0;
        String emails[]=new String[650];
        for(int j=0;j<emails.length;j++)
        {
          emails[j]=" ";  
        }
      //  String e1="abc@gmail.com";
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
        Statement st=con.createStatement();
        String cs="insert into CSITINTERVIEW select name,f_name,dob,e_mail,contactno,0 from (select name,f_name,dob,e_mail,contactno,0 from detail where branch='computer science' ORDER BY overall DESC) where ROWNUM<=150";
        String me="insert into MEINTERVIEW select name,f_name,dob,e_mail,contactno,0 from (select name,f_name,dob,e_mail,contactno,0 from detail where branch='mechanical' ORDER BY overall DESC) where ROWNUM<=100";
        String ece="insert into ECEINTERVIEW select name,f_name,dob,e_mail,contactno,0 from (select name,f_name,dob,e_mail,contactno,0 from detail where branch='electronics' ORDER BY overall DESC) where ROWNUM<=150";
        String ee="insert into EEINTERVIEW select name,f_name,dob,e_mail,contactno,0 from (select name,f_name,dob,e_mail,contactno,0 from detail where branch='electrical' ORDER BY overall DESC) where ROWNUM<=50";
        String ch="insert into CHINTERVIEW select name,f_name,dob,e_mail,contactno,0 from (select name,f_name,dob,e_mail,contactno,0 from detail where branch='chemical' ORDER BY overall DESC) where ROWNUM<=50";
        String ph="insert into PHINTERVIEW select name,f_name,dob,e_mail,contactno,0 from (select name,f_name,dob,e_mail,contactno,0 from detail where branch='physics' ORDER BY overall DESC) where ROWNUM<=150";
        st.executeUpdate("delete from CSITINTERVIEW");
        st.executeUpdate("delete from MEINTERVIEW");
        st.executeUpdate("delete from ECEINTERVIEW");
        st.executeUpdate("delete from EEINTERVIEW");
        st.executeUpdate("delete from CHINTERVIEW");
        st.executeUpdate("delete from PHINTERVIEW");
        st.executeUpdate(cs);
        st.executeUpdate(me);
        st.executeUpdate(ece);
        st.executeUpdate(ee);
        st.executeUpdate(ch);
        st.executeUpdate(ph);
        
        String cs1="select e_mail from CSITINTERVIEW";
        ResultSet rs1=st.executeQuery(cs1);
        while(rs1.next())
        {
         emails[i++]=rs1.getString("e_mail");
        }
        
        String me1="select e_mail from MEINTERVIEW";
        ResultSet rs2=st.executeQuery(me1);
        while(rs2.next())
        {
            emails[i++]=rs2.getString("e_mail");
        }
        
        String ece1="select e_mail from ECEINTERVIEW";
        ResultSet rs3=st.executeQuery(ece1);
        while(rs3.next())
        {
            emails[i++]=rs3.getString("e_mail");
        }
        
        String ee1="select e_mail from EEINTERVIEW";
        ResultSet rs4=st.executeQuery(ee1);
        while(rs4.next())
        {
            emails[i++]=rs4.getString("e_mail");
        }
        
        String ch1="select e_mail from CHINTERVIEW";
        ResultSet rs5=st.executeQuery(ch1);
        while(rs5.next())
        {
            emails[i++]=rs5.getString("e_mail");
        }
        
        String ph1="select e_mail from PHINTERVIEW";
        ResultSet rs6=st.executeQuery(ph1);
        while(rs6.next())
        {
            emails[i++]=rs6.getString("e_mail");
        }
        
        String port=req.getLocalPort()+"";
        String file=getServletContext().getRealPath("/")+"\\uploads\\"+"drdo interview letter.pdf";
        MailClass2 m=new MailClass2();
        int success=m.sendMail(emails,i,port,file);
        PrintWriter pw=resp.getWriter();
        if(success==1){
        pw.println("<html> "
                   + "<body>"
                   + " <h1> INTERVIEW MAIL SENT SUCCESSFULLY !!! </h1> "
                   + "</body> "
                   + "</html>");

        }
        else{
            pw.println("<html> "
                   + "<body>"
                   + " <h1> INTERVIEW MAIL NOT SENT !!! </h1> "
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