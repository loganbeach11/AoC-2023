package Solutions;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) throws Exception{
        //D6P1();
        D6P2();
    }
    public static void D6P1() throws Exception{
        Scanner c = new Scanner(new File("data/Day6.txt"));
        ArrayList<Double> t = new ArrayList<>();
        ArrayList<Double> d = new ArrayList<>();
        ArrayList<Double> totals = new ArrayList<>();
        int total;
        System.out.println(c.next());
        for(int i = 0; i<4; i++){ //change to 4
            t.add(c.nextDouble());
        }
        c.next();
        for(int h = 0; h<4; h++){ //change to 4
            d.add(c.nextDouble());
        }
        for(int i = 0; i<t.size(); i++){
        total = 0;
            double time = t.get(i);
            double dis = d.get(i);
            double cur = 0;
            for(int s = 0; s<=time; s++){
                cur = 0;
                for(int u = time-s; u>0; u--){
                    cur += s;
                }
                if(cur>dis){
                    total += 1;
                }
            }
            totals.add(total);
            int tot = 1;
            for(int p = 0; p<totals.size(); p++){
                tot *= totals.get(p);
            }
            System.out.println(tot);
            c.close();
        }
    }
    public static void D6P2() throws Exception{
        Scanner c = new Scanner(new File("data/Day6P2.txt"));
        ArrayList<Integer> t = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        ArrayList<Integer> totals = new ArrayList<>();
        int total;
        System.out.println(c.next());
        for(int i = 0; i<1; i++){ //change to 4
            t.add(c.nextInt());
        }
        c.next();
        for(int h = 0; h<1; h++){ //change to 4
            d.add(c.nextInt());
        }
        for(int i = 0; i<t.size(); i++){
        total = 0;
            int time = t.get(i);
            int dis = d.get(i);
            int cur = 0;
            for(int s = 0; s<=time; s++){
                cur = 0;
                for(int u = time-s; u>0; u--){
                    cur += s;
                }
                if(cur>dis){
                    total += 1;
                }
            }
            totals.add(total);
            System.out.println(total);
        }
    }
}
