package collectionhomework.command;

import collectionhomework.ConsolHelper;

import java.io.IOException;

/**
 * Created by Інна on 05.08.2017.
 */
public class SearchByIndezEl  implements Command{
    @Override
    public void execute() throws IOException {
        ConsolHelper.writeMessage("Enter element`s number to search: ");
        int index = Integer.valueOf(ConsolHelper.readInt());
        search(index);

    }

    public void  search(int index){
        for(int i = 0; i< array.size(); i++){
            if(i==index){
                System.out.println("This element is: "+ array.get(i));
            }
        }
    }
}
