import java.util.*;
import java.io.*;

public class _13file {
    public static void main(String[] args) throws Exception {
        File f1 = new File("input.txt");
        String[] words = null;
        int cnt = 0;

        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String s;
        while ((s = br.readLine()) != null) {
            words = s.split(" ");
            cnt = cnt + words.length;
        }

        System.out.println(cnt);

    }
}
