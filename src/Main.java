import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;


public class Main {
	
	private Stack<Integer> firstRod;
	private Stack<Integer> midRod;
	private Stack<Integer> endRod;
	private PrintWriter pw;
	
	public Main() {
		firstRod = new Stack<>();
		midRod = new Stack<>();
		endRod = new Stack<>();
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main ppal = new Main();
		
		try {
			ppal.pw = new PrintWriter("./data/result.txt");
			int cases = Integer.parseInt(br.readLine());
			String line = "";
			int i = 0;
			while (line != null && i < cases) {
				line = br.readLine();
				if (line != null) {
					String result = ppal.solveHanoiStart(line);
					//System.out.println(result);
					ppal.pw.println(result + "\n");
				}
				i++;
			}
			br.close();
			ppal.pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String solveHanoiStart(String discs) {
		int n = Integer.parseInt(discs);
		//pw.println(discs + " 0 " + "0");
		String result = discs + " 0 " + "0\n";
		while (firstRod.size() < n) {
			firstRod.add(firstRod.size() + 1);
		}
		result += solveHanoi(n, firstRod, midRod, endRod);
		//System.out.println(result + "\nSAPE!");
		firstRod.clear();
		midRod.clear();
		endRod.clear();
		return result;
	}
	


	public String solveHanoi(int n, Stack<Integer> first, Stack<Integer> second, Stack<Integer> third) {
		String result = "";
		if (n == 1) {
			third.add(first.pop());
			// Se cambian los nombres del print, puesto que de lo contrario, el orden estaría intercambiado.
			//pw.println(firstRod.size() + " " + midRod.size() + " " + endRod.size());
			result += firstRod.size() + " " + midRod.size() + " " + endRod.size()+ "\n";
			
		} else {
			solveHanoi(n - 1, first, third, second);
			third.add(first.pop());
			//pw.println(firstRod.size() + " " + midRod.size() + " " + endRod.size());
			result += firstRod.size() + " " + midRod.size() + " " + endRod.size()+ "\n";
			solveHanoi(n - 1, second, first, third);
		}
		return result;
		
	}

}
