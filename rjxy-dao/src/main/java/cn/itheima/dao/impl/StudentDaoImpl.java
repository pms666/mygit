package cn.itheima.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itheima.dao.CustomerDao;
import cn.itheima.domain.Student;
import cn.itheima.utils.HibernateUtils;

public class StudentDaoImpl implements CustomerDao {

	public void save(Student c) {
		//1 获得session
		Session session = HibernateUtils.openSession();
		//2 打开事务
		Transaction tx = session.beginTransaction();
		//3 执行保存
		session.save(c);
	/*	Customer customer = new Customer();
		customer.setCust_name("盘名声");
		session.save(customer);*/
		//4 提交事务
		tx.commit();
		//5 关闭资源
		session.close();
		
	}

	public List<Student> getAll() {
		Session session = HibernateUtils.openSession();
		//2 打开事务
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> customers = criteria.list();
		tx.commit();
		return customers;
	}

}
