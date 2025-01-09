package day18_class_objects.pac_00;

public class J00_ClassAndObjects {
    public static void main(String[] args) {

        //Student classından yeni bir obje oluşturduk
        //sami-->referansımız
        Student sami = new Student();

        //Oluşturduğumuz objenin referans ismini kullanarak classın özelliklerini kullanabiliyoruz.
        sami.firstName = "Sami";
        sami.lastName = "Mutlu";
        sami.age = 20;
        sami.gender = 'M';

        //Referansı kullanarak oluşturduğumuz objenin içerisindeki değerlere ulaşabildik
        //Bunu yapabilmek için önce Student classı içerisinde overriding yapmalıyız (SOUT yapabilmek için)
        System.out.println(sami);
        sami.study();

        Student arif = new Student();
        arif.firstName = "Arif";
        arif.lastName = "Gün";
        arif.age = 18;
        arif.gender = 'M';
        System.out.println(arif);
        arif.study();


        //System.out.println(sami.courseName())
        //System.out.println(arif.courseName())

        System.out.printf(Student.courseName());


    }
}
