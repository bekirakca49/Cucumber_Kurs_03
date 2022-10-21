package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id="mat-input-12")
    private WebElement nameInput;



    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {



        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

        }

        verifyContainsText(myElement,text);
    }

    public void searchAnddelete(String searchText){
        findAndSend("searchInput", searchText);
        findAndClick("academicPeriod1");
        findAndClick("academicPeriod2");
        findAndClick("gradeLevel1");
        findAndClick("gradeLevel2");
        findAndClick("searchButton");

        waitUntilLoading();
        //GWD.Bekle(3);  //TODO incelenecek..... şuan buna ihtiyaç kalmadı.

        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");
    }
}
