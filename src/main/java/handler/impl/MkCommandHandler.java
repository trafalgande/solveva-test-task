package handler.impl;

import handler.CommandHandler;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class MkCommandHandler implements CommandHandler {
    @Override
    public void handle(String arg) {
        if (FileUtils.getFile(arg).exists()) {
            System.err.println("File already exists");
        } else {
            File f = new File(arg);
            System.out.printf("File %s was created\n", f.getName());
        }
    }
}
