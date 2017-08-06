package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;

import java.util.Collections;


/**
 * Created by Інна on 05.08.2017.
 */
public class SearchMin implements Command {
    @Override
    public void execute() throws IOException {

        ConsolHelper.writeMessage("Maximum is: " + Collections.max(array));

    }
}
