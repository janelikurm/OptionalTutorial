import java.io.File;

public class DirectoryTree {

    public static void main(String[] args) {

        /*
         * Write a programs that takes a path and prints expanded directory tree
         *
         * https://en.wikipedia.org/wiki/Tree_%28command%29
         *
         * E.g.
         * $ tree path/to/folder/
         * path/to/folder/
         * ├── a-first.html
         * ├── b-second.html
         * ├── subfolder
         * │   ├── readme.html
         * │   ├── code.cpp
         * │   └── code.h
         * └── z-last-file.html
         *
         * 1 directories, 6 files
         * */


        String path = args.length > 0 ? args[0] : "/home/vali-it/IdeaProjects";
        String[] filesAndDirectories = new File(path).list();
        if (filesAndDirectories == null) {
            System.out.println("Directory not found");
            return;
        }
        System.out.println("Contents of " + path);
        int level = 1;
//        for (String fileOrDirectoryName : filesAndDirectories) {
        printFilesAndDirectories(level, new File(path));
//            File fileOrDirectory = new File(path + fileOrDirectoryName);
//         System.out.println(fileOrDirectory.getName() + " -> " + "file");
//        }

    }

    private static void printFilesAndDirectories(int level, File directory) {
        String indent = "───";
        String space = "   ";
        System.out.println(space.repeat(level) + "|" + indent + directory.getName());
        File[] filesAndDirectories = directory.listFiles();
        for (int i = 0; i < filesAndDirectories.length; i++) {

            if (filesAndDirectories[i].isDirectory()) {
                printFilesAndDirectories(level + 1, filesAndDirectories[i]);
            } else {
                System.out.println(space.repeat(level + 1) + "|" + indent + filesAndDirectories[i].getName());

            }
        }

    }
}