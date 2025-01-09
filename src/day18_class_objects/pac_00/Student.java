package day18_class_objects.pac_00;

public class Student {

    public String firstName;
    public String lastName;
    public int age;
    public char gender;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void study(){
        System.out.println(firstName+" ders çalışmak zorunda.");
    }

    /**
     * Static anahtar sözcüğü kullanırsak method classa başvuran tüm nesneler için aynı sonucu üretir
     * ve çağırmak istediğimiz yerden objeismi.courseName şeklinde obje ismiyle
     * .ağırmak yerine direk classismi.courseName şeklinde de çağırabiliriz.
     * Çünkü bu tarz methodlar her obje için atnı genel bir sonuç üretir objeye özel bir
     * sonuç üretmez
     *
     * instance methodlarda yani kişiye objeye ait methodlarda static keyword kullanılmaz.
     * @return
     */
    public static String  courseName(){
        return "Bilginomist";
    }



}
