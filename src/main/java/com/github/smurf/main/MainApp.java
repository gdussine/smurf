package com.github.smurf.main;

import java.io.IOException;
import java.util.Properties;

public class MainApp {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(MainApp.class.getClassLoader().getResourceAsStream("key.properties"));
        System.out.println(properties.getProperty("key"));
    }
}
