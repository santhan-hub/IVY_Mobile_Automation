package com.keywords

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.Duration;

import org.junit.Assert
import org.openqa.selenium.Dimension

import com.detroitlabs.katalonmobileutil.touch.Scroll
import com.detroitlabs.katalonmobileutil.touch.Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.PerformsTouchActions
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption


public class UtilityKeywords {

	@Keyword
	public static void swipedown_Text(def scrollText) {
		def text;
		int size =20
		try {
			for(int i=0;i<size;i++) {

				if(Mobile.verifyElementVisible(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 1, FailureHandling.OPTIONAL)) {
					text =Mobile.getText(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 0, FailureHandling.OPTIONAL)
					if(text==scrollText) {
						Mobile.comment("Scrolled up to "+text)
						KeywordUtil.logInfo("Scrolled up to "+text)
						Mobile.swipe(0, 1091, 0, 900)
						break;
					}
				}else {
					Mobile.swipe(0, 1091, 0, 900)
				}
			}
		}catch(Exception e) {
			//e.printStackTrace()
		}
	}

	@Keyword
	public static void swipeup_Text(def scrollText) {
		def text;
		int size =20
		try {
			for(int i=0;i<size;i++) {

				if(Mobile.verifyElementVisible(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 1, FailureHandling.OPTIONAL)) {
					text =Mobile.getText(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 0, FailureHandling.OPTIONAL)
					if(text==scrollText) {
						Mobile.comment("Scrolled up to "+text)
						KeywordUtil.logInfo("Scrolled up to "+text)
						Mobile.swipe(0, 900, 0, 1091)
						break;
					}
				}else {
					Mobile.swipe(0, 900, 0, 1091)
				}
			}
		}catch(Exception e) {
			e.printStackTrace()
		}
	}

	@Keyword
	public static void scroll_TOP_TO_BOTTOM(def scrollText) {
		def text;
		int size =20
		try {
			for(int i=0;i<size;i++) {

				if(Mobile.verifyElementVisible(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 1, FailureHandling.OPTIONAL)) {
					text =Mobile.getText(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 0, FailureHandling.OPTIONAL)
					if(text==scrollText) {
						Mobile.comment("Scrolled up to "+text)
						KeywordUtil.logInfo("Scrolled up to "+text)
						break;
					}
				}else {
					Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
				}
			}
		}catch(Exception e) {
			e.printStackTrace()
		}
	}

	@Keyword
	public static void scroll_BOTTOM_TO_TOP(def scrollText) {
		def text;
		int size =20
		try {
			for(int i=0;i<size;i++) {

				if(Mobile.verifyElementVisible(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 1, FailureHandling.OPTIONAL)) {
					text =Mobile.getText(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 0, FailureHandling.OPTIONAL)
					if(text==scrollText) {
						Mobile.comment("Scrolled up to "+text)
						KeywordUtil.logInfo("Scrolled up to "+text)
						break;
					}
				}else {
					Swipe.swipe(SwipeDirection.TOP_TO_BOTTOM)
				}
			}
		}catch(Exception e) {
			e.printStackTrace()
		}
	}

	@Keyword
	public static void scrollListToElementWithText1(def scrollText ,int timeoutbetweenswipe) {
		def text;
		int size =20
		try {
			for(int i=0;i<size;i++) {

				if(Mobile.verifyElementVisible(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 1, FailureHandling.OPTIONAL)) {
					text =Mobile.getText(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 0, FailureHandling.OPTIONAL)
					if(text==scrollText) {
						Mobile.comment("Scrolled up to "+text)
						KeywordUtil.logInfo("Scrolled up to "+text)
						break;
					}
				}else {
					try {
						Scroll.scrollListToElementWithText(scrollText, timeoutbetweenswipe)
					}catch(NoSuchMethodError e) {
					}
				}
			}
		}catch(Exception e) {
			//e.printStackTrace()
		}
	}

