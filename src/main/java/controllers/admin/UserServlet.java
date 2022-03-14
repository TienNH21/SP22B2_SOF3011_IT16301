package controllers.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({
	"/users/index",
	"/users/create",
	"/users/store",
	"/users/edit",
	"/users/update",
	"/users/delete",
	"/users/show",
})
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserServlet() {
        super();
    }

	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

}
