package com.spring.orm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
 
 @Id
 @Column(name="studnet_id")
 private int id;
 @Column(name="studnet_name")
 private String StudentName;
 @Column(name="studnet_city")
 private String StudentCity;
public Student(int id, String studentName, String studentCity) {
	super();
	this.id = id;
	StudentName = studentName;
	StudentCity = studentCity;
}
 
public Student()
{
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getStudentName() {
	return StudentName;
}

public void setStudentName(String studentName) {
	StudentName = studentName;
}

public String getStudentCity() {
	return StudentCity;
}

public void setStudentCity(String studentCity) {
	StudentCity = studentCity;
}

@Override
public String toString() {
	return "Student [id=" + id + ", StudentName=" + StudentName + ", StudentCity=" + StudentCity + "]";
}

}
