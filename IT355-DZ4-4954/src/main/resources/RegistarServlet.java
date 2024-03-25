import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (password.equals(confirmPassword)) {
            Cookie emailCookie = new Cookie("email", email);
            Cookie passwordCookie = new Cookie("password", password);
            emailCookie.setMaxAge(24 * 60 * 60); // 1 day expiration
            passwordCookie.setMaxAge(24 * 60 * 60);
            response.addCookie(emailCookie);
            response.addCookie(passwordCookie);
            response.sendRedirect("home.jsp"); // Preusmeravanje na home.jsp
        } else {
            response.getWriter().println("Passwords do not match. Please try again.");
        }
    }
}
