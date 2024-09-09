package testmaven.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/home","/trang chu"})
public class Homecontroller extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3779139698615888070L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
//		String ten=req.getParameter("ten");
//		PrintWriter printW = resp.getWriter();
//		//printW.println("<h1>HelloWrod</h1>");
//		printW.println(ten);
//		printW.close();
		//Nhận dữ liệu từ request URL
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");

		req.setAttribute("ten1", ten);
		
//		//Hiển thị dữ liệu ra web bằng đối tượng PrintWriter
//		 PrintWriter out = resp.getWriter();
//		 out.println(ten+" "+holot);
//		 out.close();
		
		RequestDispatcher rd=req.getRequestDispatcher("/views/home.jsp");
		rd.forward(req, resp);

	} @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		
		
		req.setAttribute("ten1", ten);
		req.setAttribute("ten2", holot);
		
		RequestDispatcher rd=req.getRequestDispatcher("/views/home.jsp");
		rd.forward(req, resp);
	}
}
