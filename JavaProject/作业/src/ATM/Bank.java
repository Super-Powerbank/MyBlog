package ATM;

import java.util.Arrays;

public class Bank {
    private BankCard[] cards;
    private int size;
    private static final int INITSIZE=10;

    public Bank() {
        this.cards =new BankCard[INITSIZE];
    }

    public BankCard searchCard(int id, int passwd) {
        for (int i=0;i<size;i++){
            if (cards[i].getId()==id&&cards[i].getPasswd()==passwd){
                return cards[i];
            }
        }
        return null;
    }
    public BankCard searchCardid(int id){
        for (int i=0;i<size;i++){
            if (cards[i].getId()==id){
                return cards[i];
            }
        }
        return null;
    }
    public void addCard(int id,int passwd){
        BankCard card=searchCard(id,passwd);
        if (card!=null){
            System.out.println("用户已存在，请直接登录！");
        }else {
            card = new BankCard(id, passwd);
            if (size == cards.length) {
                cards = Arrays.copyOf(cards, cards.length + (cards.length >> 1));
            }
            cards[size] = card;
            size++;
            System.out.println("注册成功请登录！");
        }
    }
}
