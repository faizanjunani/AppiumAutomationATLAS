package Pages;

import Locators.OnboardingLocators;
import Utils.SupportMethods;

import java.net.MalformedURLException;

public class WSEOnboardingPage {
    OnboardingLocators ol = new OnboardingLocators();
    SupportMethods sm = new SupportMethods();

    public WSEOnboardingPage() throws MalformedURLException {
    }

    public void verifyUserIsPresentOnOnboardingLandingPage()
    {
        sm.verifyElement(ol.txtContinuetoProfile,"Complete your profile");
    }
    public void continueToOnboarding()
    {
        sm.clickByPath(ol.btnContinuetoProfile);
    }
    public void skipProfilePic()
    {
        sm.clickByPath(ol.btnSkipProfielPic);
    }
    public void userPresentOnProfile(String pageTitle)
    {
        sm.verifyElement(ol.profilePageTItle,pageTitle);
    }
    public void selectTitle(String title)
    {
        System.out.println("Lets select the title now");
        sm.Tap(ol.dropdownTtile);
        System.out.println("Dropdown Open, now get the list");
        sm.SelectListElementsbyPath(ol.listTitle,title);
    }
    public void selectDateOfBirth(String expectedYear, int expectedMonth, int expectedDate) throws InterruptedException {
        System.out.println("Open Calendar");
        sm.clickByPath(ol.openCalendar);
        sm.clickByPath(ol.openYearList);
        sm.selectValueFromScrollableList(expectedYear,ol.listofYears,ol.scrollYearList, "Down");
        System.out.print("Year is selected");
        sm.selectDateFromCalendar(expectedYear,expectedMonth,expectedDate,ol.listofDays);
        System.out.print("Date is selected");
        sm.clickByPath(ol.btnSelectYear);
    }
    public void selectMaritalStatus(String maritalStatus)
    {
        System.out.println("Lets select the Marital Status now");
        sm.Tap(ol.dropdownMaritalStatus);
        System.out.println("Dropdown Open, now get the list");
        sm.SelectListElementsbyPath(ol.listMaritalStatus,maritalStatus);
        System.out.println("Marital Status is selected");
    }
    public void selectGender(String gender)
    {
        sm.ScrollUp(ol.scrollPersonalInfoTab,80);
        System.out.println("Lets select the gender now");
        sm.Tap(ol.dropdownGender);
        System.out.println("Dropdown Open, now get the list");
        sm.SelectListElementsbyPath(ol.listGender,gender);
        System.out.println("Gender is Selected");
    }
    public void continueToCitizenshipTab()
    {
        sm.clickByPath(ol.btnProfileContinue);
    }
    public void selectCitizenship(String expectedCitizenshipValue) throws InterruptedException {
        sm.Tap(ol.dropdownCountry);
        sm.selectValueFromScrollableList(expectedCitizenshipValue, ol.listOfCountries,ol.scrollListOfCountries, "Up");
        sm.clickByPath(ol.btnSelectCountry);
    }
    public void enterNationalId(String expectedNationalIdValue)
    {
        sm.sendKeysByPath(ol.txtNationalId,expectedNationalIdValue);
    }
    public void continueToHomeAddressTab()
    {
        sm.clickByPath(ol.btnCitizenshipContinue);
    }
    public void selectHomeCountry(String expectedHomeAddressValue) throws InterruptedException {
        sm.Tap(ol.dropdownCountry);
        sm.selectValueFromScrollableList(expectedHomeAddressValue,ol.listOfCountries,ol.scrollListOfCountries,"Up");
        sm.clickByPath(ol.btnSelectCountry);
    }
    public void enterCity(String expectedCityValue)
    {
        sm.sendKeysByPath(ol.txtCity,expectedCityValue);
    }
    public void enterProvince(String expectedProvinceValue)
    {
        sm.sendKeysByPath(ol.txtState,expectedProvinceValue);
    }
    public void enterZipcode(String expectedZipcodeValue)
    {
        sm.sendKeysByPath(ol.txtPostalCode,expectedZipcodeValue);
    }  public void enterAddress1(String expectedAddress1Value)
    {
        sm.sendKeysByPath(ol.txtAddress1,expectedAddress1Value);
    }  public void enterAddress2(String expectedAddress2Value)
    {
        sm.sendKeysByPath(ol.txtAddress2, expectedAddress2Value);
    }
    public void enterPhoneNumber(String expectedPhoneNumberValue, String expectedCountryCodeValue) throws InterruptedException {
        sm.ScrollUp(ol.scrollHomeAddressTab,100);
        sm.ScrollUp(ol.scrollHomeAddressTab,100);
        sm.ScrollUp(ol.scrollHomeAddressTab,500);
        sm.ScrollUp(ol.scrollHomeAddressTab,200);
        sm.ScrollUp(ol.scrollHomeAddressTab,100);
        sm.ScrollUp(ol.scrollHomeAddressTab,100);
        sm.clickByPath(ol.dropdownOfCountryCode);
        sm.selectValueFromScrollableList(expectedCountryCodeValue,ol.listOfCountries,ol.scrollListOfCountries,"Up");
        sm.clickByPath(ol.btnSelectCountry);
        sm.sendKeysByPath(ol.txtPhoneNumber,expectedPhoneNumberValue);
    }
    public void continueToBankingTab() {
        sm.clickByPath(ol.btnHomeAddressContinue);
    }
    public void selectBankCountry(String expectedBankCountry) throws InterruptedException {
        sm.Tap(ol.dropdownBankCountry);
        sm.selectValueFromScrollableList(expectedBankCountry,ol.listOfCountries,ol.scrollListOfCountries,"Up");
        sm.clickByPath(ol.btnSelectCountry);
    }
    public void enterAccountHolderName(String accountHolderName)
    {
        sm.sendKeysByPath(ol.txtAccountHolderName,accountHolderName);
    }
    public void continueAndSkipAccountHolderInfo()
    {
        sm.clickByPath(ol.btnAccountHolderInfoContinue);
        sm.clickByPath(ol.btnSkipBankingInfo);
    }
    public void selectSameAsHomeAddress()
    {
        sm.clickByPath(ol.checkboxSameAsHomeAddress);
    }
    public void continueToEmergency()
    {
        sm.clickByPath(ol.btnGeneralInformationContinue);
    }

