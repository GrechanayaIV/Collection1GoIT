package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class SearchByValueEl implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        ConsolHelper.writeMessage("Enter element to search: ");
        int elements = ConsolHelper.readInt();
        search(elements, array);

    }

    public void search(int element, ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == element) {
                System.out.println("This element`s number is: " + (i + 1));
            }
        }
    }
}
