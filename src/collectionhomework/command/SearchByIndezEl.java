package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;
import java.util.ArrayList;


public class SearchByIndezEl implements Command {
    @Override
    public void execute(ArrayList<Integer> array) throws IOException {
        ConsolHelper.writeMessage("Enter element`s number to search: ");

        try {
            int index = ConsolHelper.readInt();
            search(index, array);
        } catch (Exception e) {
            ConsolHelper.writeMessage("There is no element with such index");
        }

    }

    public void search(int index, ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (i == index) {
                ConsolHelper.writeMessage("This element is: " + array.get(i));
            }
            if ((i == array.size() - 1) & (i != index)) {
                System.out.println("There is no element with such index");
            }

        }
    }
}
