import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			int one=Integer.parseInt(br.readLine());
			HashSet <Integer>listone=new HashSet<Integer>();
			StringTokenizer st= new StringTokenizer(br.readLine()," ");
			for(int j=0;j<one;j++) {
				listone.add(Integer.parseInt(st.nextToken()));
			}
			int two=Integer.parseInt(br.readLine());
			int check[]=new int[two];
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<two;j++) {
				check[j]=Integer.parseInt(st.nextToken());
			}
			for(int j=0;j<two;j++) {
				if(listone.contains(check[j])) {
					bw.write("1"+"\n");
				}
				else {
					bw.write("0"+"\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}