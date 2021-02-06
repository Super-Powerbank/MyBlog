package ATM;
import java.util.Scanner;

public class ATM {
    private Bank bank;

    public ATM() {
        this.bank=new Bank();
    }
    public void login(){
            System.out.println("请输入账号密码：");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            int passwd = scanner.nextInt();
            BankCard card = bank.searchCard(id, passwd);
            if (card == null) {
                System.out.println("输入错误，请重新输入！");
                return;
            }else {
                System.out.println("登陆成功!");
            }
            while (true) {
                System.out.println("1.存款 2.取款 3.查询余额 4.转账 5.退卡");
                int choice=scanner.nextInt();
                if (choice==5){
                    return;
                }
                switch (choice){
                    case 1:
                        System.out.println("请输入存款金额：");
                        int money=scanner.nextInt();
                        card.saveMoney(money);
                        break;
                    case 2:
                        System.out.println("请输入取款金额：");
                        money=scanner.nextInt();
                        card.transferMoney(money);
                        break;
                    case 3:
                        System.out.println("当前余额："+card.getMoney());
                        break;
                    case 4:
                        System.out.println("请输入转账用户：");
                        int id1=scanner.nextInt();
                        BankCard card1= bank.searchCardid(id1);
                        if (card1==null){
                            System.out.println("用户不存在");
                            break;
                        }else {
                            System.out.println("请输入转账金额：");
                            money=scanner.nextInt();
                            card.transferMoney(money);
                        }
                        break;
                }
            }

    }
    public void register() {
        System.out.println("请输入账号密码：");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        int passwd = scanner.nextInt();
        bank.addCard(id, passwd);
    }
    public void operate(){
        while (true){
            System.out.println("1.登录 2.注册 3.退出");
            Scanner scanner=new Scanner(System.in);
            int choice=scanner.nextInt();
            if (choice==3){
                return;
            }
            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
            }
        }
    }
}

