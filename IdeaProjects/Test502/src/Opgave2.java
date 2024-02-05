import java.io.*;
import java.util.Scanner;
public class Opgave2 {
    public static void main(String[] args) throws IOException {
        String sourceFile = "Test1";
        String destinationFile = "Test2";

        // Metode 1: Brug af FileInputStream og FileOutputStream
        long startTime1 = System.currentTimeMillis();
        copyUsingFileStreams(sourceFile, destinationFile);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Metode 1 udført på: " + (endTime1 - startTime1) + " ms");

        // Metode 2: Brug af BufferedInputStream og BufferedOutputStream
        long startTime2 = System.currentTimeMillis();
        copyUsingBufferedStreams(sourceFile, destinationFile);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Metode 2 udført på: " + (endTime2 - startTime2) + " ms");

        // Metode 3: Brug af Scanner og PrintWriter
        long startTime3 = System.currentTimeMillis();
        copyUsingScannerAndPrintWriter(sourceFile, destinationFile);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Metode 3 udført på: " + (endTime3 - startTime3) + " ms");
    }

    private static void copyUsingFileStreams(String source, String destination) throws IOException {
        // Implementer kopiering ved hjælp af FileInputStream og FileOutputStream
        try(FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination);) {
        int byteread;
        while((byteread = fis.read()) != -1){
            fos.write(byteread);
        }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void copyUsingBufferedStreams(String source, String destination) {
        // Implementer kopiering ved hjælp af BufferedInputStream og BufferedOutputStream
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));) {
            int byteread;
            while((byteread = bis.read()) != -1){
                bos.write(byteread);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void copyUsingScannerAndPrintWriter(String source, String destination) {
        // Implementer kopiering ved hjælp af Scanner og PrintWriter
        try(Scanner scanner = new Scanner(new File(source));
            PrintWriter printWriter = new PrintWriter(new File(destination))) {
            while(scanner.hasNextLine()){
               printWriter.println(scanner.nextLine());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
