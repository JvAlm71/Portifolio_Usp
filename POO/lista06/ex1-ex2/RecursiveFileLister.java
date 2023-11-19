import java.io.File;
import java.util.Objects;
import java.io.FilenameFilter;


//This is an file lister that will list all files in a directory and all subdirectories.
public class RecursiveFileLister {

    public static void main(String[] args) {
        // Replace this with the directory path you want to list
        String directoryPath = "/home/baile/Videos/";

        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            listFilesRecursive(directory, 0);
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }

    private static void listFilesRecursive(File dir, int level) {
        if (dir == null || !dir.isDirectory()) {
            return;
        }

        FilenameFilter RecursiveFileLister = (dir1, name) -> name.toLowerCase().endsWith(".exe");

        File[] files = dir.listFiles(RecursiveFileLister);
        if (files != null) {
            for (File file : files) {
                for (int i = 0; i < level; i++) {
                    System.out.print("\t");
                }
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                    listFilesRecursive(file, level + 1);
                } else {
                    System.out.println("File: " + file.getName());
                }
            }
        }
    }
}
