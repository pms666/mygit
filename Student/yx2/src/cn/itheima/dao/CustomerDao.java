package cn.itheima.dao;

import java.util.List;

import cn.itheima.domain.Student;

public interface CustomerDao {
	//保存客户
	void save(Student c);

	List<Student> getAll();

}
