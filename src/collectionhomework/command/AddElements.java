package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class AddElements implements Command {

    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        ConsolHelper.writeMessage("Enter element to add: ");
        try {
            int elements = ConsolHelper.readInt();
            array.add(elements);
            ConsolHelper.writeMessage("Operation is successful");
        } catch (Exception e) {
            ConsolHelper.writeMessage("Error ! Such an element can not be added to an array of integers");
        }


    }
}
