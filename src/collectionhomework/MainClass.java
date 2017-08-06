package collectionhomework;

import java.io.IOException;
import java.util.ArrayList;


public class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            arrayList.add(i);
        }


        Operation operation;
        while (true) {

            try {
                operation = askOperation();
                CommandExecutor.execute(operation, arrayList);
                if (operation == Operation.EXIT) break;

            } catch (Exception e) {
                ConsolHelper.writeMessage("There was an error, check the entered data");
            }

        }


    }

    public static Operation askOperation() throws IOException {
        ConsolHelper.writeMessage("Select an operation:");
        ConsolHelper.writeMessage("1. Add an element - " + (Operation.ADD.ordinal() + 1));
        ConsolHelper.writeMessage("2. Remove element - " + (Operation.REMOVE.ordinal() + 1));
        ConsolHelper.writeMessage("3. Search element by value - " + (Operation.SEARChBYVALUE.ordinal() + 1));
        ConsolHelper.writeMessage("4. Search element by index - " + (Operation.SEARCHBYINDEX.ordinal() + 1));
        ConsolHelper.writeMessage("5. Maximum element - " + (Operation.SEARCHMAX.ordinal() + 1));
        ConsolHelper.writeMessage("6. Minimum element - " + (Operation.SEARCHMIN.ordinal() + 1));
        ConsolHelper.writeMessage("7. Arithmetical mean of elements - " + (Operation.SEARCHMEAN.ordinal() + 1));
        ConsolHelper.writeMessage("8. exit - " + (Operation.EXIT.ordinal() + 1));
        return Operation.values()[ConsolHelper.readInt() - 1];
    }


}
