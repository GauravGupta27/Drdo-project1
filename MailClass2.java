
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailClass2 
{
    String userid="sks.themystery";
    String email="sks.themystery@gmail.com";
    String password="9936392291";
    String host="smtp.gmail.com";
    String port="465";
    public int sendMail(String emails[],int i,String port,String filename)
    {
        int index1=filename.indexOf("drdo");
      //  int index2=filename.indexOf(".pdf");
        String s=filename.substring(index1);
        
        String to[]=new String[i];
        for(int j=0;j<to.length;j++)
        {
            to[j]=emails[j];
        }
        
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
        //InternetAddress toaddress=new InternetAddress(to);
        //InternetAddress toaddress=new InternetAddress("shubham060694@gmail.com");
         InternetAddress toAddress[] = new InternetAddress[to.length];

         for( int k = 0; k < to.length; k++ ) {
             toAddress[k] = new InternetAddress(to[k]);
         }

        InternetAddress fromaddress=new InternetAddress(email);
        MimeMessage message=new MimeMessage(ses);
        if(s.equalsIgnoreCase("drdo joining letter.pdf"))
        {
        message.setSubject("JOINING Mail For DRDO Summer Training");
        }
        else{
            message.setSubject("INTERVIEW Mail For DRDO Summer Training");
        }
        message.setFrom(fromaddress);
        
       // message.setRecipient(Message.RecipientType.TO, toaddress);
         for( int k = 0; k < toAddress.length; k++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[k]);
            }

        
        String content="Sandhya Bajaj,"
                        + ""
                        + ""
                        + "The content of this email communication are confidential to the addresse."
                        + "If you are not the intended recipient you may not disclose or distribute this communication in any form should immediately contact the sender."
                        + "The information,images,documents and views expressed in this mail are personal to the sender and do not expressly or implicitly represent official position of DRDO."
                        + "No authority exists on behalf of DRDO to make any agreements,or other binding commitment by means of Email. ";
        
        
        BodyPart messageBodyPart = new MimeBodyPart();    
        messageBodyPart.setText(content);           
        Multipart multipart = new MimeMultipart();     
        multipart.addBodyPart(messageBodyPart);    
        messageBodyPart = new MimeBodyPart();
    //  String filename = getServletContext().getRealPath("/")+"uploads\\"+"file.txt";
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(s);
        multipart.addBodyPart(messageBodyPart);
        message.setContent(multipart );

    //  message.setContent(content, "text/html; charset=utf-8");
      
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
