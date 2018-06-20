package cn.itheima.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itheima.domain.Student;
import cn.itheima.service.StudentService;
import cn.itheima.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class ListCustomerServlet
 */
public class ListStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService customerService = new StudentServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet() 
     */
    public ListStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.调用Service查询所有客户
		List<Student> list = customerService.getAll();
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/jsp/student/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
