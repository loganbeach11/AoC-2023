package Solutions;
import java.util.ArrayList;
import java.util.Arrays;
public class Day3 {
    public static void main(String[] args){
        D3P1();
        //D3P2();
    }
    private static void D3P1(){
        ArrayList<String> D31 = FileReader.readFile("data/Day3.txt");
        String[][] D3 = new String[140][140];
        for(int i = 0; i<140; i++){//change to 140
            String cur = D31.get(i);
            for(int j = 0; j<140; j++){//change to 140
                D3[i][j] = cur.substring(j, j+1);
            }
        }
        String[] sym = new String[]{"+", "#", "@", "*", "=", "-", "/", "&", "%", "$"};
 
        int total = 0;
        for(int k= 1;k<139; k++){
            String curTotal2 = "";
            boolean flag2 = false;
            int l = 0;
            if(Character.isDigit(D3[k][l].charAt(0))){
                curTotal2 += D3[k][0];
              if(indexOf(D3[k-1][l], sym) != -1 || indexOf(D3[k+1][l],sym) != -1 || indexOf(D3[k][l+1],sym) != -1 || indexOf(D3[k-1][l+1],sym) != -1 || indexOf(D3[k+1][l+1],sym) != -1){
                 flag2 = true;
              }

                 while(Character.isDigit(D3[k][l+1].charAt(0))){
                    l++;
                    curTotal2 += D3[k][l];  
                    if(indexOf(D3[k-1][l], sym) != -1 || indexOf(D3[k+1][l],sym) != -1 || indexOf(D3[k][l+1],sym) != -1 || indexOf(D3[k-1][l+1],sym) != -1 || indexOf(D3[k+1][l+1],sym) != -1){     
                        flag2 = true;
                    }         
                 
              }
            }

            if(flag2){
                total += Integer.valueOf(curTotal2);
            }
            
        }
   
        for(int p= 1;p<139; p++){
                String curTotal3 = "";
                boolean flag3 = false;
                int l = 139;
                if(Character.isDigit(D3[l][p].charAt(0))){
                    curTotal3 += D3[l][p];
                  if(indexOf(D3[l-1][p-1], sym) != -1 || indexOf(D3[l-1][p],sym) != -1 || indexOf(D3[l-1][p+1],sym) != -1 || indexOf(D3[l][p-1],sym) != -1 || indexOf(D3[l][p+1], sym) != -1){
                     flag3 = true;
                  }
                     while(Character.isDigit(D3[l][p+1].charAt(0))){
                        p++;
                        curTotal3 += D3[l][p];  
                        if(indexOf(D3[l-1][p-1], sym) != -1 || indexOf(D3[l-1][p],sym) != -1 || indexOf(D3[l-1][p+1],sym) != -1 || indexOf(D3[l][p-1],sym) != -1 || indexOf(D3[l][p+1], sym) != -1){     
                            flag3 = true;
                        }         
                     
                  }
                }

                if(flag3){
                    total += Integer.valueOf(curTotal3);
                }
                
            }

            for(int p= 1;p<139; p++){
                    String curTotal4 = "";
                    boolean flag4 = false;
                    int l = 0;//
                    if(Character.isDigit(D3[l][p].charAt(0))){
                        curTotal4 += D3[l][p];
                      if(indexOf(D3[l+1][p-1], sym) != -1 || indexOf(D3[l+1][p],sym) != -1 || indexOf(D3[l+1][p+1],sym) != -1 || indexOf(D3[l][p-1],sym) != -1 || indexOf(D3[l][p+1], sym) != -1){
                         flag4 = true;
                      }
                         while(Character.isDigit(D3[l][p+1].charAt(0))){
                            p++;
                            curTotal4 += D3[l][p];  
                            if(indexOf(D3[l+1][p-1], sym) != -1 || indexOf(D3[l+1][p],sym) != -1 || indexOf(D3[l+1][p+1],sym) != -1 || indexOf(D3[l][p-1],sym) != -1 || indexOf(D3[l][p+1], sym) != -1){     
                                flag4 = true;

                            }         
                         
                      }
                    }

                    if(flag4){
                        total += Integer.valueOf(curTotal4);
                    }
                    
                }
                for(int k= 1;k<139; k++){
                        String curTotal5 = "";
                        boolean flag5 = false;
                        int l = 139;
                        if(Character.isDigit(D3[k][l].charAt(0))){
                            curTotal5 = D3[k][l] + curTotal5;
                          if(indexOf(D3[k-1][l], sym) != -1 || indexOf(D3[k+1][l],sym) != -1 || indexOf(D3[k][l-1],sym) != -1 || indexOf(D3[k-1][l-1],sym) != -1 || indexOf(D3[k+1][l-1],sym) != -1){
                             flag5 = true;
                          }
                             while(Character.isDigit(D3[k][l-1].charAt(0))){
                                l--;
                                curTotal5 = D3[k][l] + curTotal5;  
                                if(indexOf(D3[k-1][l], sym) != -1 || indexOf(D3[k+1][l],sym) != -1 || indexOf(D3[k][l-1],sym) != -1 || indexOf(D3[k-1][l-1],sym) != -1 || indexOf(D3[k+1][l-1],sym) != -1){     
                                    flag5 = true;
                                }                                 
                          }
                        }
                        if(flag5){
                            total += Integer.valueOf(curTotal5);
                        }
                        
                    }

       for(int d = 1; d<D3.length-1; d++){//D3.length-2
        for(int s = 1; s<138; s++){//D3[d].length-2
        String curTotal6 = "";
        boolean flag6 = false;
        if(Character.isDigit(D3[d][s].charAt(0))){
            curTotal6 += D3[d][s];
          if(indexOf(D3[d-1][s-1], sym) != -1 || indexOf(D3[d-1][s],sym) != -1 || indexOf(D3[d-1][s+1],sym) != -1 || indexOf(D3[d][s-1],sym) != -1 || indexOf(D3[d][s+1], sym) != -1 || indexOf(D3[d+1][s-1],sym) != -1 || indexOf(D3[d+1][s],sym) != -1|| indexOf(D3[d+1][s+1],sym) != -1){
             flag6 = true;
          }
             while(Character.isDigit(D3[d][s+1].charAt(0)) && s<D3[d].length-2){
                s++;
                if(s==138 && Character.isDigit(D3[d][s+1].charAt(0))){
                    curTotal6= "0";
                }else{
                curTotal6 += D3[d][s];  
                 if(indexOf(D3[d-1][s-1], sym) != -1 || indexOf(D3[d-1][s],sym) != -1 || indexOf(D3[d-1][s+1],sym) != -1 || indexOf(D3[d][s-1],sym) != -1 || indexOf(D3[d][s+1], sym) != -1 || indexOf(D3[d+1][s-1],sym) != -1 || indexOf(D3[d+1][s],sym) != -1|| indexOf(D3[d+1][s+1],sym) != -1){     
                    flag6 = true;
                }     
                if(Character.isDigit(D3[d][0].charAt(0))){
                    if(s==1 || s==2){
                        curTotal6 = "0";
                    }
                }
            } 
          }
        }
    
        if(flag6){
            total += Integer.valueOf(curTotal6);
        }
    }
        
    }
    System.out.println(total); //1747 total=3721
    }  
    public static <T> int indexOf(T needle, T[] haystack)
{
    for (int i=0; i<haystack.length; i++)
    {
        if (haystack[i] != null && haystack[i].equals(needle)
            || needle == null && haystack[i] == null) return i;
    }

    return -1;
}
    public static String[][] D3;
    public static void D3P2() {
        ArrayList<String> D31 = FileReader.readFile("data/Day3.txt");
        D3 = new String[140][140];
        for(int i = 0; i<140; i++){//change to 140
            String cur = D31.get(i);
            for(int j = 0; j<140; j++){//change to 140
                D3[i][j] = cur.substring(j, j+1);
            }
        }
        int total = 0;
        for(int d = 1; d<D3.length-1; d++) {//D3.length-2
            for(int s = 1; s<138; s++) {//D3[d].length-2
                if(D3[d][s].equals("*")) {
                    total += search(s,d);
                }
            }
        }
    }
    public static int search(int x, int y){
        String num1 = null;
        String num2 = null;

        if(D3[y-1][x-1])
            if(num1 != null && num2 != null){
                return (Integer.valueOf(num1) * Integer.valueOf(num2));
            }else{
                return 0;
            }
    }
}
