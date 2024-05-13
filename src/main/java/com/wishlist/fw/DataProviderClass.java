package com.wishlist.fw;

import com.wishlist.models.UserLogin;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderClass {
    @DataProvider
    public Iterator<Object[]> addNewUser() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"dudkina1@web.de", "Berli2024!"});
        list.add(new Object[]{"dudkina2@web.de", "Berli2024!"});
        list.add(new Object[]{"dudkina3@web.de", "Berli2024!"});

        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> loginNewUserFromCsvFile() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/UserDataLogin.csv")));

        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new UserLogin(split[0], split[1])});
        }
        line = reader.readLine();
        return list.iterator();

    }
}

