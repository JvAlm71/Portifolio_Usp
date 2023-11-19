import java.io.File;
import java.io.FilenameFilter;

//Lister for one directory
public class FileLister {
    public static void main(String[] args) {
        // Replace this with the directory path you want to list
        String directoryPath = "/home/baile/Videos/";

        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            listFiles(directory);
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }

    private static void listFiles(File dir) {
        // Filter to list only .exe files
        FilenameFilter filter = (dir1, name) -> name.toLowerCase().endsWith(".exe");

        File[] files = dir.listFiles(filter);
        if (files != null) {
            for (File file : files) {
                // Only print file names, no recursive calls
                System.out.println("File: " + file.getName());
            }
        }
    }
}
