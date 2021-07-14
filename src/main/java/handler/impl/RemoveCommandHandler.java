package handler.impl;

import handler.CommandHandler;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RemoveCommandHandler implements CommandHandler {
    @Override
    public void handle(String arg) {
        if (!FileUtils.getFile(arg).exists()) {
            System.err.println("File doesn't exist");
        } else {
            try {
                Files.delete(Path.of(arg));
                System.out.printf("File %s was successfully removed\n", arg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
