import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class transfer {
    public static void main (String [] args)
    {
    String source = "C:\\Users\\Animesh\\Desktop\\repo\\files\\source.txt";
    String destination = "C:\\Users\\Animesh\\Desktop\\repo\\files\\destination.txt";
   try(FileInputStream fis = new FileInputStream(source);
    FileOutputStream fos = new FileOutputStream(destination)){
        byte[] buffer = new byte[1024];
        int bytesRead;

        // Read data from the source file and write it to the destination file
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        System.out.println("File copied successfully.");

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
