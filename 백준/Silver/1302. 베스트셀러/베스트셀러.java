import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int max=0;
		String res="";
		HashMap<String, Integer>list=new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
			String tmp=br.readLine();	
			if(list.containsKey(tmp)) {
				list.put(tmp, list.get(tmp)+1);
			}
			else {
				list.put(tmp, 1);
			}
		}
		for(String i: list.keySet()) {
			int tmp=list.get(i);
			if(tmp>max) {
				max=tmp;
				res=i;
			}
			else if(tmp==max &&i.compareTo(res)<0) {
				res=i;
			}
			
		}
		bw.write(res+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}