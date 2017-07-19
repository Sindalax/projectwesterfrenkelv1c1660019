<% page import = "java.sql.*" %>
<%
    String userN = request.getParameter("username");
    String passW = request.getParameter("password");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Jaap", "1234");
    PreparedStatement ps = connection.prepareStatement("SELECT * FROM Administrator WHERE Gebruikersnaam= " + userN + " and Wachtwoord= " + passW + "");
    Resultset rs = ps.executeQuery();
    if (rs.next()){
      session.setAttribute("userN", userN);
      response.sendRedirect("index.jsp");
    }

    else{
      out.println("Verkeerd wachtwoord, probeer opnieuw.");
    }
