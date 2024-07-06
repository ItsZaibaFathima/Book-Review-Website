import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String un = request.getParameter("User");
        String pw = request.getParameter("Pass");
        if (un.equals("User") && pw.equals("Pass")) {
            response.sendRedirect("pages/books.html");
        } else {
            out.println("Invalid");
        }
    }
}