    public void enterFirstName(String firstName)
    {
        sm.sendKeysByPath(ol.txtEmergencyFirstName,firstName);
    }
    public void enterLastName(String lastName)
    {
        sm.sendKeysByPath(ol.txtEmergencyLastName,lastName);
    }
    public void selectRelationship(String relationsship)
    {
        sm.clickByPath(ol.dropdownRelation);
        sm.SelectListElementsbyPath(ol.listOfRelations,relationsship);
        System.out.println("relation is selected");
    }
    public void enterEmail(String email)
    {
        sm.sendKeysByPath(ol.txtEmergencyEmail,email);
    }
    public void enterEmergencyPhoneNumber(String expectedCountryCodeValue, String expectedPhoneNumberValue) throws InterruptedException {
        sm.clickByPath(ol.dropdownOfCountryCode);
        sm.selectValueFromScrollableList(expectedCountryCodeValue,ol.listOfCountries,ol.scrollListOfCountries,"Up");
        sm.clickByPath(ol.btnSelectCountry);
        sm.sendKeysByPath(ol.txtPhoneNumber,expectedPhoneNumberValue);
    }
    public void submitOnboarding()
    {
        sm.clickByPath(ol.btnEmergencyContinue);
        sm.clickByPath(ol.btnDocumentsToSignContinue);
        sm.clickByPath(ol.btnDocumentsToUploadContinue);
        sm.clickByPath(ol.btnSubmitOnboarding);
    }
    public void logoutOfTheApp()
    {
        sm.clickByPath(ol.btnLogout);
    }

}