	@Keyword
	public static void scrollListToElementWithText2(def resource_id, def scrollText ,int timeoutbetweenswipe) {
		def text;
		int size =20
		try {
			for(int i=0;i<size;i++) {

				if(Mobile.verifyElementVisible(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 1, FailureHandling.OPTIONAL)) {
					text =Mobile.getText(findTestObject('Object Repository/VGP/SCROLL_TEXT'), 0, FailureHandling.OPTIONAL)
					if(text==scrollText) {
						Mobile.comment("Scrolled up to "+text)
						KeywordUtil.logInfo("Scrolled up to "+text)
						break;
					}
				}else {
					try {
						Scroll.scrollListToElementWithText(resource_id,scrollText, timeoutbetweenswipe)
					}catch(NoSuchMethodError e) {
					}
				}
			}
		}catch(Exception e) {
			//e.printStackTrace()
		}
	}

	@Keyword
	public static void scrollDown() {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		Dimension dimension = driver.manage().window().getSize();

		Double scrollHeightStart = dimension.getHeight() * 0.55;
		int scrollStart = scrollHeightStart.intValue();

		Double scrollHeightEnd = dimension.getHeight() * 0.25;
		int scrollEnd = scrollHeightEnd.intValue();

		new TouchAction((PerformsTouchActions) driver)
				.press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
				.moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
	}


