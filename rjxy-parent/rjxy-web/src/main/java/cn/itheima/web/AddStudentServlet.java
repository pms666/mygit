package cn.itheima.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.itheima.domain.Student;
import cn.itheima.service.StudentService;
import cn.itheima.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentService studentService  = new StudentServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 获得参数并封装到Customer对象
		System.out.println("2222222");
		Student c = new Student();
		try {
			BeanUtils.populate(c, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		//2 调用Service保存客户
		studentService  .save(c);
		//3 重定向到客户列表
		response.sendRedirect(request.getContextPath()+"/ListStudentServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
