import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class make {

    /*
     * Complete the 'closestColor' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY pixels as parameter.
     */

    public static List<String> closestColor(List<String> pixels) {
        // Write your code here
        List<String> result = new ArrayList<>();

        for (String pixel : pixels) {
            // Extract RGB values from the 24-bit binary string
            int r = Integer.parseInt(pixel.substring(0, 8), 2);
            int g = Integer.parseInt(pixel.substring(8, 16), 2);
            int b = Integer.parseInt(pixel.substring(16, 24), 2);
            double min = Double.MAX_VALUE;
            String closesetcolor = "";

            String[] colorNames = {"Black", "White", "Red", "Green", "Blue", "Ambiguous"};

            int[][] colorRGB = {
                    {0, 0, 0},
                    {255, 255, 255},
                    {255, 0, 0},
                    {0, 255, 0},
                    {0, 0, 255}
            };

            for(int i=0; i<colorRGB.length; i++){
                double distance = Math.sqrt(Math.pow(colorRGB[i][0] - r, 2) + Math.pow(colorRGB[i][1]- g, 2) + Math.pow(colorRGB[i][2]- b, 2));

                if(distance == min){
                    closesetcolor = colorNames[5];
                }else if(distance < min){
                    min = distance;
                    closesetcolor = colorNames[i];
                }
            }
            result.add(closesetcolor);
        }

        return result;

    }


}

public class No4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int pixelsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> pixels = new ArrayList<>();

        for (int i = 0; i < pixelsCount; i++) {
            String pixelsItem = bufferedReader.readLine();
            pixels.add(pixelsItem);
        }

        List<String> result = make.closestColor(pixels);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }


        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
