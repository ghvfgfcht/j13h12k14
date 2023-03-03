import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		HashMap<String, Integer> list=new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
			String tmp=br.readLine();
			if(list.containsKey(tmp)) {
				list.put(tmp, list.get(tmp)+1);
			}
			else{
				list.put(tmp, 1);
			}
		}
		for(int i=0;i<n-1;i++) {
			String tmp=br.readLine();
			if(list.get(tmp)==1) {
				list.remove(tmp);
			}
			else {
				list.put(tmp, list.get(tmp)-1);
			}
		}
		for(String i:list.keySet()) {
			System.out.println(i+"\n");
		}
		br.close();
	}
}