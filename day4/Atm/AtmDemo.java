import java.util.Scanner;

public class AtmDemo {
    public static void main(String args[]) {
        AtmUtil util = new AtmUtil();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1 ) Deposit :");
            System.out.println("2 ) Withdraw  :");
            System.out.println("3 ) exit :\n\n");
            System.out.println("Please Select Your choice");

            int opt = sc.nextInt();
            long accNumber;
            int pin;
            double money;
            switch (opt) {
                case 1:
                    System.out.println("please input your account number :");
                    accNumber = sc.nextLong();
                    System.out.println("please input your Pin  :");
                    pin = sc.nextInt();
                    System.out.println("Money You want to desposit :");
                    money = sc.nextDouble();
                    util.deposit(accNumber, money, pin);
                    System.out.println("Thanks for Using Our Service");
                     System.exit(0);
                    break;
                case 2:
                    System.out.println("please input your account number :");
                    accNumber = sc.nextLong();
                    System.out.println("please input your Pin :");
                    pin = sc.nextInt();
                    System.out.println("Money You want to wtihdraw :");
                    money = sc.nextDouble();
                     util.withdraw(accNumber, money, pin);
                     System.out.println("Thanks for Using Our Service");
                    System.exit(0);
                     break;
                case 3:
                    System.exit(0);

                default:
                    break;
            }
        }
    }
}
