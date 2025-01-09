package day40_oop_part_3_inheritance_1.j02;

           //Dog  is an  Animal
public class Dog extends Animal{


    /*  Default Cons
    public Dog(){
    super();
    }
     */

               /*Parent classta cons oluşturmadan önce herhangi bir hata vermiyor. Bunun sebebi
               sub class içerisindeki default cons otomatik olarak Parent class yani super classtaki
               default consu işaret ediyor.
               Fakat parent class ta bir Paramaterized Constructor oluşturduğumuzda program hata veriyor.
               çünkü parent classtan default cons yokoluyor ve sub classlarda bulunan default consların
               işaret ettiği consa ulaşılamıyor(Parent clastakine ulaşulamıyor).
               Bu hatanın iki türlü çözümü var:
               1)Parent classta Paramaterized Constructora ek olarak default consu da manuel olarak eklemek.
               ya da
               2)Sub classlarda Parent classtaki Paramaterized Constructor u işaret eden yeni bir cons yazmak.
               Bunun için hata veren yere mouse ile hover-over yaparsak IDE bize yardımcı oluyor.
                */



               public Dog(String name, String breed, String gender, int age, String color) {
                   super(name, breed, gender, age, color,4);
               }
           }
