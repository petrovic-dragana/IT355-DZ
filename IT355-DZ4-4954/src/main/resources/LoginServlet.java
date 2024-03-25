import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Cookie[] cookies = request.getCookies();
        boolean validCredentials = false;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("email") && cookie.getValue().equals(email)) {
                    validCredentials = true;
                    break;
                }
            }
        }

        if (validCredentials && password.equals("password")) {
            response.sendRedirect("home.jsp");
        } else {
            response.getWriter().println("Invalid email or password. Please try again.");
        }
    }
}
