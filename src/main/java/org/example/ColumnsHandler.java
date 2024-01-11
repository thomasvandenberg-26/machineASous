package org.example;
import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ColumnsHandler {

      public List<List<String>> deserialize(String fichierJson) throws FileNotFoundException {
     Gson gson = new Gson();
                Reader reader = new FileReader(fichierJson);
             return gson.fromJson(reader,List.class);
            }

}