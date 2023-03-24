import java.io.File;
import java.io.Reader;
import java.io.*;


public class EzJSONcsv {

    public String toCSV(Object object, File file) {
        return "";
    }

    public String toCSV(Object object) {
        return "";
    }

    public <T> T fromCSV(String csvString, Class<T> classOfT) {
        return null;
    }

    public <T> T fromCSV(File file, Class<T> classOfT) throws IOException {
        try (FileReader reader = new FileReader(file)) {
            return fromCSV(reader, classOfT);
        }
    }

    public <T> T fromCSV(Reader reader, Class<T> classOfT) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            String csvString = "";
            return fromCSV(csvString, classOfT);
        }
    }
}
