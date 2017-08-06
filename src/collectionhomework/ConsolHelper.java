package collectionhomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Інна on 05.08.2017.
 */
public class ConsolHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static int readInt() throws IOException{
        int numOfMenu = Integer.valueOf(reader.readLine());
        return numOfMenu;
    }
}
