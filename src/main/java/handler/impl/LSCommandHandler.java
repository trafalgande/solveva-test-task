package handler.impl;

import handler.CommandHandler;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Objects;

public class LSCommandHandler implements CommandHandler {
    @Override
    public void handle(String arg) {
        StringBuffer sb = new StringBuffer();
        File currentFile = new File(arg);
        for (File existingFile : Objects.requireNonNull(currentFile.listFiles())) {
            sb.append(existingFile.getName()).append("\n");
        }
        System.out.println(sb);
    }
}