	@Keyword
	public void scrollTillView_Inputbox(String Product_name){
		int count =0
		for(int i=0;i<10;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/ReUsables/VGP_INPUT BOX_WITH_PRODUCTNAME'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count=1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}
	@Keyword
	public void scrollTillView_PlusIcon(String Product_name){
		int count =0
		for(int i=0;i<10;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/ReUsables/VGP_PLUSICON_WITH_PRODUCTNAME'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}

	@Keyword
	public void scrollTillView_CurrentSOS(String Product_name){
		int count =0
		for(int i=0;i<10;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/ReUsables/VGP_Current SOS_WITH_PRODUCTNAME'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}


	@Keyword
	public void scrollTillView_TargetSOS(String Product_name){
		int count =0
		for(int i=0;i<10;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/ReUsables/VGP_TargetSOS_WITH_PRODUCTNAME'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}


	@Keyword
	public void scrollTillView_CamerIcon(String Product_name){
		int count =0
		for(int i=0;i<10;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/ReUsables/VGP_CAMERAICON_WITH_PRODUCTNAME'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}

	@Keyword
	public void scrollTillView_PreviousValue(String Product_name){
		int count =0
		for(int i=0;i<10;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/ReUsables/VGP_PREVIOUS_VALUE_WITH_PRODUCTNAME'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}

	@Keyword
	public void scrollTillView_Productname(String Product_name){
		int count =0
		for(int i=0;i<10;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/ReUsables/VGP_PREVIOUS_VALUE_WITH_PRODUCTNAME'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}

	//reset category

	@Keyword
	public static void select_Category(String Category) {

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		List<MobileElement> categoryElements = driver.findElementsById('com.ivy.sd.png.asean.view.smartsell:id/tvNoReason')

		int categoryCount = categoryElements.size()

		int flag =0
		for (int j = 0; j <= (categoryCount - 1); j++) {
			MobileElement catgory_Name = categoryElements.get(j)

			def categoryName = catgory_Name.getText()
			if(categoryName.equalsIgnoreCase(Category)) {
				categoryElements.get(j).click()
				KeywordUtil.logInfo('Selected Category is :  ' + Category)
				flag=1
				break
			}
		}
		if (flag==0) {
			KeywordUtil.logInfo('Expected category is not present in dropdown ' + Category)
			Assert.fail()
		}
	}

	@Keyword
	public static void reset_Category(String Category) {

		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		List<MobileElement> categoryElements = driver.findElementsById('com.ivy.sd.png.asean.view.smartsell:id/tvNoReason')

		int categoryCount = categoryElements.size()

		for (int j = 0; j <= (categoryCount - 1); j++) {
			MobileElement catgory_Name = categoryElements.get(j)

			def categoryName = catgory_Name.getText()
			if(!categoryName.equalsIgnoreCase(Category)) {
				categoryElements.get(j).click()
				KeywordUtil.logInfo('Selected Category is :  ' + Category)
				break
			}
		}


	}




	@Keyword
	public void scrollTillView_SOD_IR_Productname_LAYOUT(String Product_name){
		int count =0
		for(int i=0;i<20;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/Resource1/SOD_Screen/VGP_SOD_IR_PRODUCTNAME WITH_ LAYOUT'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}

	@Keyword
	public void scrollTillView_IR_Productname(String Product_name) {
		int count =0
		for(int i=0;i<20;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/ReUsables/VGP_PREVIOUS_VALUE_WITH_IR_PRODUCTNAME'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}


	@Keyword
	public void SOD_DisplayType_InputButton_Decrease(String Product_name ,int index, int count) {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		GlobalVariable.productname= Product_name
		int count1 =0
		for (int i=0;i<10;i++) {

			if (Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/Resource1/SOD_Screen/VGP_SOD_INPUT DISPLAY TYPES_WITH_PRODUCTNAME'),5)) {
				Mobile.tap(findTestObject('Object Repository/PnG AMA/VGP/Resource1/SOD_Screen/VGP_SOD_INPUT DISPLAY TYPES_WITH_PRODUCTNAME'),5)

				driver.findElementByXPath("(//*[@class = 'android.widget.ImageView' and @resource-id = 'com.ivy.sd.png.asean.view.smartsell:id/iv_decrease_display' and (@text = '')])["+index+"]").click()

				Mobile.tap(findTestObject('Object Repository/PnG AMA/VGP/Resource1/SOD_Screen/VGP_SOD_DisplayType_InputBox_Save_button'),5)

				KeywordUtil.logInfo("User is able to Add the input Value")

				count1 = count1+1
				if (count1==count) {
					break
				}
			}
			else {
				KeywordUtil.logInfo("Unable to Add the input Value")
				Assert.fail()
			}
		}

	}


	@Keyword
	public void scrollTillView_Inputbox_SOD(String Product_name){
		int count =0
		for(int i=0;i<10;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/Resource3/Product_Name_Inputbox'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count=1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}


	@Keyword
	public void scrollTillView_SOD_Productname(String Product_name){
		int count =0
		for(int i=0;i<20;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/Resource1/SOD_Screen/VGP_SOD_PREVIOUS_VALUE_PRODUCT_NAME'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 10 scrolls :  "+Product_name)
			Assert.fail()
		}
	}


	@Keyword
	public void SOD_DisplayType_InputButton(String Product_name ,int index, int count) {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()

		GlobalVariable.productname= Product_name
		int count1 =0
		for (int i=0;i<10;i++) {

			if (Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/Resource1/SOD_Screen/VGP_SOD_INPUT DISPLAY TYPES_WITH_PRODUCTNAME'),5)) {
				Mobile.tap(findTestObject('Object Repository/PnG AMA/VGP/Resource1/SOD_Screen/VGP_SOD_INPUT DISPLAY TYPES_WITH_PRODUCTNAME'),5)

				driver.findElementByXPath("(//*[@class = 'android.widget.ImageView' and @resource-id = 'com.ivy.sd.png.asean.view.smartsell:id/iv_increase_display' and (@text = '')])["+index+"]").click()

				Mobile.tap(findTestObject('Object Repository/PnG AMA/VGP/Resource1/SOD_Screen/VGP_SOD_DisplayType_InputBox_Save_button'),5)

				KeywordUtil.logInfo("User is able to Add the input Value")

				count1 = count1+1
				if (count1==count) {
					break
				}
			}
			else {
				KeywordUtil.logInfo("Unable to Add the input Value")
				Assert.fail()
			}
		}
	}

	
	@Keyword
	public void scrollTillView_SOD_PreviousValue(String Product_name){
		int count =0
		for(int i=0;i<20;i++) {
			GlobalVariable.productname=Product_name
			if(Mobile.verifyElementVisible(findTestObject('Object Repository/PnG AMA/VGP/Resource2/SOD_prev_value_withproductname'), 1, FailureHandling.OPTIONAL)==true) {
				KeywordUtil.logInfo("Scrolled up to "+Product_name)
				count =1
				break;
			}else {
				scrollDown()
			}
		}
		if(count==0) {
			KeywordUtil.logInfo("Expected Element not preset until 20 scrolls :  "+Product_name)
			Assert.fail()
		}
	}
	
	
	
	

}
