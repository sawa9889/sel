package Threads;

import org.json.JSONObject;
import org.json.JSONWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class Writeror {
    private int i=0;
    public static void  flag(){}

    public Writeror() {
    }

    public synchronized static void write(String type, String str, int i) {
        //TO-Do list

        if (i == 50) {
            this.flag();
            i = 0;
        }
        {
            i++;
        }
    }
}
