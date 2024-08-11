package sem5;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Backup {

    public static void backupFiles(String directoryPath) {

        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) 
        {
            System.out.println("Invalid directory path: " + directoryPath);
            return;
        }

        Path backupDirectory = Paths.get("./backup");
        try {
            Files.createDirectory(backupDirectory);
        } catch (IOException e) {
            System.out.println("Error creating backup directory: " + e.getMessage());
            return;
        }

        File[] files = directory.listFiles((dir, name) -> !new File(dir, name).isDirectory());
        if (files == null) {
            System.out.println("No files found in the directory: " + directoryPath);
            return;
        }

        for (File file : files) {
            Path sourcePath = file.toPath();
            Path targetPath = backupDirectory.resolve(file.getName());
            try 
            {
                Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Backed up file: " + file.getName());
            } 
            catch (IOException e) 
            {
                System.out.println("Error backing up file " + file.getName() + ": " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        String directoryPath = "./files";
        backupFiles(directoryPath);
    }
}
