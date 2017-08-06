package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class RemoveElements implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        ConsolHelper.writeMessage("Enter element to remove: ");
        try {
            int elements = ConsolHelper.readInt();
            array.remove(elements);
            ConsolHelper.writeMessage("Operation is successful");
        } catch (Exception e) {
            ConsolHelper.writeMessage("Error ! There is no such element in the array");
        }

    }
}
