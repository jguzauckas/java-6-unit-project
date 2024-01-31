import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Setup {
    public static void writeStringToFile(String str, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(str);
        writer.close();
    }

    public static String generate2015(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += (int) (Math.random() * 40 + 1);
            result += "x";
            result += (int) (Math.random() * 40 + 1);
            result += "x";
            result += (int) (Math.random() * 40 + 1);
            result += "\n";
        }
        result = result.trim();
        return result;
    }

    public static String solve2015(String input) {
        String[] in = input.split("\n");
        int totalPaper = 0;
        int totalRibbon = 0;
        for (String tStr : in) {
			int x1 = tStr.indexOf("x");
			int x2 = x1 + 1 + tStr.substring(x1 + 1).indexOf("x");
			int length = Integer.parseInt(tStr.substring(0, x1));
			int width = Integer.parseInt(tStr.substring(x1 + 1, x2));
			int height = Integer.parseInt(tStr.substring(x2 + 1));
            totalPaper += 2 * length * width + 2 * width * height + 2 * length * height;
            int s1 = length * width;
            int s2 = width * height;
            int s3 = length * height;
            if (s1 <= s2 && s1 <= s3) {
                totalPaper += s1;
            } else if (s2 <= s1 && s2 <= s3) {
                totalPaper += s2;
            } else {
                totalPaper += s3;
            }
            int p1 = 2 * (length + width);
            int p2 = 2 * (width + height);
            int p3 = 2 * (length + height);
            if (p1 <= p2 && p1 <= p3) {
                totalRibbon += p1;
            } else if (p2 <= p1 && p2 <= p3) {
                totalRibbon += p2;
            } else {
                totalRibbon += p3;
            }
            totalRibbon += length * width * height;
		}
        String answer = "They need to order " + totalPaper + " square feet of wrapping paper.\n";
        answer += "They need to order " + totalRibbon + " feet of ribbon.";
        return answer;
    }

    public static void main(String[] args) {
        String p2015 = generate2015(1000);
        try {
            writeStringToFile(p2015, "2015/input.txt");
            writeStringToFile(solve2015(p2015), "2015/answer.txt");
        } catch (IOException e1) {
			e1.printStackTrace();
		}
    }
}