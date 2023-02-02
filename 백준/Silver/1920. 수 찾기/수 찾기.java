import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{ 
	static int binary(int list[],int key) {
		int st=0;
		int ed=list.length-1;
		int m;
		while(st<=ed) {
			m=(st+ed)/2;
			if(list[m]<key) {
				st=m+1;
			}
			else if(list[m]>key) {
				ed=m-1;
			}
			else if(list[m]==key) {
				return m;
			}
		}
		return -1;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int list[]=new int[n];
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(list);
		int m=Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<m;i++) {
			if(binary(list,Integer.parseInt(st.nextToken()))>=0){
				bw.write("1"+"\n");
			}
			else {
				bw.write("0"+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}