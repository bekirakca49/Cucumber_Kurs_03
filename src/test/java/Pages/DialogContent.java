package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath="//*[@id='cconsent-bar']/div/div[2]/div/button")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath ="//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath ="//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;


    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod1;
    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod2;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel1;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[5]")
    private WebElement gradeLevel2;



    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastNameInput;

    @FindBy(xpath = "//mat-form-field[@formgroupname='profile']")
    private WebElement genderInput0;

    @FindBy(xpath = "(//div[@role='listbox'])[1]")
    private WebElement genderInput1;

    @FindBy(xpath = "//mat-select[@formcontrolname='types']")
    private WebElement employeesTypeInput0;

    @FindBy(xpath = "//mat-option[@role='option'][1]")
    private WebElement employeesTypeInput1;

   // @FindBy(xpath = "")
    //private WebElement escKeyClick;

    @FindBy(xpath = "//input[@formcontrolname='employeeId']")
    private WebElement employeesInputId;

    @FindBy(xpath = "//div[@class='mat-form-field-wrapper ng-tns-c74-218']")
    private WebElement qualificationInput0;

    @FindBy(xpath = "//mat-option[@role='option'][3]")
    private WebElement qualificationInput1;

    @FindBy(xpath = "//mat-form-field[@formgroupname='documentInfo'][2]")
    private WebElement documentTypeInput0;

    @FindBy(xpath = "(//div[@role='listbox']//div)[2]")
    private WebElement documentTypeInput1;

    @FindBy(xpath = "//mat-form-field[@formgroupname='documentInfo'][3]")
    private WebElement documentNummerInput;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> nameList ;

    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement =nameInput; break;
            case "codeInput" : myElement =codeInput; break;
            case "shortName" : myElement =shortName; break;
            case "searchInput" : myElement =searchInput; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "priorityCode" : myElement =priorityCode; break;

            case "firstNameInput" : myElement =firstNameInput; break;
            case "lastNameInput" : myElement =lastNameInput; break;
            case "employeesInputId" : myElement =employeesInputId; break;
            case "documentNummerInput" : myElement =documentNummerInput; break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "acceptCookies" : myElement =acceptCookies; break;
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "saveButton" : myElement =saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement =searchButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogButton" : myElement =deleteDialogButton; break;

            case "academicPeriod1" : myElement =academicPeriod1; break;
            case "academicPeriod2" : myElement =academicPeriod2; break;
            case "gradeLevel1" : myElement =gradeLevel1; break;
            case "gradeLevel2" : myElement =gradeLevel2; break;

            case "genderInput0" : myElement =genderInput0; break;
            case "genderInput1" : myElement =genderInput1; break;
            case "employeesTypeInput0" : myElement =employeesTypeInput0; break;
            case "employeesTypeInput1" : myElement =employeesTypeInput1; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;
            case "alreadyExist" : myElement =alreadyExist; break;
        }

        verifyContainsText(myElement,text);
    }

    public void searchAnddelete(String searchText){


        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        waitUntilLoading();

        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");
    }
}
