import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {


        File f = new File("src/AOC6Data");
        FileReader fd = new FileReader(f);
        BufferedReader br = new BufferedReader(fd);
        String line;

        while((line=br.readLine())!=null) {
            String[] readLine = line.split("");
            for (int i = 0; i < readLine.length - 1; i++) {
                Set<String> puzzleOne = new HashSet<>();
                for (int x = i; x < i + 4; x++) {
                    puzzleOne.add(readLine[x]);
                }
                if (puzzleOne.size() == 4) {
                    System.out.println(i + 4);
                    break;
                }
            }
            for (int i = 0; i < readLine.length - 1; i++) {
                Set<String> puzzleTwo = new HashSet<>();
                for (int x = i; x < i + 14; x++) {
                    puzzleTwo.add(readLine[x]);
                }
                if (puzzleTwo.size() == 14) {
                    System.out.println(i + 14);
                    break;
                }

            }
        }

        System.out.println("done!");
        }
    }

