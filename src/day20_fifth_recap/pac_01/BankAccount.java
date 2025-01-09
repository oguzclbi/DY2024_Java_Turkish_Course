package day20_fifth_recap.pac_01;

public class BankAccount {
    public double balance;
    public String accountHolder;
    public long accountNumber;

    public void deposit(double amount){

        balance=balance+amount;
        System.out.println(accountNumber+" no'lu hesabınıza "+amount+"TL yatırdınız. Yeni bakiye: "+balance+"TL");

    }


    public void withdraw(double amount){

        if (amount>balance){
            System.out.println("Yetersiz Bakiye. Hesabınızda " + balance+"TL var.");
        }else {

            balance=balance-amount;
            System.out.println(accountNumber+" no'lu hesabınızdan "+amount+"TL çektiniz. Hesabınızda kalan tutar: " + balance+"TL");
        }



    }


    public void showBalance(){

        System.out.println("Hesap Sahibi   :"+accountHolder);
        System.out.println("Hesap Numarası :"+accountNumber);
        System.out.println("Bakiye         :"+balance+"TL");

    }


    public void charge(String item, double price){

        if (price>balance){
            System.out.println(item+"için yetersiz bakiye. Hesabınızda " + balance+"TL var.");
        }else {
            balance=balance-price;
            System.out.println(item + " için " + price + "TL ödediniz. Hesabınızda kalan tutar: " + balance+"TL");

        }

    }





}
