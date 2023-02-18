import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		HashSet<Integer> list=new HashSet<Integer>();
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		int m=Integer.parseInt(br.readLine());
		int compare[]=new int[m];
		st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<m;i++) {
			compare[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<m;i++) {
			if(list.contains(compare[i])) {
				bw.write("1"+" ");
			}
			else {
				bw.write("0"+" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}