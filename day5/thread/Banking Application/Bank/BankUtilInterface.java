public interface BankUtilInterface {
    void deposit(long accNumber,double debitmoney,int pin);
    void withdraw(long accNumber,double creditMoney,int pin);
    void miniStatement(long accNumber,int pin);
    
}
