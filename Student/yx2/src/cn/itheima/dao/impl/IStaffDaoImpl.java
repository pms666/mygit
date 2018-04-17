package cn.itheima.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itheima.dao.IStaffDao;
import cn.itheima.domain.Student;
import cn.itheima.utils.HibernateUtils;

public class IStaffDaoImpl implements IStaffDao {

	public List<Student> queryStudentList() {
		Session session = HibernateUtils.openSession();
		//2 打开事务
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> customers = criteria.list();
		tx.commit();
		return customers;
	}

}
