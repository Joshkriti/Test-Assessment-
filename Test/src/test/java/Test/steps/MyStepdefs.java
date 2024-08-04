package Test.steps;

import Test.pages.TestPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class MyStepdefs {

    TestPage testPage = new TestPage();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I accept cookies$")
    public void iAcceptCookies() throws InterruptedException {
        testPage.acceptCookie();
    }

    @Then("^I select nationality$")
    public void iSelectNationality() throws InterruptedException {
        testPage.clickOnWales();
    }

    @Then("^I click on start button$")
    public void iClickOnStartButton() throws InterruptedException {
        testPage.clickOnStartButtons();
    }

    @Then("^I select whether I have GP practice in Wales or not$")
    public void iSelectWhetherIHaveGPPracticeInWalesOrNot() throws InterruptedException {
        testPage.clickOnRadioButton();

    }

    @Then("^I click on next button$")
    public void iClickOnNextButton() {
        testPage.clickOnNextButton();
    }

    @Then("^I choose where my dental practice is$")
    public void iChooseWhereMyDentalPracticeIs() {
        testPage.chooseDentalInWales();
    }

    @Then("^I click on second next button$")
    public void iClickOnSecondNextButton() {
        testPage.clickOnSecondButton();
    }

    @Then("^I click on third next button$")
    public void iClickOnThirdNextButton() {
        testPage.clickOnThirdButton();    }


    @Then("^I enter date of birth$")
    public void iEnterDateOfBirth(DataTable dataTable) {

        List<Map<String,String>> rows = dataTable.asMaps(String.class, String.class);

        for(Map<String,String> columns : rows) {
            new TestPage().dateOfBirth(columns.get("Day"), columns.get("Month"), columns.get("Year"));
        }
    }

    @Then("^I click on forth next button$")
    public void iClickOnForthNextButton() {
        testPage.clickOnForthButton();
    }

    @Then("^I click on whether I live with my partner$")
    public void iClickOnWhetherILiveWithMyPartner() {
        testPage.clickOnPartner();
    }

    @Then("^I click on fifth next button$")
    public void iClickOnFifthNextButton() {
        testPage.clickOnFifthButton();
    }

    @Then("^I click on if my partner claim any benefits or tax credits$")
    public void iClickOnIfMyPartnerClaimAnyBenefitsOrTaxCredits() {
        testPage.clickOnPartnersBenefit();
    }

    @Then("^I click on sixth next button$")
    public void iClickOnSixthNextButton() {
        testPage.clickOnSixthButton();
    }

    @Then("^I click on if my partner get paid Universal Credit$")
    public void iClickOnIfMyPartnerGetPaidUniversalCredit() {
        testPage.clickOnUniversalCredit();
    }

    @Then("^I click on seventh next button$")
    public void iClickOnSeventhNextButton() {
        testPage.clickOnSeventhButton();
    }

    @Then("^I click on eight next button$")
    public void iClickOnEightNextButton() {
        testPage.clickOnEightButton();
    }

    @Then("^I click on if my partner get any of these benefits$")
    public void iClickOnIfMyPartnerGetAnyOfTheseBenefits() {
        testPage.clickOnBenefit();
    }

    @Then("^I click on ninth next button$")
    public void iClickOnNinthNextButton() {
        testPage.clickOnNinthButton();
    }

    @Then("^I click on if my partner was pregnant$")
    public void iClickOnIfMyPartnerWasPregnant() {
        testPage.clickOnPregnant();
    }

    @Then("^I click on tenth button$")
    public void iClickOnTenthButton() {
        testPage.clickOnTenthButton();
    }

    @Then("^I click on if I have an injury or illness caused by serving in the armed forces$")
    public void iClickOnIfIHaveAnInjuryOrIllnessCausedByServingInTheArmedForces() {
        testPage.clickOnInjuryOrBenefit();
    }

    @Then("^I click on eleventh next button$")
    public void iClickOnEleventhNextButton() {
        testPage.clickOnEleventhButton();
    }

    @Then("^I click on if I have diabetes$")
    public void iClickOnIfIHaveDiabetes() {
        testPage.clickOnDiabetes();
    }

    @Then("^I click on twelfth next button$")
    public void iClickOnTwelfthNextButton() {
        testPage.clickOnTwelfthButton();
    }

    @Then("^I click on if I have glaucoma$")
    public void iClickOnIfIHaveGlaucoma() {
        testPage.clickOnGlaucoma();
    }

    @Then("^I click on thirteen next button$")
    public void iClickOnThirteenNextButton() {
        testPage.clickOnThirteenButton();
    }

    @Then("^I click on if I or my partner live permanently in a care home$")
    public void iClickOnIfIOrMyPartnerLivePermanentlyInACareHome() {
        testPage.clickOnCareHome();
    }

    @Then("^I click on fourteen next button$")
    public void iClickOnFourteenNextButton() {
        testPage.clickOnFourteenButton();
    }

    @Then("^I click on if I and my partner have more than £(\\d+),(\\d+) in savings, investments or property$")
    public void iClickOnIfIAndMyPartnerHaveMoreThan£InSavingsInvestmentsOrProperty(int arg0, int arg1) {
        testPage.clickOnProperty();
    }

    @Then("^I click on fifteen next button$")
    public void iClickOnFifteenNextButton() {
        testPage.clickOnFifteenButton();
    }

    @And("^I got the result as they can free NHS Prescription$")
    public void iGotTheResultAsTheyCanFreeNHSPrescription() {
        String actualMessage = testPage.verifyMessage();
        String expectedMessage = "You get free:";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
