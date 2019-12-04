package lab6;

import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        String str = "Today we will learn  about file handling in Java using FileReader and FileWriter classes";
        FileWriter fw = new FileWriter("MyFile.txt");
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        fw.close();

        FileReader fr = null;
        try {
            fr = new FileReader("MyFile.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
        // read from FileReader till the end of file
        File file = new File("MyFile.txt");
        char[] arr = new char[(int) file.length()];
        fr.read(arr);

        // close the file
        fr.close();
        fw = new FileWriter("MyFile.txt", false);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122)
                fw.write(arr[i] - 32);
            else
                fw.write(arr[i]);
        }
        fw.close();
    }
}
