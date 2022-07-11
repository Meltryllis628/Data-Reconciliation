import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) throws IOException {
        String filepath1 = "F:\\Term5\\50003\\Software Testing Mini Campaign\\sample_file_1.csv";
        String filepath2 = "F:\\Term5\\50003\\Software Testing Mini Campaign\\sample_file_3.csv";
        String fileName = "F:\\Term5\\50003\\Software Testing Mini Campaign\\test1.csv";
        ArrayList<String> record1 = ReadCSV.readCsvByBufferedReader(filepath1);
        ArrayList<String> record2 = ReadCSV.readCsvByBufferedReader(filepath2);
        ArrayList<String> result = Compare.compare(filepath1,filepath2);
        WriteCSV.writeToCSV(result,fileName);
    }
}
