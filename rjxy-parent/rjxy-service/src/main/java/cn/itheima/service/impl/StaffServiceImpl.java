package cn.itheima.service.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

import cn.itheima.dao.IStaffDao;
import cn.itheima.dao.impl.IStaffDaoImpl;
import cn.itheima.domain.Student;
import cn.itheima.service.IStaffService;

public class StaffServiceImpl implements IStaffService {

	private IStaffDao iStaffDao = new IStaffDaoImpl();
	public void ExportUserList(HttpServletResponse response) {
		//HSSFWorkbook对象(excel的文档对象)  
		HSSFWorkbook workBook=new HSSFWorkbook();
		
		//sheet对象（excel的表单）
		HSSFSheet sheet=workBook.createSheet("学生表信息");
		

		//行数，参数为行索引(excel的行)
		HSSFRow rowHead=sheet.createRow(0);//第一行  可以是0～65535之间的任何一个
		
		//创建excel的单元格，参数为列索引，可以是0～255之间的任何一个 
		HSSFCell cellOne=rowHead.createCell(0);
		cellOne.setCellValue("学生信息");//表头
		
		//合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列  
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,10));
		
		HSSFRow rows=sheet.createRow(1);//第二行
		//创建单元格并设置单元格内容
		rows.createCell(0).setCellValue("评价");
		rows.createCell(1).setCellValue("姓名");
	/*	rows.createCell(1).setCellValue("姓名");
		rows.createCell(2).setCellValue("学号");
		rows.createCell(3).setCellValue("班级");
		rows.createCell(4).setCellValue("联系人");
		rows.createCell(5).setCellValue("电话");
		rows.createCell(6).setCellValue("手机");*/

	
		List<Student> stuList= iStaffDao.queryStudentList();
		
		for(int i=0;i<stuList.size();i++){
			HSSFRow row=sheet.createRow(i+2);//从第三行开始
			//创建单元格并设置单元格内容
			row.createCell(0).setCellValue(stuList.get(i).getName());
			
		/*	row.createCell(1).setCellValue(stuList.get(i).getCust_name());
			row.createCell(2).setCellValue(stuList.get(i).getCust_level());
			row.createCell(3).setCellValue(stuList.get(i).getCust_source());
			row.createCell(4).setCellValue(stuList.get(i).getCust_linkman());
			row.createCell(5).setCellValue(stuList.get(i).getCust_phone());
			row.createCell(6).setCellValue(stuList.get(i).getCust_mobile());*/
	}
		
		
		//输出Excel文件  
		try {
			OutputStream output=response.getOutputStream();
			response.reset();  
			response.setHeader("Content-disposition", "attachment; filename=student.xls");  
			response.setContentType("application/msexcel");          
			workBook.write(output);  
			output.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}      

	}

}
