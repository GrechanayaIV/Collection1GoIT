package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;

/**
 * Created by Інна on 05.08.2017.
 */
public class SearchMean implements Command {
    @Override
    public void execute() throws IOException {
        int sum = 0;
        for(int i = 0; i<array.size();i++){
            sum += array.get(i);
        }
        double mean = sum/array.size();
        ConsolHelper.writeMessage("Arithmetical mean of elements: " + mean);

    }
}
