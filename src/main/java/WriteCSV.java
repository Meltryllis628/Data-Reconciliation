import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class WriteCSV {
    public static void writeToCSV(ArrayList<String> records,String fileName) throws IOException {
        if (records!=null){
            int size = records.size();
            try{
                File file = new File(fileName);
                if(file.exists()) file.delete();
                if(file.createNewFile())
                    System.out.println("Created");
                else
                    System.out.println("Existing");
            }
            catch(IOException ioe) {
                ioe.printStackTrace();
            }
            for(int i = 0;i <size;i++){
                Files.write(
                        Paths.get(fileName),
                        (records.get(i)+"\n").getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.APPEND);
            }
        }
    }
}
