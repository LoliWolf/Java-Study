package Landlords;

import com.sun.org.apache.bcel.internal.util.ClassStack;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author 张宸玮
 */

public class Game {
    static ArrayList<Card> Library = new ArrayList<>();
    static ArrayList<Card> Playercard = new ArrayList<Card>();
    static ArrayList<Card> AI1card = new ArrayList<Card>();
    static ArrayList<Card> AI2card = new ArrayList<Card>();
    static TreeSet<Card> Handcard = new TreeSet<Card>();
    static ArrayList<Card> Playcard = new ArrayList<Card>();
    static ArrayList<Card> Lastcard = new ArrayList<Card>();
    static TreeSet<Card> PlayercardSet=new TreeSet<Card>();
    static TreeSet<Card> AI1cardSet=new TreeSet<Card>();
    static TreeSet<Card> AI2cardSet=new TreeSet<Card>();
    final static int CARD_NUM = 13;
    final static int EVERY_CARD_NUM = 51;
    final static int MAX_CARD_NUM = 54;
    final static  String PLAYER = "Player";
    final static  String AI1 = "AI1";
    final static  String AI2 = "AI2";
    static String player=" ";
    static String nextPlayer = "";
    static String dz="";

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
    public static void rob(){
        Scanner jud=new Scanner(System.in);
        System.out.println("是否抢地主？ Y/N");
        while(jud.hasNext()) {
            String j=jud.next();
            if ("Y".equals(j)) {
                Playercard.addAll(Handcard);
//                jud.close();
                nextPlayer=dz="Player";
                break;
            }
            else if("N".equals(j)){
                Random r = new Random();
                int x = r.nextInt(2);
                if (x == 0) {
                    AI1card.addAll(Handcard);
                    nextPlayer=dz="AI1";
                } else {
                    AI2card.addAll(Handcard);
                    nextPlayer=dz="AI2";
                }
//                jud.close();
                break;
            }
            else{
                System.out.println("是否抢地主？ Y/N");
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
    public static boolean judgeIsOk() {
        if (Lastcard.size() == 0) {
            Lastcard.addAll(Playcard);
            Playcard.clear();
            return true;
        }
        for (Card n : Playcard) {
            for (Card m : Lastcard) {
                if (n.getNum() < 14 && n.getNum() > 2) {
                    if (m.getNum() < 14 && m.getNum() > 2) {
                        if (n.getNum() > m.getNum()) {
                            Lastcard.clear();
                            Lastcard.addAll(Playcard);
                            Playcard.clear();
                            return true;
                        } else {
                            Playcard.clear();
                            return false;
                        }
                    } else {
                        Playcard.clear();
                        return false;
                    }
                } else {
                    if (m.getNum() > 2 && m.getNum() < 14) {
                        Lastcard.clear();
                        Lastcard.addAll(Playcard);
                        Playcard.clear();
                        return true;
                    } else {
                        if (n.getNum() > m.getNum()) {
                            Lastcard.clear();
                            Lastcard.addAll(Playcard);
                            Playcard.clear();
                            return true;
                        } else {
                            Playcard.clear();
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    public static void printlnCard(Card s){
        if(s.getNum()>1&&s.getNum()<11){
            System.out.println(s.getPattern()+s.getNum());
        }
        else{
            if(s.getNum()==1){
                System.out.println(s.getPattern()+"A");
            }
            else if(s.getNum()==11){
                System.out.println(s.getPattern()+"J");
            }
            else if(s.getNum()==12){
                System.out.println(s.getPattern()+"Q");
            }
            else if(s.getNum()==13){
                System.out.println(s.getPattern()+"K");
            }
            else if(s.getNum()==14){
                System.out.println("小王");
            }
            else if(s.getNum()==15){
                System.out.println("大王");
            }

        }
    }
    public static void printCard(Card s){
        if(s.getNum()>1&&s.getNum()<11){
            System.out.print(s.getPattern()+s.getNum()+" ");
        }
        else{
            if(s.getNum()==1){
                System.out.print(s.getPattern()+"A ");
            }
            else if(s.getNum()==11){
                System.out.print(s.getPattern()+"J ");
            }
            else if(s.getNum()==12){
                System.out.print(s.getPattern()+"Q ");
            }
            else if(s.getNum()==13){
                System.out.print(s.getPattern()+"K ");
            }
            else if(s.getNum()==14){
                System.out.print("小王 ");
            }
            else if(s.getNum()==15){
                System.out.print("大王 ");
            }

        }
    }
    public static void AIgameStart(){
        switch (nextPlayer){
            case PLAYER:
                nextPlayer=AI1;
                if(player.equals(PLAYER)){
                    Lastcard.clear();
                }
                for(Card n:Playercard){
                    Playcard.add(n);
                    if(judgeIsOk()) {
                        System.out.print(PLAYER + " ");
                        printlnCard(n);
                        remove("Playercard", n.getPattern(), n.getNum());
                        player=PLAYER;
                        break;
                    }
                }
            case AI1:
                nextPlayer=AI2;
                if(player.equals(AI1)){
                    Lastcard.clear();
                }
                for(Card n:AI1card){
                    Playcard.add(n);
                    if(judgeIsOk()) {
                        System.out.print(AI1 + " ");
                        printlnCard(n);
                        remove("AI1card", n.getPattern(), n.getNum());
                        player=AI1;
                        break;
                    }
                }
            case AI2:
                nextPlayer=PLAYER;
                if(player.equals(AI2)){
                    Lastcard.clear();
                }
                for(Card n:AI2card){
                    Playcard.add(n);
                    if(judgeIsOk()) {
                        System.out.print(AI2 + " ");
                        printlnCard(n);
                        remove("AI2card", n.getPattern(), n.getNum());
                        player=AI2;
                        break;
                    }
                }
        }
    }
//    public static void gameStart(){
//        switch (nextPlayer){
//            case PLAYER:
//                PlayercardSet.clear();
//                PlayercardSet.addAll(Playercard);
//                System.out.print("你的手牌为:");
//                int num=1,choose = 0;
//                for(Card card:PlayercardSet){
//                    System.out.print(num+":");
//                    printCard(card);
//                    num++;
//                }
//                System.out.println();
//                System.out.print("你要出的牌(序号）：");
//                Scanner scanner=new Scanner(System.in);
//                if(scanner.hasNext()){
//                    choose=scanner.nextInt();
//                }
//                nextPlayer=AI1;
//                if(player.equals(PLAYER)){
//                    Lastcard.clear();
//                }
//
//                    for(int i=0;i<choose;i++){
//
//                    }
//                    Card n=new Card();
//                    Playcard.add(n);
//                    if(judgeIsOk()) {
//                        System.out.print(PLAYER + " ");
//                        printlnCard(n);
//                        remove("Playercard", n.getPattern(), n.getNum());
//                        player=PLAYER;
//                        break;
//                    }
//
//            case AI1:
//                nextPlayer=AI2;
//                if(player.equals(AI1)){
//                    Lastcard.clear();
//                }
//                for(Card n:AI1card){
//                    Playcard.add(n);
//                    if(judgeIsOk()) {
//                        System.out.print(AI1 + " ");
//                        printlnCard(n);
//                        remove("AI1card", n.getPattern(), n.getNum());
//                        player=AI1;
//                        break;
//                    }
//                }
//            case AI2:
//                nextPlayer=PLAYER;
//                if(player.equals(AI2)){
//                    Lastcard.clear();
//                }
//                for(Card n:AI2card){
//                    Playcard.add(n);
//                    if(judgeIsOk()) {
//                        System.out.print(AI2 + " ");
//                        printlnCard(n);
//                        remove("AI2card", n.getPattern(), n.getNum());
//                        player=AI2;
//                        break;
//                    }
//                }
//        }
//    }
    public static boolean judgeEnd(){
        if(Playercard.size()!=0&&AI1card.size()!=0&&AI2card.size()!=0){
            return true;
        }
        else{
            return false;
        }
    }



    public static void main(String[] args) {
        //初始化
        gameReset();
        //抢地主
        rob();
        System.out.println("地主："+dz);
        System.out.print("地主牌:");
        for(Card s:Handcard){
            printCard(s);
        }
        System.out.println();
        while(judgeEnd()) {
            AIgameStart();
//            gameStart();
        }
        if(PLAYER.equals(dz)){
            if(Playercard.size()==0){
                System.out.println("获胜");
            }
            else{
                System.out.println("失败");
            }
        }
        else{
            if((AI1.equals(dz)&&AI1card.size()==0)||(AI2.equals(dz)&&AI2card.size()==0)){
                System.out.println("失败");
            }
            else{
                System.out.println("获胜");
            }
        }

        PlayercardSet.addAll(Playercard);
        AI1cardSet.addAll(AI1card);
        AI2cardSet.addAll(AI2card);
        System.out.println("Playercard:");
        for(Card x:PlayercardSet){
            printCard(x);
        }
        System.out.println();
        System.out.println("AI1card:");
        for(Card x:AI1cardSet){
            printCard(x);
        }
        System.out.println();
        System.out.println("AI2card:");
        for(Card x:AI2cardSet){
            printCard(x);
        }
        System.out.println();
        System.out.println("Handcard:");
        for(Card x:Handcard){
            printCard(x);
        }

    }
}
