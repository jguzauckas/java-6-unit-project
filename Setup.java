import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Setup {
    public static void writeStringToFile(String str, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(str);
        writer.close();
    }

    public static void writeAnswerToFile(int partA, int partB) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("answer.txt"));
        String str = "Part A: You end up on floor " + partA + ".\nPart B: You first enter the basement on instruction number " + partB + ".";
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

    public static void main(String[] args) {
        try {
            writeStringToFile(generate2015(1000), "2015/2015.txt");
        } catch (IOException e1) {
			e1.printStackTrace();
		}
    }
}