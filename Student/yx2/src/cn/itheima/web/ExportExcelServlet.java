package cn.itheima.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itheima.service.IStaffService;
import cn.itheima.service.impl.StaffServiceImpl;

/**
 * Servlet implementation class exportExcelServlet
 */
public class ExportExcelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IStaffService iStaffService  = new StaffServiceImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExportExcelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 导出所有的数据为Excel数据
		 * @param response
		 */
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		iStaffService.ExportUserList(response);
		/*return;*/
		}

		      
		    
	

}
