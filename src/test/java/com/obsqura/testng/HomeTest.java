package com.obsqura.testng;

import org.testng.annotations.Test;

public class HomeTest {
    @Test(priority = 1, enabled = true)
    public void verifyHomePageTitle()
    {
        System.out.println("This is to verify home page title");
    }
    @Test(priority = 2,enabled = true)
    public void verifyHomePageUserMenu()
    {
        System.out.println("This is to verify home page user menu");
    }
}
