import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
	
	public Main() {
		
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PrintWriter pw;
		Main ppal = new Main();
		
		try {
			pw = new PrintWriter("./data/result.txt");
			int cases = Integer.parseInt(br.readLine());
			String line = "";
			int i = 0;
			while (line != null && i < cases) {
				line = br.readLine();
				if (line != null) {
					String result = ppal.solveHanoiStart(line);
					//System.out.println(result);
					pw.println(result + "\n");
				}
				i++;
			}
			br.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String solveHanoiStart(String discs) {
		int n = Integer.parseInt(discs);
		String result = solveHanoi(n, n, 0, 0);
		//System.out.println(result + "\nSAPE!");
		return result;
	}
	


	public String solveHanoi(int n, int firstRod, int secondRod, int thirdRod) {
		String result = "";
		if (n == 1) {
			//System.out.println(firstRod + " - " + thirdRod);
			result += firstRod + " " + secondRod + " " + thirdRod + "\n";
			firstRod -= 1;
			thirdRod += 1;
			result += firstRod + " " + secondRod + " " + thirdRod + "\n";
			
			//System.out.println(firstRod + " " + secondRod + " " + thirdRod);
		} else {
			result += solveHanoi(n - 1, firstRod, secondRod, thirdRod);
			//System.out.println(firstRod + " - " + thirdRod);
			result += solveHanoi(n - 1, secondRod, thirdRod, firstRod);
			//System.out.println(firstRod + " - " + thirdRod);
		}
		return result;
		
	}

}
