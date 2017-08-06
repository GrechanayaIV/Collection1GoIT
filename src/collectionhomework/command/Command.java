package collectionhomework.command;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Інна on 05.08.2017.
 */
public interface Command {
    ArrayList<Integer> array =new ArrayList<>();
    public void execute() throws IOException;
}
