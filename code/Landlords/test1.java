package Landlords;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.*;

public class test1 {
    static Vector<Integer> library=new Vector<>();
    static Vector<Integer> playerLibrary=new Vector<>();//玩家手牌
    static Vector<Integer> AILibrary1=new Vector<>();//AI1手牌
    static Vector<Integer> AILibrary2=new Vector<>();//AI2手牌
    static Vector<Integer> handLibrary=new Vector<>();//底牌        ♥0 ♦1 ♣2 ♠3
    static boolean gameState=false;

    static void gameReset(){
        String str;
        for(int i=1;i<=13;i++)
            for(int k=0;k<4;k++)
                library.add(i+k*100);
        library.add(14);
        library.add(15);
        Collections.shuffle(library);
//        for(int i=0;i<54;i++){
//            System.out.println(cardPrint(library.get(i)));//洗牌展示
//        }
        for(int i=0;i<54;i++){
            if(i<17) playerLibrary.add(library.get(i));
            else if(i<34) AILibrary1.add(library.get(i));
            else if(i<51) AILibrary2.add(library.get(i));//发牌
            else handLibrary.add(library.get(i));
        }
        Collections.sort(playerLibrary);
        Collections.sort(AILibrary1);
        Collections.sort(AILibrary2);
        for(int i=0;i<17;i++)
            System.out.print(cardPrint(playerLibrary.get(i))+" ");
        System.out.println("\r\n");
        for(int i=0;i<17;i++)
            System.out.print(cardPrint(AILibrary1.get(i))+" ");
        System.out.println("\r\n");
        for(int i=0;i<17;i++)
            System.out.print(cardPrint(AILibrary2.get(i))+" ");
        System.out.println("\r\n");
        for(int i=0;i<3;i++){
            System.out.print(cardPrint(handLibrary.get(i))+" ");//发牌展示
        }
        gameState=true;
    }
    static String cardPrint(Integer str){
        int pattern=str/100;
        switch (pattern){
            case 0:
                switch (str%100){
                    case 1: return "♥A";
                    case 11: return "♥J";
                    case 12: return "♥Q";
                    case 13: return "♥k";
                    case 14: return "小王";
                    case 15: return  "大王";
                    default: return "♥"+str%100;
                }
            case 1:
                switch (str%100){
                    case 1: return "♦A";
                    case 11: return "♦J";
                    case 12: return "♦Q";
                    case 13: return "♦k";
                    case 14: return "小王";
                    case 15: return  "大王";
                    default: return "♦"+str%100;
                }
            case 2:
                switch (str%100){
                    case 1: return "♣A";
                    case 11: return "♣J";
                    case 12: return "♣Q";
                    case 13: return "♣k";
                    case 14: return "小王";
                    case 15: return  "大王";
                    default: return "♣"+str%100;
                }
            case 3:
                switch (str%100){
                    case 1: return "♠A";
                    case 11: return "♠J";
                    case 12: return "♠Q";
                    case 13: return "♠k";
                    case 14: return "小王";
                    case 15: return  "大王";
                    default: return "♠"+str%100;
                }
        }


        return null;
    }
    public static void main(String[] args) {
        gameReset();

        while(gameState){
break;
        }

    }



}
