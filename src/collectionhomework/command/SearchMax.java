package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class SearchMax implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        ConsolHelper.writeMessage("Maximum is: " + Collections.max(array));
    }
}
