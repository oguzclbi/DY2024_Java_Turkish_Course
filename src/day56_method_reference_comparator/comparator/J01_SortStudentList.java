package day56_method_reference_comparator.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class J01_SortStudentList {
    public static void main(String[] args) {
        Student student1=new Student("A","E",5);
        Student student2=new Student("B","D",3);
        Student student3=new Student("C","C",2);
        Student student4=new Student("D","B",4);
        Student student5=new Student("E","A",6);


        List<Student> students =new ArrayList<>(Arrays.asList(student2,student3,student1,student4,student5));

        System.out.println("student = " + students);


        //Comparator<Student> sortByName=Comparator.comparing(k->k.getFirstName());
        Comparator<Student> sortByFirstName =Comparator.comparing(Student::getFirstName);


        students.sort(sortByFirstName);
        System.out.println("after sort by first name");

        System.out.println(students);


        Comparator<Student> sortByLastName =Comparator.comparing(Student::getLastName);

        students.sort(sortByLastName);
        System.out.println("after sort by last name");
        System.out.println(students);

        Comparator<Student> sortByStudentNumber =Comparator.comparing(Student::getStudentNumber);


        students.sort(sortByStudentNumber);
        System.out.println("after sort by student number");
        System.out.println(students);



    }
}
