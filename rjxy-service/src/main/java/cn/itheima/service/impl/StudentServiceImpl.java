package cn.itheima.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itheima.dao.CustomerDao;
import cn.itheima.dao.impl.StudentDaoImpl;
import cn.itheima.domain.Student;
import cn.itheima.service.StudentService;
import cn.itheima.utils.HibernateUtils;

public class StudentServiceImpl implements StudentService {

	private CustomerDao customerDao = new StudentDaoImpl();

	public void save(Student c) {
		//调用Dao保存客户
		customerDao .save(c);
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		Session openSession = HibernateUtils.openSession();
		
		Transaction tx = openSession.beginTransaction();
		List<Student> customers = customerDao.getAll();
		tx.commit();
		return customers;
	}

}
