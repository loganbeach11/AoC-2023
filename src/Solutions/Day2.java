package Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Day2 {
  public static void main(String[] args){
    D2part1();
    D2P2();
  }
    private static void D2part1(){
	    ArrayList<String> D2 = FileReader.readFile("data/Day2.txt");
	    int total = 0;
    	int bmax=14, gmax = 13, rmax =12;
	
	    for(int i = 0; i<D2.size(); i++){
        boolean check = true;
		    String cur = D2.get(i).split(":")[1];
		  String[] set = cur.split(";");
		for(int j = 0; j<set.length; j++){
			  String[] dice = set[j].split(",");
            for(int h = 0; h<dice.length; h++){
                int len = dice[h].length();
                int num = 0;
                if(Character.isDigit(dice[h].charAt(2))){
                 num = Integer.valueOf(dice[h].substring(1,3));
                }else{
                    num = Integer.valueOf(dice[h].substring(1,2));
                }
                if(dice[h].substring(len-4).equals("blue")){
                  if(num>bmax){
                    check = false;
                  }
                }
                if(dice[h].substring(len-3).equals("red")){
                 if(num>rmax){
                    check = false;
                 }
                }
                if(dice[h].substring(len-5).equals("green")){
                 if(num>gmax){
                    check = false;
                 }
                }
            }
		}

		if(check){
            total += i+1;
        }
	}
    System.out.println(total);
  }
  public static void D2P2(){
    ArrayList<String> D2 = FileReader.readFile("data/Day2.txt");
	  int total = 0;
    for(int i = 0; i<D2.size(); i++){
      int curTotal = 0;
      int bmin =0 ,gmin= 0, rmin= 0;
      String cur = D2.get(i).split(":")[1];
		  String[] set = cur.split(";");
		  for(int j = 0; j<set.length; j++){
			  String[] dice = set[j].split(",");
        System.out.println(dice[0]);
        System.out.println(Arrays.toString(dice));
        for(int h = 0; h<dice.length; h++){ 
          int len = dice[h].length();
          int num = 0;
          if(Character.isDigit(dice[h].charAt(2))){
           num = Integer.valueOf(dice[h].substring(1,3));
          }else{
              num = Integer.valueOf(dice[h].substring(1,2));
          }
          if(dice[h].substring(len-4).equals("blue")){
            if(num>bmin){
              bmin = num;
            }
          }
          if(dice[h].substring(len-3).equals("red")){
           if(num>rmin){
              rmin = num;
           }
          }
          if(dice[h].substring(len-5).equals("green")){
           if(num>gmin){
              gmin = num;
           }
          }
        }     
      }
      System.out.println( gmin + " " + rmin + " " + bmin);
      curTotal = bmin * gmin*rmin;
      total += curTotal;
      System.out.println(total);
    }
  }
}

