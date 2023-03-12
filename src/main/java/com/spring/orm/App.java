package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao sdao=context.getBean("studentDao",StudentDao.class);
        Student st1=new Student();
//        st1.setId(115);
//        st1.setStudentName("Rutik");
//        st1.setStudentCity("Hyderabad");
       // System.out.println(sdao.insert(st1));
        System.out.println(sdao.getStudent(111));
        List<Student> lstu=sdao.getAllStudent();
        for(Student s:lstu)
        	System.out.println(s);
        
       // sdao.delete(113);
        
        //Update
        Student st2=new Student();
        st2.setId(115);
        st2.setStudentName("Rutik");
        st2.setStudentCity("Noida");
        sdao.update(st2);
        
        List<Student> lstu2=sdao.getAllStudent();
        for(Student s2:lstu2)
        	System.out.println(s2);
        
    }
}
