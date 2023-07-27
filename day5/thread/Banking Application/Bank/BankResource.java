public class BankResource {
    private static BankUser[] bankUser = new BankUser[100];
    static {
        User user1 = new User("Ashutosh Tigga", "1 july 1999", 24, "jharkhand", "male");
        bankUser[0] = new BankUser(user1, 11111, 1234, 50000);
    }

    private synchronized  BankUser verify(long accNumber, int pin) {
        for (BankUser user : bankUser) {
            if (user == null) {
                return null;
            }
            if (user.getAcNumber() == accNumber && user.getPin() == pin) {
                return user;
            }
        }
        return null;
    }

    public synchronized static String deposit(long accNumber, double creditMoney, int pin) {
        BankUser bankUser=verify(accNumber, pin);
        if(bankUser==null){
            return "no acccount for this user  ";
        }else{
            double currMoney=bankUser.getTotalMoney()+creditMoney;
            bankUser.setTotalMoney(currMoney);
            return bankUser.toString();
        }

    }

    public synchronized static String withdraw(long accNumber, double depositMoney, int pin) {
        BankUser bankUser=verify(accNumber, pin);
         if(bankUser==null){
            return "no acccount for this user  ";
        }else{
            if(depositMoney<bankUser.getTotalMoney()){
                double currMoney=bankUser.getTotalMoney()-depositMoney;
                bankUser.setTotalMoney(currMoney);
                return bankUser.toString();
            }else{
                return "You don't have suffcient money";
            }
        }
    }

    public void miniStatement(long accNumber, int pin) {

    }

    public synchronized static void showUser() {
        for (BankUser user : bankUser) {
            if (user == null)
                break;
            System.out.println(user);
        }
    }
}
