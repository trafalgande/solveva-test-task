package handler.impl;

import handler.CommandHandler;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class MkDirCommandHandler implements CommandHandler {
    @Override
    public void handle(String arg) {
        if (FileUtils.getFile(arg).isDirectory()) {
            System.err.println("Directory already exists");
        } else {
            File dir = new File(arg);
            try {
                FileUtils.forceMkdir(dir);
                System.out.printf("Directory %s was successfully created\n", dir.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
