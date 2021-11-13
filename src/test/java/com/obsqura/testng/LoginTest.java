package com.obsqura.testng;

import org.testng.annotations.Test;

public class LoginTest {
    @Test(priority = 3, enabled = true)
    public void verifyLoginPageTitle()
    {
        System.out.println("This is to verify login page title");
    }
    @Test(priority = 4,enabled = true)
    public void verifyValidLogin()
    {
        System.out.println("This is to verify valid login");
    }
}
