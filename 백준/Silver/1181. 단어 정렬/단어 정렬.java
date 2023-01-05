import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      String a[]=new String[t];
      for(int i=0;i<t;i++) {
    	  a[i]=sc.next();
      }
      Arrays.sort(a, new Comparator<String>() {
    	  //Arrays.sort가 a배열을 문자 길이 순서로 정렬해주므로 a[0]을 먼저 출력해주고 맨 밑 for문에서 a[1]부터
    	  public int compare(String x, String y) {
    		  if(x.length()==y.length()) {
    			  return x.compareTo(y);
    		  }
    		  else {
    			  return x.length()-y.length(); 
    			  //현재는 오름차순, 반대로 y-x를 하면 내림차순으로 정렬
    		  }
    	  }
      });
      System.out.println(a[0]);
      for(int j=1;j<t;j++) {
    	  if(a[j].equals(a[j-1])==false) { //a[j]의 문자열이 a[j-1]의 문자열과 다르다면!! 중복제거
    		  System.out.println(a[j]);
    	  }
      }
      sc.close();
   }
}