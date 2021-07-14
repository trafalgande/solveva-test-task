package executor;

import domain.Command;
import handler.CommandHandler;
import parser.CommandParser;

public class CustomCommandExecutor implements CommandExecutor {

    CommandParser commandParser = new CommandParser();
    CommandHandler commandHandler;

    @Override
    public void executeCommand(String input) {
        Command currentCommand = commandParser.parse(input);
        commandHandler = commandParser.resolveCommand(currentCommand);
        if (commandHandler != null)
            commandHandler.handle(input.split("\\s+")[1]);
        else
            System.out.println("Unsupported command");
    }
}
