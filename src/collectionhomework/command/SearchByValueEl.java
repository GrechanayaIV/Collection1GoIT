package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;

/**
 * Created by Інна on 05.08.2017.
 */
public class SearchByValueEl implements Command {
    @Override
    public void execute() throws IOException {
        ConsolHelper.writeMessage("Enter element to search: ");
        int elements = Integer.valueOf(ConsolHelper.readInt());
        search(elements);

    }

    public void  search(int element){
        for(int i = 0; i< array.size(); i++){
            if(array.get(i)==element){
                System.out.println("This element`s number is: "+ i);
            }
        }
    }
}
