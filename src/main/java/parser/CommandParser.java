package parser;

import domain.Command;
import handler.CommandHandler;
import handler.impl.CDCommandHandler;
import handler.impl.FindCommandHandler;
import handler.impl.MkCommandHandler;
import handler.impl.MkDirCommandHandler;
import handler.impl.MoveCommandHandler;
import handler.impl.OpenCommandHandler;
import handler.impl.RemoveCommandHandler;

import java.util.Locale;

public class CommandParser {
    public Command parse(String input) {
        String[] args = input.split("\\s+");
        switch (args[0].toLowerCase(Locale.ROOT)) {
            case "mk":
                return Command.MK;
            case "mkdir":
                return Command.MKDIR;
            case "mv":
                return Command.MV;
            case "rm":
                return Command.RM;
            case "open":
                return Command.OPEN;
            case "find":
                return Command.FIND;
            case "cd":
                return Command.CD;
            case "ls":
                return Command.LS;
            case "exit":
                return Command.EXIT;
            default:
                return Command.DEFAULT;
        }
    }

    public CommandHandler resolveCommand(Command command) {
        switch (command) {
            case MK:
                return new MkCommandHandler();
            case MKDIR:
                return new MkDirCommandHandler();
            case MV:
                return new MoveCommandHandler();
            case RM:
                return new RemoveCommandHandler();
            case OPEN:
                return new OpenCommandHandler();
            case FIND:
                return new FindCommandHandler();
            case CD:
                return new CDCommandHandler();
            case EXIT:
            default:
                return null;
        }
    }
}
