import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Assignment2015 {
    public static RectangularPrism[] readIn(String filename) {
		BufferedReader in;
		String str = "";

		ArrayList<String> list = new ArrayList<String>();

		try {
			in = new BufferedReader(new FileReader(filename));
			while ((str = in.readLine()) != null) {
				list.add(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		RectangularPrism[] input = new RectangularPrism[list.size()];
		int i = 0;
		for (String tStr : list) {
			int x1 = tStr.indexOf("x");
			int x2 = x1 + 1 + tStr.substring(x1 + 1).indexOf("x");
			int length = Integer.parseInt(tStr.substring(0, x1));
			int width = Integer.parseInt(tStr.substring(x1 + 1, x2));
			int height = Integer.parseInt(tStr.substring(x2 + 1));
			input[i] = new RectangularPrism(length, width, height);
			i++;
		}
		return input;
	}

    public static void main(String[] args) {
        RectangularPrism[] boxes = readIn("2015/input.txt");
        
        // Your work goes here!
    }
}
