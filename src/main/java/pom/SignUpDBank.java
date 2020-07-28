package pom;


import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import org.openqa.selenium.By;
import utils.Utilities;


public class SignUpDBank {

    private final By LNKSGNUP = By.linkText("Sign Up Here");
    private final By TITLE = By.name("title");
    private final By FNOM = By.id("firstName");
    private final By LNOM = By.id("lastName");
    private final By DOB = By.id("dob");
    private final By SSN = By.id("ssn");
    private final By EM = By.id("emailAddress");
    private final By PWD = By.id("password");
    private final By CPWD = By.id("confirmPassword");
    private final By BTNNEXT = By.xpath("//button[@type='submit']");
    private final By ADDR = By.id("address");
    private final By LOCALITY = By.id("locality");
    private final By REGION = By.id("region");
    private final By POSTALCODE = By.id ("postalCode");
    private final By COUNTRY = By.id("country");
    private final By HOMEPHONE = By.id ("homePhone");
    private final By MOBILEPHONE = By.id("mobilePhone");
    private final By WORKPHONE = By.id("workPhone");
    private final By AGREE = By.id("agree-terms");
    private final By BTNREGISTER= By.xpath("//button[@type='submit']");
//    private final By BTNCLOSE = By.xpath("//button[@class='close']");
//    private final By MSSGSUCCESS = By.xpath("//span[@class='badge badge-pill badge-success']");
//    MESSAGE = Registration Successful. Please Login.
//button[@type='submit']
    //button[@class='btn btn-primary btn-flat m-b-30 m-t-30']

//    BTNCLOSE

//    private final By ERRMSG = By.xpath(//span[@class='badge badge-pill badge-danger']);

    public SignUpDBank fillForm1(Recordset objRecordset) throws FilloException {
        System.out.println(objRecordset.getField("Caso"));

        Utilities.selectXName(TITLE, objRecordset.getField("Title"));
        Utilities.ishtml5validationPresent(TITLE);

        Utilities.type(FNOM, objRecordset.getField("FirstName"));
        Utilities.ishtml5validationPresent(FNOM);

        Utilities.type(LNOM, objRecordset.getField("LastName"));
        Utilities.ishtml5validationPresent(LNOM);

        Utilities.click(By.xpath("//input[@value='"+ objRecordset.getField("Gender") + "']"));
        Utilities.ishtml5validationPresent(By.xpath("//input[@value='"+ objRecordset.getField("Gender") + "']"));

        Utilities.type(DOB, objRecordset.getField("DateOfBirth"));
        Utilities.ishtml5validationPresent(DOB);

        Utilities.type(SSN, objRecordset.getField("SocialSecurityNumber"));
        Utilities.ishtml5validationPresent(SSN);

        Utilities.type(EM, objRecordset.getField("Email"));
        Utilities.ishtml5validationPresent(EM);

        Utilities.type(PWD, objRecordset.getField("Password"));
        Utilities.ishtml5validationPresent(PWD);

        Utilities.type(CPWD, objRecordset.getField("confirmpwd"));

        Utilities.ishtml5validationPresent(CPWD);

        return this;
    }

    public SignUpDBank fillForm2(Recordset objRecordset) throws FilloException {

        Utilities.type(ADDR, objRecordset.getField("Address"));
        Utilities.type(LOCALITY, objRecordset.getField("Locality"));
        Utilities.type(REGION, objRecordset.getField("Region"));
        Utilities.type(POSTALCODE, objRecordset.getField("Postalcode"));
        Utilities.type(COUNTRY, objRecordset.getField("Country"));
        Utilities.type(HOMEPHONE, objRecordset.getField("Homephone"));
        Utilities.type(MOBILEPHONE, objRecordset.getField("Mobilephone"));
        Utilities.type(WORKPHONE, objRecordset.getField("Workphone"));
        Utilities.click(AGREE);
        return this;
    }

    public SignUpDBank lnkSignUp() {
        Utilities.el(LNKSGNUP);
        Utilities.click(LNKSGNUP);
        return this;
    }


    public SignUpDBank btnNext() {
        Utilities.click(BTNNEXT);
        return this;
    }

    public SignUpDBank btnRegister() {
        Utilities.click(BTNREGISTER);
        return this;
    }



//    public SignUpdBank btnNext(){
//        Utilities.constraintValidationPresent(BTNNEXT);
//        return this;
//    }

//    public SignUpdBank chckMessage(String strmessage) {
//        Utilities.compareAlertText(strmessage);
//        System.out.println("pase por aqui");
//        return this;
//    }


}
