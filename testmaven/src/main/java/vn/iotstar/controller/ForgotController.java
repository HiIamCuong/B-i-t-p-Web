package vn.iotstar.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iotstar.models.User;
import vn.iotstar.service.UserService;
import vn.iotstar.service.UserServiceImpl;

import java.io.IOException;

/**
 * Servlet implementation class ForgotController
 */
@WebServlet(urlPatterns = "/forgot")
public class ForgotController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/forgot.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String alertmsg="";
		if(username.isEmpty())
		{
			alertmsg="Tên đăng nhập không được để rỗng";
			req.setAttribute("alert",alertmsg);
			req.getRequestDispatcher("/views/forgot.jsp").forward(req, resp);
			return;
		}
		UserService service=new UserServiceImpl();
		User user=service.forgotpassword(username, password);
		if(user!=null)
		{
			resp.sendRedirect(req.getContextPath()+"/login");
		}
		else
		{
			alertmsg="Tài khoản không tồn tại";
			req.setAttribute("alert",alertmsg);
			req.getRequestDispatcher("/views/forgot.jsp").forward(req, resp);
			return;
		}
	}

}
