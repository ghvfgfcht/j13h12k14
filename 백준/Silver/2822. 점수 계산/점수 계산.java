import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, Integer>score=new HashMap<Integer, Integer>();
		for(int i=0;i<8;i++) {
			score.put(Integer.parseInt(br.readLine()),i+1);
		}
		ArrayList<Integer>scorekey=new ArrayList<Integer>(score.keySet());
		Collections.sort(scorekey, Collections.reverseOrder());
		int sum=0;
		int tmp[]=new int[5];
		for(int i=0;i<5;i++) {
			sum+=scorekey.get(i);
			tmp[i]=score.get(scorekey.get(i));
		}
		Arrays.sort(tmp);
		bw.write(sum+"\n");
		for(int i=0;i<5;i++) {
			bw.write(tmp[i]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}