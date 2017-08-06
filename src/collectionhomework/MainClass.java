package collectionhomework;

import java.io.IOException;
import java.util.ArrayList;

import static collectionhomework.command.Command.array;

/**
 * Created by Інна on 05.08.2017.
 */
public class MainClass {
    public static void main(String[] args)throws IOException{
       for(int i =0; i< 7; i++){
           array.add(i);
       }


        Operation operation;
        try{
            operation = askOperation();
            CommandExecutor.execute(operation);

        }catch (Exception e){
            ConsolHelper.writeMessage("There was an error, check the entered data");
        }

    }
    public static Operation askOperation() throws IOException{
        ConsolHelper.writeMessage("Select an operation:");
        ConsolHelper.writeMessage("1. Add an element"+ Operation.ADD.ordinal());
        ConsolHelper.writeMessage ("2. Remove element; "+Operation.REMOVE.ordinal());
        ConsolHelper.writeMessage ("3.Search element by value;"+Operation.SEARChBYVALUE.ordinal());
        ConsolHelper.writeMessage("4. Search element by index"+Operation.SEARCHBYINDEX.ordinal());
        ConsolHelper.writeMessage("5. Maximum element"+Operation.SEARCHMAX.ordinal());
        ConsolHelper.writeMessage("6.Minimum element"+Operation.SEARCHMIN.ordinal());
        ConsolHelper.writeMessage("7.Arithmetical mean of elements"+Operation.SEARCHMEAN.ordinal());
        return Operation.values()[ConsolHelper.readInt()];
    }
}
