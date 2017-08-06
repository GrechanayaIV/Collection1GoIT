package collectionhomework.command;

import java.io.IOException;
import java.util.ArrayList;


public interface Command {

    public void execute(ArrayList<Integer> array) throws IOException;
}
