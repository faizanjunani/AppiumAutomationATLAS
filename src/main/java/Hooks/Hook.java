package Hooks;
import Utils.SupportMethods;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Driver;

import Utils.DriverManager;

public class Hook {

    //public static AndroidDriver driver;


    public Hook() throws MalformedURLException {
    }
    @BeforeAll
    public static void beforeAll() throws IOException {
        DriverManager.setupAndroidDriver();
        DriverManager.getWebDriver();
       // writePropertiesToFile();
    }
    public static void writePropertiesToFile() throws IOException {
        SupportMethods sm = new SupportMethods();
        String[]userName;
        userName = sm.RandomNameGenerator();

        sm.writeValuesInConfigFile("FirstName",userName[0].toString());
        sm.writeValuesInConfigFile("LastName",userName[1].toString());
        String email = userName[0]+userName[1]+"@yopmail.com";
        sm.writeValuesInConfigFile("WSEMail", email);
        System.out.println("Properties written to file" +userName[0]+", "+userName[1]+", "+email);
    }




}
