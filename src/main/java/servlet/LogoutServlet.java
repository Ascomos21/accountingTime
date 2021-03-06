package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    private static final String VIEW_LOGIN_JSP = "/WEB-INF/view/login.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("logoutMessage", "You are successfully logged out!");
        request.getSession().invalidate();

        request.getRequestDispatcher(VIEW_LOGIN_JSP).forward(request, response);
    }
}
