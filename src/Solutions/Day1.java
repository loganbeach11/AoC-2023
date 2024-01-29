package Solutions;
import java.util.ArrayList;
public class Day1 {
  public static void main(String[] args) {
	 D1part1();
	 D1part2();
  }

  private static void D1part1(){
	  ArrayList<String> D1 = FileReader.readFile("data/Day1.txt");
	  int total = 0;
	  for(int i =0; i<D1.size(); i++) {
		  String cur = D1.get(i);
		  String num = "";
		  for(int j = 0; j<cur.length(); j++) {
			  if(Character.isDigit(cur.charAt(j))) {
				  num += cur.charAt(j);
			  }
		  }
		  if(num.length() == 1) {
			  num += num;
		  }else {
		    num = num.substring(0,1) + num.substring(num.length()-1);
		  }
		  total += Integer.valueOf(num);
	  }
	  System.out.println(total);
  }
  private static void D1part2() {
	  ArrayList<String> D1 = FileReader.readFile("data/Day1.txt");
	  int total = 0;
	  String[] nums = new String[]{"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	  for(int i = 0; i<D1.size(); i++){
		String cur = D1.get(i); //gtlbhbjgkrb5sixfivefivetwosix
		int num = 0;
		int curTotal = 0;
		
		int min = -1;
		for(int h = 0; h<nums.length; h++){
			if(cur.indexOf(nums[h]) != -1){
				if(min==-1 || cur.indexOf(nums[h])< min){
					num = h;
					min = cur.indexOf(nums[h]);

				}
			}
		}
		for(int j = 0; j<(min==-1?cur.length():min) ;j++){
			if(Character.isDigit(cur.charAt(j))){
				num = Character.getNumericValue(cur.charAt(j));
				break;
			} 
		}
		System.out.println(num);
		curTotal += num * 10;
		
		//back
		int max= -1;
		for(int h = 0; h<nums.length; h++){
			if(cur.lastIndexOf(nums[h]) != -1){
				if(max==-1 || cur.lastIndexOf(nums[h])> max){
					num = h;
					max = cur.lastIndexOf(nums[h]);

				}
			}
		}
		for(int j = cur.length()-1; j>max ;j--){
			if(Character.isDigit(cur.charAt(j))){
				num = Character.getNumericValue(cur.charAt(j));
				break;
			} 
		}
		System.out.println(num);
        curTotal += num;
		System.out.println(curTotal);
		total += curTotal;
	  }
	  System.out.println(total);
 	}
}

