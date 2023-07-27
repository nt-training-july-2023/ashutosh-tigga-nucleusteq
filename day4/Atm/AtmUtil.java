public class AtmUtil {
    private static Atm[] atmUser = new Atm[100];
    static {
        User user1 = new User("Ashutosh Tigga", "1 july 1999", 24, "jharkhand", "male");
        atmUser[0] = new Atm(user1, 11111, 1234, 50000);
    }

    private static Atm verify(long accNumber, int pin) {
        for (Atm atm : atmUser) {
            if (atm == null) {
                return null;
            }
            if (atm.getAcNumber() == accNumber && atm.getPin() == pin) {
                return atm;
            }
        }
        return null;
    }

    public static String deposit(long accNumber, double creditMoney, int pin) {
        Atm atm=verify(accNumber, pin);
        if(atm==null){
            return "no acccount for this user  ";
        }else{
            double currMoney=atm.getTotalMoney()+creditMoney;
            atm.setTotalMoney(currMoney);
            return atm.toString();
        }

    }

    public static String withdraw(long accNumber, double depositMoney, int pin) {
        Atm atm=verify(accNumber, pin);
         if(atm==null){
            return "no acccount for this user  ";
        }else{
            if(depositMoney<atm.getTotalMoney()){
                double currMoney=atm.getTotalMoney()-depositMoney;
                atm.setTotalMoney(currMoney);
                return atm.toString();
            }else{
                return "You don't have suffcient money";
            }
        }
    }

    public void miniStatement(long accNumber, int pin) {

    }

    public static void showUser() {
        for (Atm atm : atmUser) {
            if (atm == null)
                break;
            System.out.println(atm);
        }
    }
}
