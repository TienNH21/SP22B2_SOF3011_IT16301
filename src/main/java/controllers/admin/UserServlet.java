package controllers.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.form_data.RegisterData;

@WebServlet({
	"/admin/users/index",
	"/admin/users/create",
	"/users/store",
	"/admin/users/edit",
	"/admin/users/update",
	"/admin/users/delete",
	"/admin/users/show",
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
		String uri = request.getRequestURI();
		if (uri.contains("index")) {
			 this.index(request, response);
		} else if (uri.contains("create")) {
			 this.create(request, response);
		} else if (uri.contains("edit")) {
			 this.edit(request, response);
		} else if (uri.contains("show")) {
			 this.show(request, response);
		} else if (uri.contains("delete")) {
			 this.delete(request, response);
		} else {
			// redirect 404
		}
	}

	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if (uri.contains("store")) {
			 this.store(request, response);
		} else if (uri.contains("update")) {
			 this.update(request, response);
		} else {
			// redirect 404
		}
	}

	private void index(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		List<RegisterData> ds = new ArrayList<RegisterData>();
		
		RegisterData obj1 = new RegisterData("A", "HN", 
			"012", "abc@gmail.com", "123456", 1, 0),
		obj2 = new RegisterData("A", "HN", 
			"012", "abc@gmail.com", "123456", 1, 0),
		obj3 = new RegisterData("A", "HN", 
			"012", "abc@gmail.com", "123456", 1, 0);

		ds.add(obj1);
		ds.add(obj2);
		ds.add(obj3);
		
		request.setAttribute("ds", ds);
		request.setAttribute("view",
			"/views/admin/users/index.jsp");
		
		request.getRequestDispatcher("/views/layout.jsp")
			.forward(request, response);
	}

	private void create(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

	private void edit(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

	private void show(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

	private void delete(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

	private void store(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}

	private void update(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
	}
}
