package day56_method_reference_comparator.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class J02_SortStudentReversed {
    public static void main(String[] args) {

        Student student1=new Student("A","E",5);
        Student student2=new Student("B","D",3);
        Student student3=new Student("C","C",2);
        Student student4=new Student("D","B",4);
        Student student5=new Student("E","A",6);


        List<Student> students =new ArrayList<>(Arrays.asList(student2,student3,student1,student4,student5));

        System.out.println("student = " + students);


                                                //Küçükten büyüğe sırala
        Comparator<Student> sortByStudentNumber=Comparator.comparing(Student::getStudentNumber)
               //Ters çevir
                .reversed()
                ;

        students.sort(sortByStudentNumber);

        System.out.println("Sıralamadan sonra");

        System.out.println("students = " + students);


    }
}
