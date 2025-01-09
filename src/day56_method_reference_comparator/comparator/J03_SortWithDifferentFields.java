package day56_method_reference_comparator.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class J03_SortWithDifferentFields {
    public static void main(String[] args) {

        Student student1=new Student("A","E",5);
        Student student2=new Student("B","D",3);
        Student student3=new Student("A","C",2);
        Student student4=new Student("D","B",4);
        Student student5=new Student("D","A",6);

        List<Student> student=new ArrayList<>(Arrays.asList(student2,student3,student1,student4,student5));

        System.out.println("student = " + student);

        Comparator<Student> sortByFirstNameThenLastName=Comparator

                //Önce firsNameye göre büyükten küçüğe doğru sırala
                .comparing(Student::getFirstName)
                //sonra lastNameye göre sırala.
                .thenComparing(Student::getLastName)
                .thenComparing(Student::getStudentNumber)
                ;

        student.sort(sortByFirstNameThenLastName);

        System.out.println("student = " + student);


    }
}
