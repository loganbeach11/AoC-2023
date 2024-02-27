package Solutions;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) throws Exception{
        //D4P1();
        D4P2();
    }
    public static void D4P1() throws Exception{
        Scanner c  = new Scanner(new File("data/Day4.txt"));
       // Scanner c  = new Scanner("Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53");
        int total = 0;
        ArrayList<Integer> cur = new ArrayList<>();
        ArrayList<Integer> check = new ArrayList<>();
       int curT;
        for(int i = 0; i<198; i++){
           curT = 0;
           c.next();
           c.next();
           for(int h = 0; h<10; h++){
               check.add(c.nextInt());
               System.out.println(check.get(h));
           }
           System.out.println();
           System.out.print(c.next());
           System.out.println();
           for(int g = 0; g<25; g++){
               cur.add(c.nextInt());
               System.out.println(cur.get(g));
           }
           for(int d = 0; d<cur.size(); d++){
               if(check.indexOf(cur.get(d)) != -1){
                   if(curT == 0){
                       curT = 1;
                   }else{
                       curT *= 2;
                   }
               }
           }
           total += curT;
           check.clear();
           cur.clear();
        }
        System.out.println(total);
        c.close();
    }
    public static void D4P2() throws Exception{
        Scanner c  = new Scanner(new File("data/Day4.txt"));
        // Scanner c  = new Scanner("Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53");
         int total = 0;
         ArrayList<Integer> cur = new ArrayList<>();
         ArrayList<Integer> check = new ArrayList<>();
         ArrayList<Integer> cardCount = new ArrayList<>();
         for(int i = 0; i<198; i++){ //change to 198
            cardCount.add(1);
         }
         System.out.println(cardCount);
        int curT;
         for(int i = 0; i<198; i++){ //chnage to 198
            curT = 0;
            c.next();
            c.next();
            for(int h = 0; h<10; h++){ //change to 10
                check.add(c.nextInt());
                //System.out.println(check.get(h));
            }
            c.next();
            for(int g = 0; g<25; g++){ //change to 25
                cur.add(c.nextInt());
                //System.out.println(cur.get(g));
            }
            int match = 0;
            for(int d = 0; d<cur.size(); d++){
                if(check.indexOf(cur.get(d)) != -1){
                    match+=1;
                    if(curT == 0){
                        curT = 1;
                    }else{
                        curT *= 2;
                    }
                }
            }
            int cur1 = cardCount.get(i);
            System.out.println(cur1);
            for(int  g= i+1; g<i+1+match; g++){
                cardCount.set(g, cardCount.get(g)+(cur1*1));
            }
            for(int d = 0; d<cardCount.get(i); d++){
                total += curT;
            }
            check.clear();
            cur.clear();
            System.out.println(cardCount);
         }
         int total1 = 0;
         for(int a = 0; a<cardCount.size(); a++){
            total1 += cardCount.get(a);
         }
         System.out.println(total1);
         c.close();
     }
    }
    

