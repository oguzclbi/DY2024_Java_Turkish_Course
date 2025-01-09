package day18_class_objects.pac_04_HW;

public class BankAccount {
    public double balance;
    public String accountHolder;
    public long accountNumber;

    public String deposit(double amount){

        balance=balance+amount;
        return "Depositing $"+amount+" to "+accountNumber;

    }


    public String withdraw(double amount){

        if (balance>amount){
            balance=balance-amount;
            return "Withdrawing $"+amount+" from "+accountNumber;
        }else {
            return "Insufficient funds in"+accountNumber+" Your balance is: "+balance;
        }



    }


    public void showBalance(){

        System.out.println("Account Holder :"+accountHolder);
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance        :$"+balance);

    }


    public String charge(String item, double price){

        if (balance>price){
            balance=balance-price;
            return "Buying "+item+" for $"+price+" from "+accountNumber;
        }else {
            return "Insufficient funds to purchase an"+item+" from "+accountNumber;
        }

    }





}
