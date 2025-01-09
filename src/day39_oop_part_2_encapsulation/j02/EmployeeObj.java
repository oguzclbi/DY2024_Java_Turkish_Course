package day39_oop_part_2_encapsulation.j02;

public class EmployeeObj {
    public static void main(String[] args) {

        Employee employee1=new Employee();


        //artık bunu diyemezsin çünkü firstName fieldi Employee classında private
        //employee1.firstName="1234";
        //artık bunu diyemezsin çünkü age fieldi Employee classında private
        //employee1.age=1500;

        employee1.setFirstName("Ahmet");

        employee1.setAge(18);


        //System.out.println(employee1.age);

        System.out.println(employee1.getAge());
        System.out.println(employee1.getFirstName());

        System.out.println(employee1);













    }


}
