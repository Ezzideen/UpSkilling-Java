package com.jk.example.jpa;

import java.util.List;

import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.dataaccess.orm.JKObjectDataAccessImpl;

public class JPATest {
        public static void main(String[] args) {
                //Create JPA object
                Student student = new Student();
                student.setNumber("98659859");
                student.setName("mohammad");
                student.setPhone("0788117770");
                student.setAvg(99.0);

                //Create JPA dao
                JKObjectDataAccess dao = new JKObjectDataAccessImpl();

                //insert the object in the database using JPA/Hibernate implementation
                dao.insert(student);
                int id=student.getId();

                //Retrieve list of objects from database using JPA
                List<Student> list = dao.getList(Student.class);
                for (Student std : list) {
                        System.out.println(std);
                }

                //Find an object from database using JPA
                Student std = dao.find(Student.class, id);
                std.setName("Updated Jalal");

                //update record in the databse
                dao.update(std);

                //Delete object from database using an IDE
//                dao.delete(Student.class, id);
        }


}