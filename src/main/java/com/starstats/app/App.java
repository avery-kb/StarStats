package com.starstats.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.StarData.StarData;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        StarData[] data = mapper.readValue(new File("/home/avery/Documents/stardew.json"), StarData[].class);

        StringWriter writer = new StringWriter();
        mapper.writeValue(writer, data);
        System.out.println(writer);
    }
}
