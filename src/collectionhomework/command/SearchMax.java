package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.Collections;

/**
 * Created by Інна on 05.08.2017.
 */
public class SearchMax implements Command {
    @Override
    public void execute() throws IOException {
        ConsolHelper.writeMessage("Minimum is: "+ Collections.min(array));
    }
}
