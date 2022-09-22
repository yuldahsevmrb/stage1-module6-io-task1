package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader {
    static Profile profile;
    public Profile getDataFromFile(File file) {
        try(BufferedReader scanner = new BufferedReader(new java.io.FileReader(file))) {
            String name = scanner.readLine();
            String age = scanner.readLine();
            String email = scanner.readLine();
            String phone = scanner.readLine();
            name = name.substring(name.indexOf(" ")+1);
            age = age.substring(age.indexOf(" ")+1);
            email = email.substring(email.indexOf(" ")+1);
            phone = phone.substring(phone.indexOf(" ")+1);
            profile = new Profile(name, Integer.valueOf(age), email,  Long.valueOf(phone) );
            return profile;
        } catch (IOException e) {
            e.printStackTrace();
        }
    return null;
    }
}
