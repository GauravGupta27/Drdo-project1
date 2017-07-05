
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletResponse;

public class MailClass 
{
    String userid="sks.themystery";
    String email="sks.themystery@gmail.com";
    String password="9936392291";
    String host="smtp.gmail.com";
    String port="465";
    public int sendMail(String to,String tempid,String port)
    {
        try{
        Properties props=System.getProperties();
        //props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host", host);
        //props.setProperty("mail.transport.protocol", "smtps");
        props.put("mail.smtp.user", userid);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port",port);
        props.put("mail.smtps.auth", "true");
        Session ses=Session.getDefaultInstance(props,
                null);
        InternetAddress toaddress=new InternetAddress(to);
        InternetAddress fromaddress=new InternetAddress(email);
        MimeMessage message=new MimeMessage(ses);
        message.setSubject("Unique No. For login to DRDO Summer Training");
        message.setFrom(fromaddress);
        message.setRecipient(Message.RecipientType.TO, toaddress);
        String content="Welcome Applicant,"
                + "Congratulations you have successfully registered for DRDO Summer Training.Your Unique No For Login is "+tempid+"."
                + "Thanks,"
                + "DRDO,NEW DELHI.";
        message.setContent(content, "text/html; charset=utf-8");
        Transport trans=ses.getTransport("smtps");
        trans.connect(host, userid, password);
        trans.sendMessage(message, message.getAllRecipients());
        trans.close();
        return 1;
        }catch(Exception  e)
        {
            System.out.println(e);
            return 0;
        }
    }
}
