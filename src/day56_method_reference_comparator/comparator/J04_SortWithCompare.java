package day56_method_reference_comparator.comparator;

public class J04_SortWithCompare {
    public static void main(String[] args) {

        Student student1=new Student("Arif","Gün",20);
        Student student2=new Student("Sami","Mutlu",23);


        String str1="Acil";
        String str2="Arif";


        //Sami büyük neden alfabede daha sonra geliyor java.lang.Character
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));



        if (str1.toLowerCase().compareTo(str2.toLowerCase())>0){
            System.out.println(str1 + " alfabede daha sonra gelir");
        }else {
            System.out.println(str2 + " alfabede daha sonra gelir");
        }


        System.out.println(student1.getFirstName().toLowerCase().compareTo(student2.getFirstName().toLowerCase()));

        if (student1.getFirstName().toLowerCase().compareTo(student2.getFirstName().toLowerCase())>0){
            System.out.println(student1+" alfabede daha sonra gelir");
        }else {
            System.out.println(student2+" alfabede daha sonra gelir");
        }














    }
}
