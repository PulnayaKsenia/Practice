package ua.goit.practice.firstpractice.UnixPath;

import java.nio.file.Paths;
import java.util.ArrayList;

public class UnixPath {
    private static String path = "/home/../var/./lib//file.txt";
//    used interface Paths
//        Path unixPath = Paths.get(path);
//        System.out.println("Full Unix path - " + path + ", Unix path after normalization - " + unixPath.normalize());

    public static String normalize(String input) {
        String[] arrayInput = input.split("/");
        ArrayList<String> forResult = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        int offsetLastPosition = 1;
        int countElements = arrayInput.length;
        int i = countElements - offsetLastPosition;

        boolean noExit, doubleDots;

        if (i >= 0) {
            noExit = true;
            doubleDots = false;

            while (noExit) {
                if (!arrayInput[i].equals("") && !arrayInput[i].equals(".") && !arrayInput[i].equals("..")) {
                    if (!doubleDots) forResult.add(arrayInput[i]);
                    doubleDots = false;
                }
                if (arrayInput[i].equals("..")) {
                    doubleDots = true;
                }
                i--;
                if (i < 0) noExit = false;
            }
            if (forResult.size() - offsetLastPosition >= 0){
                for (i = forResult.size() - offsetLastPosition; i >= 0; i--) {
                    if (!forResult.get(i).equals("")) result.append("/").append(forResult.get(i));
                }
            }else {
                result.append("/");
            }
        }
        else
        {
            result.append("/");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Full Unix path - " + path + ", Unix path after normalization - " + normalize(path));
    }
}
