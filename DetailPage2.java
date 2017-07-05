    import java.io.IOException;
    import java.io.InputStream;
import java.io.PrintWriter;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;

    import javax.servlet.ServletException;
    import javax.servlet.annotation.MultipartConfig;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
    import javax.servlet.http.Part;

    @WebServlet("/detailpage2")
    @MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
     public class DetailPage2 extends HttpServlet {

     
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     HttpSession ses = request.getSession();
     PrintWriter pw=response.getWriter();
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
         
    String email = request.getParameter("emailid");
      
     Connection con = null; // connection to the database
     String message = null;  // message will be sent back to client

      try {


           Class.forName("oracle.jdbc.driver.OracleDriver");
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
           
        InputStream inputStream1 = null;
        Part filePart1 = request.getPart("photo");
        if (filePart1 != null)
        {
          inputStream1 = filePart1.getInputStream();
        }
         String sql =("update detail set photo=? where e_mail=?");
         PreparedStatement statement1 = con.prepareStatement(sql);
        
        if (inputStream1 != null) {
            statement1.setBinaryStream(1,inputStream1,(int)filePart1.getSize());
        }
         statement1.setString(2, email);
         int row1 = statement1.executeUpdate();
         
        InputStream inputStream2 = null;
        Part filePart2 = request.getPart("resume");
        if (filePart2 != null)
        {
          inputStream2 = filePart2.getInputStream();
        }
         sql =("update detail set resume=? where e_mail=?");
         PreparedStatement statement2 = con.prepareStatement(sql);
        
        if (inputStream2 != null) {
            statement2.setBinaryStream(1,inputStream2,(int)filePart2.getSize());
        }
         statement2.setString(2, email);
         int row2 = statement2.executeUpdate();
        
        InputStream inputStream3 = null;
        Part filePart3 = request.getPart("noc");
        if (filePart3 != null)
        {
          inputStream3 = filePart3.getInputStream();
        }
         sql =("update detail set noc=? where e_mail=?");
         PreparedStatement statement3 = con.prepareStatement(sql);
        
        if (inputStream3 != null) {
            statement3.setBinaryStream(1,inputStream3,(int)filePart3.getSize());
        }
         statement3.setString(2, email);
         int row3 = statement3.executeUpdate();
        
        if (row1 > 0 && row2 > 0 && row3 > 0) {
            //message = "File uploaded and saved into database";
            ses.setAttribute("email", email);
            response.sendRedirect("message.jsp");
        }
      } catch (Exception  ex) {
          message = "ERROR: " + ex.getMessage();
          ex.printStackTrace();
      } finally {
        if (con != null) {
            // closes the database connection
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
      }
     } 
    }
 }
