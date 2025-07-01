
import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation. WebServlet;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {

private static final long serialVersionUID = 1L;

@Override

protected void doPost(HttpServletRequest request, HttpServletResponse response)

throws ServletException, IOException {

String username = request.getParameter("username");

// Set a cookie to remember the username

Cookie userCookie = new Cookie("username", username);

userCookie.setMaxAge(60*60*24); // 1 day

response.addCookie(userCookie);

response.sendRedirect("catalog");

}

}

