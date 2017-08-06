package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;



public class SearchMin implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {

        ConsolHelper.writeMessage("Minimum is: " + Collections.max(array));

    }
}
