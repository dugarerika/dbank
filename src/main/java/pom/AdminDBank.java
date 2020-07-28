package pom;

import org.openqa.selenium.By;

public class AdminDBank {

    private final By LNKADMI = By.xpath("//img[@class='user-avatar rounded-circle']");

    private final By LNKPROFILE = By.xpath("//a[@href='/user/profile']");
    private final By LNKCHANGEPWD = By.xpath("//a[@href='/user/password']");
    private final By LNKLOGOUT = By.xpath("//a[@href='/logout']");

    private final By WELLCOME = By.xpath("//ol//li[@class='active']");

    private final By TITLEADMIN = By.xpath("//strong[@class='card-title text-white']");

    private final By TITLE = By.name("title");
    private final By FNOM = By.id("firstName");
    private final By LNOM = By.id("lastName");

    private final By HOMEPHONE = By.id ("homePhone");
    private final By MOBILEPHONE = By.id("mobilePhone");
    private final By WORKPHONE = By.id("workPhone");

    private final By ADDR = By.id("address");

    private final By LOCALITY = By.id("locality");
    private final By REGION = By.id("region");
    private final By POSTALCODE = By.id ("postalCode");

    private final By COUNTRY = By.id("country");

    private final By BTNSUMMIT = By.xpath("//button[@class='btn btn-primary btn-sm']");
    private final By BTNRESET = By.xpath("//button[@type='reset']");

    private final By TITLEUPDATE = By.xpath("//h3[@class='text-center']");

    private final By CURRENTPWD = By.id("currentPassword");
    private final By NEWPWD = By.id("newPassword");
    private final By CONFIRMPWD = By.id("confirmPassword");

    private final By BTNUPDATE = By.id("payment-button");






}
