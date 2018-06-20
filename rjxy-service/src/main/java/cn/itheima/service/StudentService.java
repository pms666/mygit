package cn.itheima.service;

import java.util.List;

import cn.itheima.domain.Student;

public interface StudentService {
	//保存客户
	void save(Student c);

	List<Student> getAll();

}
