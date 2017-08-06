package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class SearchMean implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        double sum = 0D;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        try {
            if (array.size() == 0) {
                throw new Exception();
            } else {
                double mean = sum / array.size();
                ConsolHelper.writeMessage("Arithmetical mean of elements: " + mean);
            }
        } catch (Exception e) {
            ConsolHelper.writeMessage("Error ! It is impossible to count");
        }

    }
}
