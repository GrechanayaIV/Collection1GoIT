package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;

/**
 * Created by Інна on 05.08.2017.
 */
public class RemoveElements implements Command{
    @Override
    public void execute() throws IOException {
        ConsolHelper.writeMessage("Enter element to remove: ");
        int elements = Integer.valueOf(ConsolHelper.readInt());
        array.remove(elements);

    }
}
