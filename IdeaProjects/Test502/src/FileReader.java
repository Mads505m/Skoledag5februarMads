import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class FileReader {

    public void opretfil(String filnavn) throws IOException {
        File file = new File("C:\\Users\\dense\\OneDrive\\Skrivebord\\Java\\IdeaProjects\\Test502", filnavn);
        file.createNewFile();
    }

    public void laesfil(String filnavn) throws FileNotFoundException {
        File file = new File("C:\\Users\\dense\\OneDrive\\Skrivebord\\Java\\IdeaProjects\\Test502", filnavn);
        Scanner readfile = new Scanner(file);
        System.out.println("Indhold af filen:");
        while (readfile.hasNextInt()) {
            int textinput = readfile.nextInt();
            System.out.print(textinput + " ");
        }
    }

    public void sletfil(String filnavn) throws IOException {
        File file = new File("C:\\Users\\dense\\OneDrive\\Skrivebord\\Java\\IdeaProjects\\Test502", filnavn);
        file.delete();
    }

    public void sefiler(String filmappe) throws IOException {
        File file = new File("C:\\Users\\dense\\OneDrive\\Skrivebord\\Java\\IdeaProjects\\", filmappe);
        File[] filer = file.listFiles();
        for(File filee : filer){
            System.out.println(filee.getName());
        }
    }

    public void opretmappe(String filmappe) throws IOException {
        File file = new File("C:\\Users\\dense\\OneDrive\\Skrivebord\\Java\\IdeaProjects\\", filmappe);
        file.mkdir();
    }
}