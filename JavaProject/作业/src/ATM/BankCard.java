package ATM;

public class BankCard {
    private int id;
    private int passwd;
    private int money;

    public BankCard(int id, int passwd) {
        this.id = id;
        this.passwd = passwd;
    }
    public int getId(){
        return id;
    }
    public int getPasswd(){
        return passwd;
    }

    public int getMoney() {
        return money;
    }
    public  void saveMoney(int money){
        this.money+=money;
    }
    public void transferMoney(int money){
        if (this.money>money){
            this.money-=money;
        }else {
            System.out.println("余额不足");
        }
    }

}
