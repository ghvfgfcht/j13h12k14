import java.io.*;
import java.util.StringTokenizer;
public class Main {
   public static void main(String[] args) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
      double a=Double.parseDouble(st.nextToken());
      double b=Double.parseDouble(st.nextToken());
      double v=Double.parseDouble(st.nextToken());
      double cnt=(v-b)/(a-b);
      
      if(cnt>Math.floor(cnt)) {
    	  System.out.println((int)cnt+1);
      }
      else {
    	  System.out.println((int)cnt);
      }
     
   }
}