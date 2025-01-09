package day38_static.j03;

public class Cake {

    public static int totalNumberOfSlice=74;
    /*
    yukarı static keywordunu koymazsak Birthday de her
     yeni obej create ettiğimizde herkese 74 dilimlik
     ayrı ayrı yeni pasta oluşturulur. Biz bunu istemiyoruz.
     74 dilimlik tek pasta olsun ve Birthday classında her
     obje create edilip pastadan istedikleri kadar dilim
     yediklerinde bu 74 dilimlik pastadan objelerin yemiş
     olduğu pasta dilimleri düşsün istiyoruz. static keywordunu
     yazdığımızda Cake classından türetilen her bir obje için
     totalNumberOfSlice variablesi aynı yeri ve değeri işaret
     eder. Bu sayede mehmet objesi 1 dilim pasta yerken çağırmış
     olduğumuz eatNumberOfSlice metodu pastanın diliminin azalmasını
     sağlar ve totalNumberOfSlice variablesinin yeni değeri 73 olur.
     arif tekrar eatNumberOfSlice metodunu çağırıp pastadan 1 dilim
     yediğinde totalNumberOfSlice variablesi en son değeri olan 73 üzerinden
     çalışmaya devam eder ve sonuç olarak 72 değerini bize geri döndürür.

     */





    public void eatNumberOfSlice(int sliceNumber) {


        totalNumberOfSlice -= sliceNumber;


    }


}
