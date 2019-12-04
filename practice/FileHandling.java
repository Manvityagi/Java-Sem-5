import java.io.*;

public class FileHandling {

    public static void main(String[] args) {
        String str = "Hello, I am Manvi Tyagi";

        FileWriter fw = new FileWriter("Myfile.txt");
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        fw.close();

        FileReader fr = null;
        try {
            fr = new FileReader("Myfile.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }

        File file = new File("Myfile.txt");
        char[] arr = new char[(int) file.length()];
        fr.read(arr);
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