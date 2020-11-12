package example;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorld_2 extends HttpServlet {
    String message;

    public void init() throws ServletException {
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>" + message +"</h1>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try{
            Connection con = HelloWorld.initializeDatabase();
            int a = 1;
            String b = "123";
            PreparedStatement st = con.prepareStatement("INSERT INTO demo values(?, ?)");

            st.setInt(1, Integer.parseInt(request.getParameter("id")));
            st.setString(2,request.getParameter("string"));

            st.executeUpdate();
            st.close();
            con.close();

            PrintWriter out = response.getWriter();
            out.println("<html><body><b>Successfully Inserted"
                    + "</b></body></html>");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void destroy(){
    }





}
