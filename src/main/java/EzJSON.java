import java.io.File;
import java.io.Reader;

public class EzJSON {

    private final boolean prettyPrinting;

    public EzJSON(EzJSONBuilder builder) {
        this.prettyPrinting = builder.prettyPrinting;
    }

    public String toJSON(Object object, File file) {
        return "";
    }

    public String toJSON(Object object) {
        return "";
    }

    public <T> T fromJSON(String jsonString){
        return null;
    }

    public <T> T fromJSON(File file) {
        return null;
    }

    public <T> T fromJSON(Reader reader, Class<T> classofT) {
        return null;
    }

}
