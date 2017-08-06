package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;

/**
 * Created by Інна on 05.08.2017.
 */
public class AddElements implements Command {

    @Override
    public void execute() throws IOException {
        ConsolHelper.writeMessage("Enter element to add: ");
        int elements = Integer.valueOf(ConsolHelper.readInt());

        array.add(elements);
    }
}
