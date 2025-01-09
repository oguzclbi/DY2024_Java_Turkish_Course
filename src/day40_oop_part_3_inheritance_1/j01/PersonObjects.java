package day40_oop_part_3_inheritance_1.j01;

import javax.print.Doc;

public class PersonObjects {
    public static void main(String[] args) {

        Student student=new Student();
        student.age=20;
        student.gender="Female";
        student.firstName="Merve";
        student.lastName="XX";
        student.SSN="4154131543135435";


        Teacher teacher=new Teacher();
        teacher.age=30;


        Doctor doctor=new Doctor();
        doctor.address="Yani Mahalle";






    }
}
