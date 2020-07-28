package testcases;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import data.MyFillo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.SignUpDBank;
import utils.Utilities;

public class TestSignUp {

    String strUrl = "http://dbankdemo.com/login";
    String strPath = "src/test/resources/data/data_dBank.xlsx";

    SignUpDBank objSignUp = new SignUpDBank();
    MyFillo objDataDriven = new MyFillo();

    @BeforeMethod
    public void beforeMethod(){

        Utilities.openUrl(strUrl);
    }


    @DataProvider(name = "data_provider")
    public Object[][] dataProviderMethod() {
        return new Object [][]  {{0},{1},{2},{3},{4},{5},{6},{7},{8},{9},{10},{11},{12},{13},{14}};
//        Object[][] data = new Object[0][14];
//        for (int i=0; i< data[i].length; i++) {
//                data[0][i] = i;
//        }
//        return  data;
    }


    @Test(dataProvider = "data_provider")
    public void testSignUpFieldValidationMessage(int ID) throws FilloException {
        String strQuery1 = "SELECT * FROM Users WHERE ID = '" + ID + "'";
        objSignUp.lnkSignUp();
        Recordset recordset = objDataDriven.select(strPath,strQuery1);
        objSignUp.fillForm1(recordset);
        objSignUp.btnNext();
        Utilities.closeAlert();
    }


    @AfterMethod
    public void afterMethod() {
        Utilities.closeExplorer(); Utilities.closeProcess();
    }

}
