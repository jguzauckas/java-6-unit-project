import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment2017 {
    public static int[] readIn(String filename) {
		BufferedReader in;
		String str = "";
		
		try {
			in = new BufferedReader(new FileReader(filename));
			str = in.readLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		int[] input = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			input[i] = Integer.parseInt(str.substring(i, i + 1));	
		}
		return input;
	}

    public static void main(String[] args) {
        int[] captcha = readIn("2017/input.txt");
        
		// Your work goes here!
    }
}
