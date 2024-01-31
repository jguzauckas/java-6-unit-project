import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Assignment2016 {
    public static Triangle[] readIn(String filename) {
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
		
		Triangle[] input = new Triangle[list.size()];
		int i = 0;
		for (String tStr : list) {
			int space1 = tStr.trim().indexOf(" ");
			int space2 = space1 + 2 + tStr.trim().substring(space1 + 1).trim().indexOf(" ");
			System.out.println(space1 + " " + space2);
			int a = Integer.parseInt(tStr.trim().substring(0, space1));
			int b = Integer.parseInt(tStr.trim().substring(space1 + 1, space2 + 2).trim());
			int c = Integer.parseInt(tStr.trim().substring(space2 + 2).trim());
			input[i] = new Triangle(a, b, c);
			i++;
		}
		return input;
	}

    public static void main(String[] args) {
        Triangle[] triangles = readIn("2016/input.txt");
        
		int count = 0;
        for (Triangle tri : triangles) {
			if (tri.isTriangle()) {
				count++;
			}
		}
		System.out.println(count);

		int count2 = 0;
		for (int i = 1; i < triangles.length - 1; i += 3) {
			count2 += triangles[i].isTriangles(triangles[i - 1], triangles[i + 1]);
		}

		System.out.println(count2);
    }
}
