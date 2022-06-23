package com.keywords

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.touch.TouchActions
import org.openqa.selenium.mobile.NetworkConnection
import org.openqa.selenium.mobile.NetworkConnection.ConnectionType

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction


public class AndroidKeywords {

	@Keyword
	public static void Resetapk() {
		AppiumDriver<?> addriver = MobileDriverFactory.getDriver()
		addriver.resetApp()
	}

	@Keyword
	public static void Verify_background_colorof_image(String pathofLocator,String colorCode,String NameoftheImage) {

		MobileDriver<MobileElement> driver = MobileDriverFactory.getDriver()
		MobileElement Color = driver.findElementByXPath(pathofLocator)

		AndroidKeywords keyword =new AndroidKeywords();

		keyword.elementScreenshot(driver, Color, NameoftheImage)


		Point point = Color.getCenter()

		int centerx

		int centery

		centerx = point.getX()
		println(centerx)
		centerx = (centerx-10)
		centery = point.getY()

		File scrFile = ((driver) as TakesScreenshot).getScreenshotAs(OutputType.FILE)

		BufferedImage image = ImageIO.read(scrFile)

		int clr = image.getRGB(centerx, centery)

		println(clr)

		int red = (clr & 16711680) >> 16

		println(red)


		int green = (clr & 65280) >> 8

		println(green)

		int blue = clr & 255

		println(blue)

		println((((red + ',') + green) + ',') + blue)

		println('Red Color value = ' + red)

		println('Green Color value = ' + green)

		println('Blue Color value = ' + blue)

		String rhex = Integer.toHexString(red)


		println(rhex)

		String ghex = Integer.toHexString(green)

		println(ghex)

		int glen = String.valueOf(ghex).length()

		println(glen)

		String grayc

		if (glen == 1) {
			grayc = ('0' + ghex)

			println(grayc)
		} else {
			println(ghex)
		}

		String bhex = Integer.toHexString(blue)

		println(bhex)

		int blen = String.valueOf(bhex).length()

		println(blen)

		String bluec

		if (blen == 1) {
			bluec = ('0' + bhex)

			println(bluec)
		} else {
			println(bhex)
		}

		String AShexcode1 = (('#' + rhex) + grayc) + bluec

		println(AShexcode1)

		String AShexcode = (('#' + rhex) + ghex) + bhex

		println("AShexcode: "+AShexcode)

		int alen1 = String.valueOf(AShexcode1).length()

		int alen2 = String.valueOf(AShexcode).length()

		if (alen1 == alen2) {
			println("AShexcode1:" +AShexcode1)

			Mobile.verifyMatch(colorCode, AShexcode1, false)
		} else {
			println("colorCode" +colorCode)
			println("AShexcode" +AShexcode)

			Mobile.verifyMatch(colorCode, AShexcode, true)
			Mobile.takeScreenshot()
		}
	}


	@Keyword
	public static void Verify_background_colorof_image2(String pathofLocator,String colorCode,String NameoftheImage) {

		MobileDriver<MobileElement> driver = MobileDriverFactory.getDriver()
		MobileElement Color = driver.findElementByXPath(pathofLocator)

		AndroidKeywords keyword =new AndroidKeywords();

		keyword.elementScreenshot(driver, Color, NameoftheImage)


		Point point = Color.getCenter()

		int centerx

		int centery

		centerx = point.getX()
		println(centerx)
		centerx = (centerx)
		centery = point.getY()

		File scrFile = ((driver) as TakesScreenshot).getScreenshotAs(OutputType.FILE)

		BufferedImage image = ImageIO.read(scrFile)

		int clr = image.getRGB(centerx, centery)

		println(clr)

		int red = (clr & 16711680) >> 16

		println(red)


		int green = (clr & 65280) >> 8

		println(green)

		int blue = clr & 255

		println(blue)

		println((((red + ',') + green) + ',') + blue)

		println('Red Color value = ' + red)

		println('Green Color value = ' + green)

		println('Blue Color value = ' + blue)

		String rhex = Integer.toHexString(red)


		println(rhex)

		String ghex = Integer.toHexString(green)

		println(ghex)

		int glen = String.valueOf(ghex).length()

		println(glen)

		String grayc

		if (glen == 1) {
			grayc = ('0' + ghex)

			println(grayc)
		} else {
			println(ghex)
		}

		String bhex = Integer.toHexString(blue)

		println(bhex)

		int blen = String.valueOf(bhex).length()

		println(blen)

		String bluec

		if (blen == 1) {
			bluec = ('0' + bhex)

			println(bluec)
		} else {
			println(bhex)
		}

		String AShexcode1 = (('#' + rhex) + grayc) + bluec

		println(AShexcode1)

		String AShexcode = (('#' + rhex) + ghex) + bhex

		println(AShexcode)

		int alen1 = String.valueOf(AShexcode1).length()

		int alen2 = String.valueOf(AShexcode).length()

		if (alen1 == alen2) {
			println(AShexcode1)

			Mobile.verifyMatch(colorCode, AShexcode1, false)
		} else {
			println("colorCode" +colorCode)
			println("AShexcode" +AShexcode)

			Mobile.verifyMatch(colorCode, AShexcode, true)
			Mobile.takeScreenshot()
		}
	}
	@Keyword
	public static String CheckingCameraIconTurnedGreyOrNot(String pathofLocator,String NameoftheImage) {

		MobileDriver<MobileElement> driver = MobileDriverFactory.getDriver()
		MobileElement Color = driver.findElementByXPath(pathofLocator)

		AndroidKeywords keyword =new AndroidKeywords();

		keyword.elementScreenshot(driver, Color, NameoftheImage)


		Point point = Color.getCenter()

		int centerx

		int centery

		centerx = point.getX()
		println(centerx)
		centerx = (centerx-10)
		centery = point.getY()

		File scrFile = ((driver) as TakesScreenshot).getScreenshotAs(OutputType.FILE)

		BufferedImage image = ImageIO.read(scrFile)

		int clr = image.getRGB(centerx, centery)

		println(clr)

		int red = (clr & 16711680) >> 16

		println(red)


		int green = (clr & 65280) >> 8

		println(green)

		int blue = clr & 255

		println(blue)

		println((((red + ',') + green) + ',') + blue)

		println('Red Color value = ' + red)

		println('Green Color value = ' + green)

		println('Blue Color value = ' + blue)

		String rhex = Integer.toHexString(red)


		println(rhex)

		String ghex = Integer.toHexString(green)

		println(ghex)

		int glen = String.valueOf(ghex).length()

		println(glen)

		String grayc

		if (glen == 1) {
			grayc = ('0' + ghex)

			println(grayc)
		} else {
			println(ghex)
		}

		String bhex = Integer.toHexString(blue)

		println(bhex)

		int blen = String.valueOf(bhex).length()

		println(blen)

		String bluec

		if (blen == 1) {
			bluec = ('0' + bhex)

			println(bluec)
		} else {
			println(bhex)
		}

		String AShexcode1 = (('#' + rhex) + grayc) + bluec

		println(AShexcode1)

		String AShexcode = (('#' + rhex) + ghex) + bhex

		println(AShexcode)

		List<String> ColourCodelist = new ArrayList<String>()
		ColourCodelist.add("#d1d1d1")
		ColourCodelist.add("#d1d1b8")
		ColourCodelist.add("#bcd1bc")

		for (int i = 0;  i <=ColourCodelist.size()-1 ;  i++) {
			if (ColourCodelist.get(i).contains(AShexcode)) {
				String status = 'grey'
				return status
			}
		}
	}


