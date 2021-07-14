import executor.CommandExecutor;
import executor.CustomCommandExecutor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CustomCommandExecutor();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            commandExecutor.executeCommand(scanner.nextLine());
        }
    }
}
