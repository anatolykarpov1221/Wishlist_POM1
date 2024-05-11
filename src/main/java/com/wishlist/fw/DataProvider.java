package com.wishlist.fw;

import com.wishlist.models.User;
import com.wishlist.pages.SignUpPage;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvider {
//    @org.testng.annotations.DataProvider
//    public Iterator<Object[]> addNewUser() {
//        List<Object[]> list = new ArrayList<>();
//        list.add(new Object[]{"Lena", "Dudkina", "dudkina1@web.de", "Berli2024!", "Berlin2024!"});
//        list.add(new Object[]{"Lena", "Dudkina", "dudkina2@web.de", "Berli2024!", "Berlin2024!"});
//        list.add(new Object[]{"Lena", "Dudkina", "dudkina3@web.de", "Berli2024!", "Berlin2024!"});
//
//        return list.iterator();
//    }
//
//    @Test(dataProvider = "addNewUserFromDataProvider")
//    public void fillRegistratiónFormFromDataProvider(String name, String lastname, String email, String password) {
//
//        new SignUpPage(driver)
//                .enterPersonalData(name, lastname, email, password)
//                .clickOnSignUpButtonRegistr()
//                .verifySuccessButton("Log In");
//    }
//
//    @org.testng.annotations.DataProvider
//    public Iterator<Object[]> addNewUserFromCsvFile() throws IOException {
//        List<Object[]> list = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/UserData.csv")));
//
//        String line = reader.readLine();
//        list.add(new Object[]{new User().setName()})
//
//
//        return list.iterator();
//
//    }
}
