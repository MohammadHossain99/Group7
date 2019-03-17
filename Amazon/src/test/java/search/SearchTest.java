package search;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import base.CommonAPI;



public class SearchTest extends CommonAPI{

    @Test
    public void search(){
        typeOnWebElement("twotabsearchtextbox");
    }
}