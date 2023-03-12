package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.orm.entity.Student;

@Repository
public class StudentDao {
	private HibernateTemplate template;
 
	//Insert Record-Create
@Transactional
public int insert(Student student)
 {
	return (Integer) this.template.save(student); 
 }

//Get a single record-Read
public Student getStudent(int StudentId)
{
	return this.template.get(Student.class,StudentId);
}

//Get All recrods-ReadAll
public List<Student> getAllStudent()
{
	return this.template.loadAll(Student.class);
}
//Updating Record-Update
@Transactional
public void update(Student student)
{
  this.template.update(student);	
}
//Delete a record-Delete
@Transactional
public void delete(int studentId)
{
	Student s=this.template.get(Student.class,studentId);//Get the object by Id & Delete it
	this.template.delete(s);
	System.out.println("Deleted : "+studentId);
}
public HibernateTemplate getTemplate() {
	return template;
}
public void setTemplate(HibernateTemplate template) {
	this.template = template;
}
}
