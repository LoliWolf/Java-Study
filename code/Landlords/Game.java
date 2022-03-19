package Landlords;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author 张宸玮
 */

public class Game {
    static ArrayList<Card> Library = new ArrayList<>();
    static TreeSet<Card> Playercard = new TreeSet<Card>();
    static TreeSet<Card> AI1card = new TreeSet<Card>();
    static TreeSet<Card> AI2card = new TreeSet<Card>();
    static TreeSet<Card> Handcard = new TreeSet<Card>();
    final static int CARD_NUM = 13;
    final static int EVERY_CARD_NUM = 51;
    final static int MAX_CARD_NUM = 54;

    /**
     * ♠1 ♥2 ♣3 ♦4 king5
     */
    public static void gameReset() {
        for (int i = 1; i <= CARD_NUM; i++) {
            Library.add(new Card("♥", i));
            Library.add(new Card("♦", i));
            Library.add(new Card("♣", i));
            Library.add(new Card("♠", i));
        }
        Library.add(new Card("小王", 14));
        Library.add(new Card("大王", 15));
        Collections.shuffle(Library);
        for (int i = 0; i < EVERY_CARD_NUM; i++) {
            switch (i % 3){
                case 0: {
                    Playercard.add(new Card(Library.get(i).getPattern(), Library.get(i).getNum()));
                    break;
                }
                case 1: {
                    AI1card.add(new Card(Library.get(i).getPattern(), Library.get(i).getNum()));
                    break;
                }
                case 2: {
                    AI2card.add(new Card(Library.get(i).getPattern(), Library.get(i).getNum()));
                    break;
                }
                default:{
                    break;
                }
            }
        }
            for (int i = EVERY_CARD_NUM; i < MAX_CARD_NUM; i++) {
                Handcard.add(new Card(Library.get(i).getPattern(), Library.get(i).getNum()));
            }
    }
    public static void rob(boolean jud){
        if(jud){
            Playercard.addAll(Handcard);
        }
        else{
            Random r=new Random();
            int x=r.nextInt(2);
            if(x==0){
                AI1card.addAll(Handcard);
            }
            else{
                AI2card.addAll(Handcard);
            }
        }
    }
    public static void remove(String setName, String pattern, int num) {
        if ("Playercard".equals(setName)) {
            Iterator<Card> cardIterator = Playercard.iterator();
            while (cardIterator.hasNext()) {
                Card card = cardIterator.next();
                if (card.getPattern().equals(pattern) && card.getNum() == num) {
                    cardIterator.remove();
                    break;
                }
            }
        }
        if ("AI1card".equals(setName)) {
            Iterator<Card> cardIterator = AI1card.iterator();
            while (cardIterator.hasNext()) {
                Card card = cardIterator.next();
                if (card.getPattern().equals(pattern) && card.getNum() == num) {
                    cardIterator.remove();
                    break;
                }
            }
        }
        if ("AI2card".equals(setName)) {
            Iterator<Card> cardIterator = AI2card.iterator();
            while (cardIterator.hasNext()) {
                Card card = cardIterator.next();
                if (card.getPattern().equals(pattern) && card.getNum() == num) {
                    cardIterator.remove();
                    break;
                }
            }
        }
        if ("Handcard".equals(setName)) {
            Iterator<Card> cardIterator = Handcard.iterator();
            while (cardIterator.hasNext()) {
                Card card = cardIterator.next();
                if (card.getPattern().equals(pattern) && card.getNum() == num) {
                    cardIterator.remove();
                    break;
                }
            }
        }
    }




    public static void main(String[] args) {
        gameReset();
        Scanner jud=new Scanner(System.in);
        String j;
        System.out.println("是否抢地主？ Y/N");
        while(jud.hasNext()){
            j=jud.next();
            if("Y".equals(j)){
                rob(true);
                jud.close();
                break;
            }
            else if("N".equals(j)){
                rob(false);
                jud.close();
                break;
            }
            else{
                System.out.println("是否抢地主？ Y/N");
            }
        }

        System.out.println("Playercard:");
        for(Card x:Playercard){
            System.out.println(x.getPattern()+' '+x.getNum());
        }
        System.out.println("AI1card:");
        for(Card x:AI1card){
            System.out.println(x.getPattern()+' '+x.getNum());
        }
        System.out.println("AI2card:");
        for(Card x:AI2card){
            System.out.println(x.getPattern()+' '+x.getNum());
        }
        System.out.println("Handcard:");
        for(Card x:Handcard){
            System.out.println(x.getPattern()+' '+x.getNum());
        }

    }
}
