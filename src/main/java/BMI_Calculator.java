import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BMI_Calculator {
    @Test
    public void calcTest45() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("174");
        $(By.name("wg")).sendKeys("45");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Starvation");
    }

    @Test
    public void calcTest46() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("174");
        $(By.name("wg")).sendKeys("46");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Underweight");
    }

    @Test
    public void calcTest57() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("174");
        $(By.name("wg")).sendKeys("57");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Normal");
    }

    @Test
    public void calcTest75() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("174");
        $(By.name("wg")).sendKeys("75");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Normal");
    }

    @Test
    public void calcTest56() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("174");
        $(By.name("wg")).sendKeys("56");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Underweight");
    }

    @Test
    public void calcTest76() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("174");
        $(By.name("wg")).sendKeys("76");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Overweight");
    }

    @Test
    public void calcTest90() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("174");
        $(By.name("wg")).sendKeys("90");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Overweight");
    }

    @Test
    public void calcTest91() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("174");
        $(By.name("wg")).sendKeys("91");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Obese");
    }

    @Test
    public void ht150() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("150");
        $(By.name("wg")).sendKeys("57");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Overweight");
    }

    @Test
    public void ht() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("ht")).sendKeys("176");
        $(By.name("wg")).sendKeys("57");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Underweight");
    }

    @Test
    public void foot() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("opt2")).sendKeys("6'");
        $(By.name("opt3")).sendKeys("8");
        $(By.name("wg")).sendKeys("125.4");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Obese");
    }

    @Test
    public void bla1() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("opt2")).sendKeys("7'");
        $(By.name("opt3")).sendKeys("4");
        $(By.name("wg")).sendKeys("125.4");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Normal");
    }

    @Test
    public void bla2() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("opt2")).sendKeys("7'");
        $(By.name("opt3")).sendKeys("11");
        $(By.name("wg")).sendKeys("107.4");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Underweight");
    }
}