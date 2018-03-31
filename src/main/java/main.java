import Threads.Writeror;
import org.json.JSONWriter;

import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Writeror writeror =new Writeror();
        try {
            FileWriter writer = new FileWriter("file.json");
            JSONWriter write = new JSONWriter(writer);
            write.array();
            for (int x = 0; x < 10; x++) {
                writeror.write("1", "2", x);
            }
            write.endArray();

        }catch (IOException e){}

    }

}
