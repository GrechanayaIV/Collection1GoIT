package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class AddElements implements Command {

    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        ConsolHelper.writeMessage("Enter element to add: ");
        int elements = ConsolHelper.readInt();

        array.add(elements);
    }
}
