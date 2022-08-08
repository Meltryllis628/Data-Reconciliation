import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {
    @Test
    public void test_generating() throws IOException {
        generateCsvs.generate2csvs(1000,80);
    }
    @Test
    public void test_file_read(){
        assertNotNull(ReadCSV.readCsvByBufferedReader("F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_1.csv"));
        assertNull(ReadCSV.readCsvByBufferedReader("F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_1.xlsx"));
        assertNull(ReadCSV.readCsvByBufferedReader("F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\not_exist_file_1.csv"));
    }
    @Test
    public void test_repeated(){
        assertNull(Compare.compare("F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_1_invalid.csv","F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_3_invalid.csv"));
    }
    @Test
    public void test_rows(){
        assertNull(Compare.compare("F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_1.csv","F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_3_rows.csv"));
    }
    @Test
    public void test_columns(){
        assertNull(Compare.compare("F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_1.csv","F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_3_column.csv"));
    }
    @Test
    public void test_valid(){
        assertNotNull(Compare.compare("F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_1.csv","F:\\Term5\\Data-Reconciliation\\src\\test\\resources\\sample_file_3.csv"));
    }
}