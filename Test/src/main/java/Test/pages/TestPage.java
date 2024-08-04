package Test.pages;

import Test.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestPage extends Utility {

    private static final Logger log = LogManager.getLogger(TestPage.class.getName());

    public TestPage() {
        PageFactory.initElements(driver , this );
    }

    @CacheLookup
    @FindBy (xpath = "//button[@class='button']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy (id = "next-button")
    WebElement startButton;

    @CacheLookup
    @FindBy (id = "radio-wales")
    WebElement walesButton;
    @CacheLookup
    @FindBy (id = "radio-yes")
    WebElement radioButton;
    @CacheLookup
    @FindBy (id = "next-button")
    WebElement nextButton;

    @CacheLookup
    @FindBy (xpath = "//input[@value='WALES']")
    WebElement chooseDental;
    @CacheLookup
    @FindBy (xpath = "//input[@value='Next']")
    WebElement secondNextButton;
    @CacheLookup
    @FindBy (xpath = "//input[@class='button']")
    WebElement thirdNextButton;
    @CacheLookup
    @FindBy (id = "dob-day")
    WebElement date;
    @CacheLookup
    @FindBy (id = "dob-month")
    WebElement month;
    @CacheLookup
    @FindBy (id = "dob-year")
    WebElement year;
    @CacheLookup
    @FindBy (className = "button")
    WebElement forthButton;
    @CacheLookup
    @FindBy (xpath = "//input[@name='partner']")
    WebElement partner;
    @CacheLookup
    @FindBy (xpath = "//input[@type='submit']")
    WebElement fifthButton;
    @CacheLookup
    @FindBy (xpath = "//input[@class='toggleBTC']")
    WebElement partnerBenefit;
    @CacheLookup
    @FindBy (className = "button")
    WebElement sixthButton;
    @CacheLookup
    @FindBy (className = "button")
    WebElement seventhButton;
    @CacheLookup
    @FindBy (id = "not-yet")
    WebElement universalCredit;
    @CacheLookup
    @FindBy (className = "button")
    WebElement eightButton;

    @CacheLookup
    @FindBy (className = "button")
    WebElement ninthButton;
    @CacheLookup
    @FindBy (xpath = "//input[@id='continue']")
    WebElement anyBenefit;
    @CacheLookup
    @FindBy (className = "button")
    WebElement tenthButton;
    @CacheLookup
    @FindBy (id = "radio-no")
    WebElement pregnant;
    @CacheLookup
    @FindBy (className = "button")
    WebElement eleventhButton;
    @CacheLookup
    @FindBy (id = "radio-no")
    WebElement injuryOrIllness;
    @CacheLookup
    @FindBy (className = "button")
    WebElement twelfthButton;
    @CacheLookup
    @FindBy (id = "radio-no")
    WebElement diabetes;

    @CacheLookup
    @FindBy (className = "button")
    WebElement thirteenButton;
    @CacheLookup
    @FindBy (id = "radio-no")
    WebElement glaucoma;
    @CacheLookup
    @FindBy (className = "button")
    WebElement fourteenButton;
    @CacheLookup
    @FindBy (id = "radio-no")
    WebElement careHome;
    @CacheLookup
    @FindBy (className = "button")
    WebElement fifteenButton;
    @CacheLookup
    @FindBy (id = "radio-no")
    WebElement property;
    @CacheLookup
    @FindBy (xpath = "//h2[@id='FREE-heading']")
    WebElement verifyMessage;

    public String verifyMessage(){
        String expectedMessage = getTextFromElement(verifyMessage);
        log.info("Getting text from: " + verifyMessage.toString());
        return expectedMessage;
    }

    public void clickOnProperty(){
        clickOnElement(property);
    }
    public void clickOnFifteenButton(){
        clickOnElement(fifteenButton);
    }
    public void clickOnCareHome(){
        clickOnElement(careHome);
    }
    public void clickOnFourteenButton(){
        clickOnElement(fourteenButton);
    }
    public void clickOnDiabetes(){
        clickOnElement(diabetes);
    }
    public void clickOnThirteenButton(){
        clickOnElement(thirteenButton);
    }

    public void clickOnGlaucoma(){
        clickOnElement(glaucoma);
    }
    public void clickOnTwelfthButton(){
        clickOnElement(twelfthButton);
    }
    public void clickOnBenefit(){
        clickOnElement(anyBenefit);
    }
    public void clickOnInjuryOrBenefit(){
        clickOnElement(injuryOrIllness);
    }
    public void clickOnPregnant(){
        clickOnElement(pregnant);
    }
    public void clickOnNinthButton(){
        clickOnElement(ninthButton);
    }
    public void clickOnEleventhButton(){
        clickOnElement(eleventhButton);
    }
    public void clickOnTenthButton(){
        clickOnElement(tenthButton);
    }

    public void clickOnEightButton(){
        clickOnElement(eightButton);
    }
    public void clickOnSixthButton(){
        clickOnElement(sixthButton);
    }
    public void clickOnUniversalCredit(){
        clickOnElement(universalCredit);
    }
    public void clickOnSeventhButton(){
        clickOnElement(seventhButton);
    }
    public void clickOnPartnersBenefit(){
        clickOnElement(partnerBenefit);
    }
    public void clickOnFifthButton(){
        clickOnElement(fifthButton);
    }
    public void clickOnPartner(){
        clickOnElement(partner);
    }
    public void clickOnForthButton(){
        clickOnElement(forthButton);
    }
    public void dateOfBirth(String  Day, String Month, String Year){
        sendTextToElement(date, Day);
        sendTextToElement(month, Month);
        sendTextToElement(year, Year);
    }

    public void clickOnThirdButton(){
        clickOnElement(thirdNextButton);
    }
    public void clickOnSecondButton(){
        clickOnElement(secondNextButton);
    }

    public void chooseDentalInWales(){
        clickOnElement(chooseDental);
    }

    public void acceptCookie() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(acceptCookies);
    }
    public void clickOnNextButton(){
        clickOnElement(nextButton);
    }

    public void clickOnStartButtons() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(startButton);
    }

    public void clickOnWales() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(walesButton);
    }

    public void clickOnRadioButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(radioButton);
    }











}
