import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        //I/O stream
        //byte   => i = read() /o = write() stream
        //char   =>R =read() /W = write()
        // the must usable classes for input : FileInputStream - DataInputStream that inherited from the FilterInputStream -ObjectInputStream
        // the must usable classes for output : FileOutputSrteam - DataOutputStream - PrintStream - ObjectOutputStream

//        String file = "/home/happy/Bureau/packages/com/example/java/fileHandling/src/file.txt";
//
//        FileOutputStream fos = new FileOutputStream(file);
//        fos.write("ismail".getBytes("UTF-8"));
//        fos.flush();
//        FileInputStream fis = new FileInputStream(file);
//        byte b[] = new byte[6];
//        fis.read(b);
//        for (int s:b) {
//            System.out.print((char)s);
//        }
        String file = "/home/happy/Bureau/packages/com/example/java/fileHandling/src/no-profile.png";
        FileInputStream fis = new FileInputStream(file);
        byte  b[] = new byte[(int)file.length()];
        System.out.println(b.length);
        fis.read(b);
//        for(byte c : b) {
//            System.out.println(c);
//        }


        FileOutputStream fos = new FileOutputStream("/home/happy/Bureau/packages/com/example/java/fileHandling/src/no-profile2.png");

        fos.write(b);
        fos.flush();
        fos.close();





//        int data;
//        while ((data = fis.read()) != -1) {
//            System.out.println((char) data);
//        }
    }
}