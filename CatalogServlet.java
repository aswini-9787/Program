import javax.servlet.ServletException;

import javax.servlet.annotation. WebServlet;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/catalog")

public class CatalogServlet extends HttpServlet {

private static final long serialVersionUID = 1L;

@Override

protected void doGet(HttpServletRequest request, HttpServletResponse response)

throws ServletException, IOException {

Cookie[] cookies = request.getCookies();

String username = "Guest";

// Retrieve the username from cookies

if (cookies != null) {

for (Cookie cookie: cookies) {

if (cookie.getName().equals("username")) {

username cookie.getValue();

break;
}
}
}

// Generate dynamic content

response.setContentType("text/html");

response.getWriter().println("<html><head><title>Book

Catalog</title></head><body>"

response.getWriter().println("<h1>Book Catalog</h1>");

response.getWriter().println("<p>Welcome, " + username + "!</p>");

response.getWriter().println("<table border='1'>");

response.getWriter().println("<tr><th>Title</th><th>Author</th><th>Price</th></tr>");

response.getWriter().println("<tr><td>Book One</td><td>Author A</td><td>$10</td></tr>'

response.getWriter().println("<tr><td>Book Two</td><td>Author B</td><td>$15</td></tr>");

response.getWriter().println("<tr><td>Book Three</td><td>Author

C</td><td>$20</td></tr>")
}
}

