package state;

class Client {
    public static void main(String[] args) {
        Account acc = new Account("段誉",0.0);  
        acc.deposit(1000);  
        acc.withdraw(2000);  
        acc.deposit(3000);  
        acc.withdraw(4000);  
        acc.withdraw(1000);  
        acc.computeInterest();

        Switch s1,s2;
        s1=new Switch("开关1");
        s2=new Switch("开关2");

        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();

        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }  
}