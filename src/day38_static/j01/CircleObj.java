package day38_static.j01;

public class CircleObj {

    public static void main(String[] args) {


        Circle circle1=new Circle(5);

        //Circle.pi=3; //Tüm objeler için pi değerini 3 olrak değiştirdik bunu yapmamızı sağlayan yapı
        //variableyi static olarak tanımlamış olmamız. Bu sayede variableye class ismi ile ulaşıp
        //variablenin değerini tüm ojeler için aynı anda değitirebiliyoruz.

        System.out.println(circle1.radius);
        //staikler class ismi ile çağrılır
        System.out.println(circle1.pi); //altının sarı çizilmesinin sebebi
        //static olan variableye obje ismiyle ulaşmak yerine direk class ismiyle ulaşabilirsin
        //diyor. Daha hızlı daha kolay olur diyor.Çünkü bu classtan türetilen tüm objeler için
        // pi variable aynıdır çünkü static olarak tanımlanmıştır. Ayrı ayrı obje isimleriyle
        // bu variableye ulaşmaya çalışmana gerek yok. Tüm sınıf için geçerli ve aynı olan bir
        // variable çağırıyorsun oy uüzde direk sınıf ismi ile çağır diyor.
        //Aşağıdaki gibi;
        //System.out.println(Circle.pi); //3.14


        Circle circle2=new Circle(4);
        System.out.println(circle2.pi);

        //circle1.pi=3; //sen burda sadece circle1 objesinin pi değerini değiştirmek
        //istiyorsun fakat bu bir static variable sen bunu yazdığında ben bütün objelerin
        //değerini güncellerim o yüzden bunu böyle yazmak yerine aşağıdaki gibi yazarsan
        // daha doğru olur. yok eğer sadece circle1 objesinin pi değerini değiştirmek
        //istiyorsan o zaman class içinde pi variablesini static olmaktan çıkarmak zorundasın
        // bu da pi variablesinin mantığına aykırı bir davranış olur. çünkü pi değeri tüm
        //daireler için aynı alınmak zorundadır. Alan hesabında farklı pi ler ile farklı objelere
        //yaptırmak mantıksız olur.
        Circle.pi=3;
        System.out.println("circle1.pi = " + circle1.pi);
        System.out.println("circle2.pi = " + circle2.pi);


    }






}
