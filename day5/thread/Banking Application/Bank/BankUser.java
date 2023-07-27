public class BankUser   {
    
    private User user;
    private long acNumber;
    private int pin;
    private double totalMoney;

    @Override
    public String toString() {
        return "AtmUtil [user=" + user + ", acNumber=" + acNumber + ", pin=" + pin + ", totalMoney=" + totalMoney + "]";
    }

   

    public BankUser(User user, long acNumber, int pin, double totalMoney) {
        this.user = user;
        this.acNumber = acNumber;
        this.pin = pin;
        this.totalMoney = totalMoney;
    }

    public BankUser() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(long acNumber) {
        this.acNumber = acNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

}
