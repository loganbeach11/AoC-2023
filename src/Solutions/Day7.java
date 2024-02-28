package Solutions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) throws Exception{
        //D7P1();
    }
    public static void D7P1() throws Exception{
        Scanner c = new Scanner(new File("data/Day7.txt"));
        ArrayList<String> str = new ArrayList<>(Arrays.asList("A","K","Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2"));
        ArrayList<String> types = new ArrayList<>(Arrays.asList("HC", "1P", "2P", "3K", "FH", "4K", "5K"));
        ArrayList<String> hands = new ArrayList<>();
        ArrayList<Integer> bids = new ArrayList<>();
        ArrayList<String> hr = new ArrayList<>();
        ArrayList<Integer> br = new ArrayList<>();
        while(c.hasNextLine()){
            hands.add(c.next());
            bids.add(c.nextInt());
        }
        for(int i = 0; i<hands.size(); i++){
            String curSt = hands.get(i);
            String strength = getHand(curSt);
            for(int k = 0; k<hands.size(); k++){
                if(types.indexOf(getHand(hands.get(k))) > types.indexOf(strength)){
                    curSt = hands.get(k);
                }
            }
            hr.add(0,curSt);
            br.add(0,)
        }
        c.close();
    }
    public static String getHand(String h){
        String type = "";
        String h1 = h;
        ArrayList<Integer> counts = new ArrayList<>();
        ArrayList<String> checked = new ArrayList<>();
        int curcount;
        for(int i = 0; i<h1.length(); i++){
            curcount = 0;
            String cur = h1.substring(i, i+1);
            if(checked.indexOf(cur) == -1){
                for(int g = 0; g<h1.length(); g++){
                    if(cur.equals(h1.substring(g,g+1))){
                        curcount += 1;
                    }
                }
            }
            if(curcount>1){
                counts.add(curcount);
            }
            checked.add(cur);
        }
        if(counts.size() ==1){
            if(counts.get(0) == 5){
                type = "5K";
            }
            if(counts.get(0) == 4){
                type = "4K";
            }
            if(counts.get(0) == 2){
                type = "1P";
            }
            if(counts.get(0) == 3){
                type = "3K";
            }
        }else if(counts.size() ==2){
            if(counts.get(0) ==2 && counts.get(1) ==2){
                type = "2P";
            }else{
                type = "FH";
            }
        }
        

        if(counts.size() == 0){
            type= "HC";
        }
        return type;
    }
    
}
