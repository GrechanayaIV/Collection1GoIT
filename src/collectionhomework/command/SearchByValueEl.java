package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class SearchByValueEl implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        ConsolHelper.writeMessage("Enter element to search: ");

        try {
            int elements = ConsolHelper.readInt();
            search(elements, array);
        } catch (Exception e) {
            ConsolHelper.writeMessage("There is no such element in the array");
        }

    }

    public void search(int element, ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == element) {
                ConsolHelper.writeMessage("This element`s number is: " + (i + 1));
            }
            if ((i == array.size() - 1) & (array.get(i) != element)) {
                System.out.println("There is no such element in the array");
            }

        }
    }
}