	@Keyword
	public static String elementScreenshot(MobileDriver<MobileElement> driver, MobileElement ele,String imagename) {

		File screenshotLocation = null;
		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			BufferedImage  fullImg = ImageIO.read(scrFile)

			Point point = ele.getLocation()
			int eleWidth = ele.getSize().getWidth()
			int eleHeight = ele.getSize().getHeight()
			BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth,
					eleHeight)
			ImageIO.write(eleScreenshot, "png", scrFile)

			//String path = "screenshots/" + UUID.randomUUID() + "" + ".png";
			String path = "screenshots/" +imagename + "" + ".png"


			screenshotLocation = new File(System.getProperty("user.dir") + "/" + path)
			FileUtils.copyFile(scrFile, screenshotLocation)


			println(screenshotLocation.toString())


		} catch (IOException e) {
			e.printStackTrace()
		}
		return screenshotLocation.toString()
	}

	@Keyword
	public static String Verify_camera_colorof_image(String pathofLocator,String NameoftheImage) {

		MobileDriver<MobileElement> driver = MobileDriverFactory.getDriver()
		MobileElement Color = driver.findElementByXPath(pathofLocator)

		AndroidKeywords keyword =new AndroidKeywords();

		keyword.elementScreenshot(driver, Color, NameoftheImage)


		Point point = Color.getCenter()

		int centerx

		int centery

		centerx = point.getX()
		println(centerx)
		centerx = (centerx-10)
		centery = point.getY()

		File scrFile = ((driver) as TakesScreenshot).getScreenshotAs(OutputType.FILE)

		BufferedImage image = ImageIO.read(scrFile)

		int clr = image.getRGB(centerx, centery)

		println(clr)

		int red = (clr & 16711680) >> 16

		println(red)


		int green = (clr & 65280) >> 8

		println(green)

		int blue = clr & 255

		println(blue)

		println((((red + ',') + green) + ',') + blue)

		println('Red Color value = ' + red)

		println('Green Color value = ' + green)

		println('Blue Color value = ' + blue)

		String rhex = Integer.toHexString(red)


		println(rhex)

		String ghex = Integer.toHexString(green)

		println(ghex)

		int glen = String.valueOf(ghex).length()

		println(glen)

		String grayc

		if (glen == 1) {
			grayc = ('0' + ghex)

			println(grayc)
		} else {
			println(ghex)
		}

		String bhex = Integer.toHexString(blue)

		println(bhex)

		int blen = String.valueOf(bhex).length()

		println(blen)

		String bluec

		if (blen == 1) {
			bluec = ('0' + bhex)

			println(bluec)
		} else {
			println(bhex)
		}

		String AShexcode1 = (('#' + rhex) + grayc) + bluec

		println(AShexcode1)

		String AShexcode = (('#' + rhex) + ghex) + bhex

		println(AShexcode)

		return AShexcode
	}
}
