package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class SearchByIndezEl implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        ConsolHelper.writeMessage("Enter element`s number to search: ");
        int index = ConsolHelper.readInt();
        search(index, array);

    }

    public void search(int index, ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (i == index) {
                System.out.println("This element is: " + array.get(i));
            }
        }
    }
}
