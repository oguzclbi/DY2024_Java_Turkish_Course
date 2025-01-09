package day18_class_objects.pac_04_HW;

public class BankAccountClient {
    public static void main(String[] args) {

        BankAccount account1=new BankAccount();
        account1.balance=1000;
        account1.accountHolder="Oğuz ÇELEBİ";
        account1.accountNumber=987654321;

        account1.showBalance();

        System.out.println(account1.deposit(20));
        account1.showBalance();

        System.out.println(account1.withdraw(10));
        account1.showBalance();

        System.out.println(account1.charge("Şırdan", 100));
        account1.showBalance();

        System.out.println(account1.charge("Iphone 15 Pro Max", 1115));
        account1.showBalance();


    }

}
