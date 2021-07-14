package executor;

import domain.Command;
import handler.CommandHandler;

public interface CommandExecutor {
    void executeCommand(String input);
}
