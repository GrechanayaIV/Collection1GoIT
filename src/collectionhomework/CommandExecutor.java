package collectionhomework;

import collectionhomework.command.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Інна on 06.08.2017.
 */
public class CommandExecutor {
    private static final Map<Operation,Command> allCommandsMap = new HashMap<>();

    static {
        allCommandsMap.put(Operation.ADD, new AddElements());
        allCommandsMap.put(Operation.REMOVE, new RemoveElements());
        allCommandsMap.put(Operation.SEARCHBYINDEX, new SearchByIndezEl());
        allCommandsMap.put(Operation.SEARChBYVALUE, new SearchByValueEl());
        allCommandsMap.put(Operation.SEARCHMEAN, new SearchMean());
        allCommandsMap.put(Operation.SEARCHMAX, new SearchMax());
        allCommandsMap.put(Operation.SEARCHMIN, new SearchMin());
    }

    public CommandExecutor() {
    }

    public static void execute(Operation operation)throws Exception{
        allCommandsMap.get(operation).execute();
    }
}
