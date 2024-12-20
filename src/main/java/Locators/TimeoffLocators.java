package Locators;

public class TimeoffLocators {

    private String date;
    private String month;

    public String timeOffPageTitle = "com.atlashxm.uat:id/tvTitle";
    public String btnRequestTimeoff = "com.atlashxm.uat:id/itemView";
    public String dropdownTimeOffType = "com.atlashxm.uat:id/text1";
    public String optionTimeOffType = "com.atlashxm.uat:id/text1";
    public String openFromCalendar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ImageView";
    //public String changeFromMonth = "android:id/next";
    public String selectFromDate = "//android.view.View[@content-desc='%s %s %s']";
    public String openToCalendar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.ImageView";
    public String selectToDate = "//android.view.View[@content-desc='%s %s %s']";
    public String confirmDate = "android:id/button1";
    public String btnAddHours = "com.atlashxm.uat:id/addHours";
    public String btnSubmitPTO = "com.atlashxm.uat:id/tvContinue";
    public String txtAddHours1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.EditText";
    public String txtAddHours2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.EditText";
    public String btnSaveHours = "com.atlashxm.uat:id/save";
    public String commentBox = "com.atlashxm.uat:id/et_additional_desc";
    public String btnConfirmPTO = "com.atlashxm.uat:id/confirmButton";
    public String confirmPopupTitle = "com.atlashxm.uat:id/title";
    public String verifyPTOMessage = "com.atlashxm.uat:id/approvalText";
    public String backToHomePage = "com.atlashxm.uat:id/okButton";
    public String ToDateList = "android:id/month_view";

    public String validationForAppliedTimeOff = "com.atlashxm.uat:id/timeOffLabel";
}
