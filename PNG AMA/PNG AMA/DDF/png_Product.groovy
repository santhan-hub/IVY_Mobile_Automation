import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.ArrayList
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys

public class png_Product {

	int row = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('Navigation')

	String config = findTestData('PNG Product/Master/Master').getValue('Configuration', row)

	int rowSOL = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('SalesOrderLabel')

	String configSOL = findTestData('PNG Product/Master/Master').getValue('Configuration', rowSOL)

	int rowSOG = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('SalesOrderGrid')

	String configSOG = findTestData('PNG Product/Master/Master').getValue('Configuration', rowSOG)

	int rowSOV = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('SalesOrderView') - 1

	String configSOV = findTestData('PNG Product/Master/Master').getValue('Configuration', rowSOV)

	int rowSOVG = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('SalesOrderGrid')

	String configSOVG = findTestData('PNG Product/Master/Master').getValue('Configuration', rowSOVG)

	int rowSIV = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('SalesInvoiceViewLabel') - 1

	String configSIV = findTestData('PNG Product/Master/Master').getValue('Configuration', rowSIV)

	int rowSIVG = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('SalesInvoiceViewGrid') - 1

	String configSIVG = findTestData('PNG Product/Master/Master').getValue('Configuration', rowSIVG)

	int rowCD_s = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('CollectionDirect_Label_SalesPerson') - 1

	String configCD_s = findTestData('PNG Product/Master/Master').getValue('Configuration', rowCD_s)

	int rowCD_sG = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('CollectionDirect_GridLabel_SalesPerson')

	String configCD_sG = findTestData('PNG Product/Master/Master').getValue('Configuration', rowCD_sG)
	int rowCD_srr1 = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('CollectionDirect_Label_SRR1') - 1

	String configCD_srr1 = findTestData('PNG Product/Master/Master').getValue('Configuration', rowCD_srr1)

	int rowCD_srr1G = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('CollectionDirect_GridLabel_SRR1')

	String configCD_srr1G = findTestData('PNG Product/Master/Master').getValue('Configuration', rowCD_srr1G)
	int rowCD_invoice = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('CollectionDirect_Label_Invoice') - 1

	String configCD_invoice = findTestData('PNG Product/Master/Master').getValue('Configuration', rowCD_invoice)

	int rowCD_invoiceG = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('CollectionDirect_GridLabel_Invoice')-1
	String configCD_invoiceG = findTestData('PNG Product/Master/Master').getValue('Configuration', rowCD_invoiceG)

	ArrayList<String> CD_Invoice_element_label = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Sales Person', 'CollectionDirect_Label_Invoice')

	ArrayList<String> CD_S_element_label = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Sales Person', 'CollectionDirect_Label_SRR1')

	ArrayList<String> CD_SRR_element_label = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Sales Person', 'CollectionDirect_Label_SalesPerson')

	ArrayList<String> SIH_element_label = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Sales Person', 'SalesInvoiceViewLabel')

	//String navpath = 'PNG Product/Modules/Navigation/' + config

	ArrayList<String> SOH_element_label = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Sales Person', 'SalesOrderView')

	//	String navpath = 'PNG Product/Modules/Navigation/' + config

	ArrayList<String> element_label = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('SO Number', 'SalesOrderLabel')

	ArrayList<String> so_Data = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Retailer', 'SalesOrder')

	ArrayList<String> sales_Person = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Sales Person', 'SalesOrder')

	ArrayList<String> so_Date = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('SO Date', 'SalesOrder')

	ArrayList<String> exp_Del_Date = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Exp. Del. Date', 'SalesOrder')

	ArrayList<String> Warehouse = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Warehouse', 'SalesOrder')

	ArrayList<String> sku = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('SKU Name', 'SalesOrder')

	ArrayList<String> sku_Case = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Case', 'SalesOrder')

	ArrayList<String> sku_Piece = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Piece', 'SalesOrder')

	int rowSIL = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('SalesInvoice')

	String configSIL = findTestData('PNG Product/Master/Master').getValue('Configuration', rowSIL)

	int rowSIG = CustomKeywords.'poi.png_Product.GetSheetRow.getSheet'('SalesInvoiceGrid') - 1

	String configSIG = findTestData('PNG Product/Master/Master').getValue('Configuration', rowSIG)

	String navpath = 'PNG Product/Modules/Navigation/' + config

	ArrayList<String> SI_label = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Sales Person', 'SalesInvoice')

	ArrayList<String> SI_sales_Person = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Sales Person', 'SalesInvoicedata')

	ArrayList<String> SI_Route = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Route', 'SalesInvoicedata')

	ArrayList<String> SI_Retailer = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Retailer', 'SalesInvoicedata')

	ArrayList<String> SI_Status = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('Status', 'SalesInvoicedata')

	ArrayList<String> SI_SOfromDate = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('SO From Date', 'SalesInvoicedata')

	ArrayList<String> SI_SOtoDate = CustomKeywords.'poi.png_Product.Fetchvalue.getValue'('SO To Date', 'SalesInvoicedata')

	@Given("login using Branch User")
	def login_Branch_User() {
		WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/Login/Branch Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click on the Sales Order Menu")
	def Sales_Order_Menu() {
		
		WebUI.callTestCase(findTestCase('Cucumber/SalesOrder/Navigate to Sales Order'), [:], FailureHandling.STOP_ON_FAILURE)
		/*
		WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/DatePicker_and _Navigation/Navigation'), [('Navigation') : findTestData(
			navpath).getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)
		WebUI.sendKeys(null, Keys.chord(Keys.SPACE))
		WebUI.delay(10)
		WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Screen Header'), "Sales Order Creation")
		*/
	}

	@And("User verifying the labels in the sales Order screen")
	def Verify_Lables() {
		WebUI.callTestCase(findTestCase('Cucumber/SalesOrder/verify labels'), [:], FailureHandling.STOP_ON_FAILURE)
		/*for (int ind = 0; ind < element_label.size(); ind++) {
		 for (int i = 1; i < (findTestData('PNG Product/Modules/SalesOrderLabel/' + configSOL).getColumnNumbers() - 1); i++) {
		 GlobalVariable.label = findTestData('PNG Product/Modules/SalesOrderLabel/' + configSOL).getValue(i, 1).trim()
		 println(GlobalVariable.label)
		 GlobalVariable.label_object = findTestData('PNG Product/Modules/SalesOrderLabel/' + configSOL).getValue(i, 2).trim()
		 println(GlobalVariable.label_object)
		 WebUI.delay(5)
		 WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Label'), GlobalVariable.label_object)
		 if(WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
		 {
		 KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Label'))+" and "+GlobalVariable.label_object+" are Matched")
		 }
		 else
		 {
		 KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Label'))+" and "+GlobalVariable.label_object+" are not Matched")
		 }
		 WebUI.takeScreenshot()
		 }
		 }
		 */
	}

	@And("User verifying the grid labels in the sales order screen")
	def verify_grid_labels() {
		WebUI.callTestCase(findTestCase('Cucumber/SalesOrder/verify Grid labels'), [:], FailureHandling.STOP_ON_FAILURE)
		/*
		 for (int ind = 0; ind < element_label.size(); ind++) {
		 for (int gridindex = 1; gridindex < (findTestData('PNG Product/Modules/SalesOrderGrid/' + configSOG).getColumnNumbers() -
		 1); gridindex++) {
		 GlobalVariable.label = findTestData('PNG Product/Modules/SalesOrderGrid/' + configSOG).getValue(gridindex, 1).trim()
		 println(GlobalVariable.label)
		 GlobalVariable.label_object = findTestData('PNG Product/Modules/SalesOrderGrid/' + configSOG).getValue(gridindex,
		 2).trim()
		 println(GlobalVariable.label_object)
		 WebUI.delay(5)
		 WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Grid_Label'), GlobalVariable.label_object)
		 if(WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Grid_Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
		 {
		 KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Grid_Label'))+' and '+GlobalVariable.label_object+" are Matched")
		 }
		 else
		 {
		 KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Grid_Label'))+' and '+GlobalVariable.label_object+" are not Matched")
		 }
		 WebUI.takeScreenshot()
		 }
		 }
		 */
	}

	@Then("User verifying whether user can able to create sales Order")
	def verify_Sales_Order() {
		for (int ind = 0; ind < element_label.size(); ind++) {

			String SalesOrder_No = WebUI.getAttribute(findTestObject('PNG Product/Sales Order/SalesOrder_No'), 'value')

			GlobalVariable.SalesOrder_No = SalesOrder_No

			WebUI.sendKeys(findTestObject('PNG Product/Sales Order/Input_Salesperson'), sales_Person.get(ind))

			WebUI.delay(5)

			WebUI.sendKeys(findTestObject('PNG Product/Sales Order/Input_Salesperson'), Keys.chord(Keys.DOWN, Keys.ENTER))

			WebUI.delay(5)

			WebUI.sendKeys(findTestObject('PNG Product/Sales Order/Input_Retailer'), so_Data.get(ind))

			WebUI.delay(10)

			WebUI.sendKeys(findTestObject('PNG Product/Sales Order/Input_Retailer'), Keys.chord(Keys.DOWN, Keys.ENTER))

			WebUI.click(findTestObject('PNG Product/Sales Order/Input SO Date'))

			println(so_Date.get(ind))

			WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/DatePicker_and _Navigation/Date Picker'), [('DateValue') : so_Date.get(
				ind)], FailureHandling.STOP_ON_FAILURE)

			WebUI.click(findTestObject('PNG Product/Sales Order/Input_Exp. Del. Date'))

			WebUI.delay(5)

			WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/DatePicker_and _Navigation/Date Picker'), [('DateValue') : exp_Del_Date.get(
				ind)], FailureHandling.STOP_ON_FAILURE)

			WebUI.delay(5)

			WebUI.selectOptionByLabel(findTestObject('PNG Product/Sales Order/Warehouse'), Warehouse.get(ind), false)

			WebUI.delay(5)

			//WebUI.click(findTestObject('PNG Product/Sales Order/Search SKU'), FailureHandling.STOP_ON_FAILURE)
			WebUI.sendKeys(findTestObject('PNG Product/Sales Order/Search SKU'), sku.get(ind))

			WebUI.delay(5)

			WebUI.sendKeys(findTestObject('PNG Product/Sales Order/Search SKU'), Keys.chord(Keys.DOWN, Keys.ENTER))

			WebUI.delay(2)

			WebUI.click(findTestObject('PNG Product/Sales Order/Table Row'), FailureHandling.STOP_ON_FAILURE)

			WebUI.click(findTestObject('PNG Product/Sales Order/input_Case'))

			WebUI.delay(2)

			WebUI.sendKeys(findTestObject('PNG Product/Sales Order/input_Case'), sku_Case.get(ind))

			WebUI.delay(5)

			WebUI.click(findTestObject('PNG Product/Sales Order/input_Piece'))

			WebUI.delay(2)

			WebUI.sendKeys(findTestObject('PNG Product/Sales Order/input_Piece'), sku_Case.get(ind))

			WebUI.click(findTestObject('PNG Product/Sales Order/Table Row'), FailureHandling.STOP_ON_FAILURE)

			WebUI.delay(2)

			if (WebUI.verifyElementVisible(findTestObject('PNG Product/Sales Order/button_submit Order'), FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject('PNG Product/Sales Order/button_submit Order'))

				WebUI.delay(5)

				WebUI.click(findTestObject('PNG Product/Sales Order/Button yes Continue'))

				WebUI.takeScreenshot()
			} else {
				WebUI.click(findTestObject('PNG Product/Sales Order/button_Empties'))

				WebUI.delay(2)

				if (WebUI.verifyElementVisible(findTestObject('PNG Product/Sales Order/Empties/button_Close card Alert'), FailureHandling.OPTIONAL)) {

					WebUI.click(findTestObject('PNG Product/Sales Order/Empties/button_Close card Alert'))
				}

				WebUI.delay(2)

				WebUI.click(findTestObject('PNG Product/Sales Order/Empties/button_Submit Order'))

				WebUI.delay(10)

				WebUI.click(findTestObject('PNG Product/Sales Order/Button yes Continue'))
			}

			println(WebUI.getText(findTestObject('PNG Product/Sales Order/Order Submitted Successfully')))

			WebUI.takeScreenshot()
		}
	}
	@Then("close application")
	def Verify_End_OF_File()
	{
		WebUI.closeBrowser()
		//println(WebUI.getText(findTestObject('PNG Product/Sales Order/Order Submitted Successfully')))
	}


	@Given("login using Branch User and navigate to sales invoice")
	public void login_using_Branch_User_and_navigate_to_sales_invoice()
	{
		for (int SIind = 0; SIind < SI_label.size(); SIind++)
		{
			WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/Login/Branch Login'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("user click on the Sales invoice Menu")
	public void user_click_on_the_Sales_invoice_Menu()
	{
		for (int SIind = 0; SIind < SI_label.size(); SIind++)
		{
			WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/DatePicker_and _Navigation/Navigation'), [('Navigation') : findTestData(
				navpath).getValue(2, 2)], FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(10)
			WebUI.verifyElementText(findTestObject('PNG Product/Sales Invoice/Screen Header'), "Sales Invoice Creation")
		}
	}

	@When("User verifying the labels in the sales invoice screen")
	public void user_verifying_the_labels_in_the_sales_invoice_screen()
	{
		for (int SIind = 0; SIind < SI_label.size(); SIind++)
		{
			for (int si = 1; si < findTestData('PNG Product/Modules/SalesInvoice/Config1').getColumnNumbers(); si++)
			{
				GlobalVariable.label = findTestData('PNG Product/Modules/SalesInvoice/Config1').getValue(si, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/SalesInvoice/Config1').getValue(si, 1).trim()

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Label'), GlobalVariable.label_object)

				if(WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Label'))+" and "+GlobalVariable.label_object+" are Matched")
				}
				else
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Label'))+" and "+GlobalVariable.label_object+" are not Matched")
				}

				WebUI.takeScreenshot()
			}
		}
	}

	@When("User verifying the grid labels in the sales invoice screen")
	public void user_verifying_the_grid_labels_in_the_sales_invoice_screen()
	{
		for (int SIind = 0; SIind < SI_label.size(); SIind++)
		{
			for (int SIgridindex = 1; SIgridindex < (findTestData('PNG Product/Modules/SalesInvoiceGrid/' + configSIG).getColumnNumbers() -
			1); SIgridindex++) {
				GlobalVariable.label = findTestData('PNG Product/Modules/SalesInvoiceGrid/' + configSIG).getValue(SIgridindex, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/SalesInvoiceGrid/' + configSIG).getValue(SIgridindex,
						2).trim()

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Sales Invoice/grid_Label'), GlobalVariable.label_object)
				if(WebUI.verifyElementText(findTestObject('PNG Product/Sales Invoice/grid_Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Invoice/grid_Label'))+" and "+GlobalVariable.label_object+" are Matched")
				}
				else
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Invoice/grid_Label'))+" and "+GlobalVariable.label_object+" are not Matched")
				}
				WebUI.takeScreenshot()
			}
		}

	}

	@When("User verifying whether user can able to create sales invoice")
	public void user_verifying_whether_user_can_able_to_create_sales_invoice()
	{
		for (int SIind = 0; SIind < SI_label.size(); SIind++)
		{
			WebUI.sendKeys(findTestObject('PNG Product/Sales Invoice/input_Sales_Person'), SI_sales_Person.get(SIind))

			WebUI.sendKeys(findTestObject('PNG Product/Sales Invoice/input_Sales_Person'), Keys.chord(Keys.DOWN, Keys.ENTER))

			WebUI.sendKeys(findTestObject('PNG Product/Sales Invoice/input_Route'), SI_Route.get(SIind))

			WebUI.sendKeys(findTestObject('PNG Product/Sales Invoice/input_Route'), Keys.chord(Keys.DOWN, Keys.ENTER))

			WebUI.sendKeys(findTestObject('PNG Product/Sales Invoice/input_Retailer'), SI_Retailer.get(SIind))

			WebUI.sendKeys(findTestObject('PNG Product/Sales Invoice/input_Retailer'), Keys.chord(Keys.DOWN, Keys.ENTER))

			WebUI.selectOptionByLabel(findTestObject('PNG Product/Sales Invoice/select_Status'), SI_Status.get(SIind), false)

			WebUI.click(findTestObject('PNG Product/Sales Invoice/SO From Date'))

			WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/DatePicker_and _Navigation/Date Picker'), [('DateValue') : SI_SOfromDate.get(
				SIind)], FailureHandling.STOP_ON_FAILURE)

			WebUI.click(findTestObject('PNG Product/Sales Invoice/SO To Date'))

			WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/DatePicker_and _Navigation/Date Picker'), [('DateValue') : SI_SOtoDate.get(
				SIind)], FailureHandling.STOP_ON_FAILURE)

			WebUI.click(findTestObject('PNG Product/Sales Invoice/button_Search'))

			WebUI.delay(5)

			WebUI.click(findTestObject('PNG Product/Sales Invoice/Grid Filter'))

			WebUI.sendKeys(findTestObject('PNG Product/Sales Invoice/GridFilter/input_SO No'), GlobalVariable.SalesOrder_No)

			WebUI.click(findTestObject('PNG Product/Sales Invoice/GridFilter/button_Apply'))
			WebUI.verifyElementPresent(findTestObject('PNG Product/Sales Invoice/salesOrder_no'), 0)

			WebUI.takeScreenshot()

			WebUI.click(findTestObject('PNG Product/Sales Invoice/button_GenerateInvoice'))

			WebUI.delay(10)

			WebUI.verifyElementPresent(findTestObject('PNG Product/Sales Invoice/button_Submit'), 0)

			WebUI.click(findTestObject('PNG Product/Sales Invoice/button_Submit'))

			WebUI.takeScreenshot()

			WebUI.verifyElementPresent(findTestObject('PNG Product/Sales Invoice/button_Save Invoice'), 0)

			WebUI.click(findTestObject('PNG Product/Sales Invoice/button_Save Invoice'))

			WebUI.takeScreenshot()

			String invoice_no=WebUI.getText(findTestObject('PNG Product/Sales Invoice/Order Submitted Successfully'))
			println invoice_no
			WebUI.takeScreenshot()
			GlobalVariable.salesInvoice_No=invoice_no.replace(" - Submitted Successfully","")

		}
	}

	@When("user click on the Sales Order History Menu")
	public void user_click_on_the_Sales_Order_History_Menu() {
		WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/DatePicker_and _Navigation/Navigation'), [('Navigation') : findTestData(
			navpath).getValue(2, 3)], FailureHandling.STOP_ON_FAILURE)
		WebUI.sendKeys(null, Keys.chord(Keys.SPACE))
		WebUI.delay(10)
		WebUI.verifyElementText(findTestObject('PNG Product/Sales Invoice/Screen Header'), "Sales Order Edit & View")

	}

	@When("User verifying the labels in the sales Order History screen")
	public void user_verifying_the_labels_in_the_sales_Order_History_screen()
	{
		for (int ind = 0; ind < SOH_element_label.size(); ind++)
		{
			for (int i = 1; i < (findTestData('PNG Product/Modules/SalesOrderView/' + configSOV).getColumnNumbers() - 1); i++) {
				GlobalVariable.label = findTestData('PNG Product/Modules/SalesOrderView/' + configSOV).getValue(i, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/SalesOrderView/' + configSOV).getValue(i, 2).trim()

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Label'), GlobalVariable.label_object)

				if(WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Label'))+' and '+GlobalVariable.label_object+" are Matched")
				}
				else
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Label'))+' and '+GlobalVariable.label_object+" are not Matched")
				}

				WebUI.takeScreenshot()
			}
		}

	}

	@When("User verifying the grid labels in the sales order History screen")
	public void user_verifying_the_grid_labels_in_the_sales_order_History_screen()
	{
		for (int ind = 0; ind < SOH_element_label.size(); ind++)
		{
			for (int gridindex = 1; gridindex < (findTestData('PNG Product/Modules/SalesOrderViewGrid/' + configSOVG).getColumnNumbers()); gridindex++) {
				GlobalVariable.label = findTestData('PNG Product/Modules/SalesOrderViewGrid/' + configSOVG).getValue(gridindex, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/SalesOrderViewGrid/' + configSOVG).getValue(gridindex,
						2).trim()

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Grid_Label'), GlobalVariable.label_object)

				if(WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Grid_Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Grid_Label'))+' and '+GlobalVariable.label_object+" are Matched")
				}
				else
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Grid_Label'))+' and '+GlobalVariable.label_object+" are not Matched")
				}

				WebUI.takeScreenshot()
			}
		}
	}

	@When("User verifying whether user can able to view created sales Order in sales Order History")
	public void User_verifying_whether_user_can_able_to_view_created_sales_Order_in_sales_Order_History()
	{
		WebUI.click(findTestObject('PNG Product/Sales Order View/button_Search'))

		WebUI.delay(5)

		WebUI.click(findTestObject('PNG Product/Sales Invoice/Grid Filter'))

		WebUI.sendKeys(findTestObject('PNG Product/Sales Order View/GridFilter/input_SO Number'), GlobalVariable.SalesOrder_No)

		WebUI.click(findTestObject('PNG Product/Sales Order View/GridFilter/button_Apply'))

		WebUI.verifyElementPresent(findTestObject('PNG Product/Sales Order View/Grid Data/SO Number'), 0)

	}

	@When("user click on the Sales Invoice History Menu")
	public void user_click_on_the_Sales_Invoice_History_Menu()
	{
		for (int ind = 0; ind < SIH_element_label.size(); ind++) {
			WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/DatePicker_and _Navigation/Navigation'), [('Navigation') : findTestData(
				navpath).getValue(2, 4)], FailureHandling.STOP_ON_FAILURE)
			WebUI.sendKeys(null, Keys.chord(Keys.SPACE))
			WebUI.delay(10)
			WebUI.verifyElementText(findTestObject('PNG Product/Sales Invoice/Screen Header'), "Sales Invoice View")
		}
	}

	@When("User verifying the labels in the sales Invoice History screen")
	public void user_verifying_the_labels_in_the_sales_Invoice_History_screen()
	{
		for (int ind = 0; ind < SIH_element_label.size(); ind++) {
			for (int i = 1; i < findTestData('PNG Product/Modules/SalesInvoiceViewLabel/' + configSIV).getColumnNumbers(); i++) {
				GlobalVariable.label = findTestData('PNG Product/Modules/SalesInvoiceViewLabel/' + configSIV).getValue(i, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/SalesInvoiceViewLabel/' + configSIV).getValue(i,
						2).trim()

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Label'), GlobalVariable.label_object)

				if(WebUI.verifyElementText(findTestObject('PNG Product/Sales Order/Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Label'))+' and '+GlobalVariable.label_object+" are Matched")
				}
				else
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Order/Label'))+' and '+GlobalVariable.label_object+" are not Matched")
				}

				WebUI.takeScreenshot()
			}
		}
	}

	@When("User verifying the grid labels in the sales Invoice History screen")
	public void user_verifying_the_grid_labels_in_the_sales_Invoice_History_screen()
	{
		for (int ind = 0; ind < SIH_element_label.size(); ind++) {
			for (int gridindex = 1; gridindex < findTestData('PNG Product/Modules/SalesInvoiceViewGrid/' + configSIVG).getColumnNumbers(); gridindex++)
			{
				GlobalVariable.label = findTestData('PNG Product/Modules/SalesInvoiceViewGrid/' + configSIVG).getValue(gridindex,
						1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/SalesInvoiceViewGrid/' + configSIVG).getValue(gridindex,
						2).trim()

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Sales Invoice View/Grid_Label'), GlobalVariable.label_object)

				if(WebUI.verifyElementText(findTestObject('PNG Product/Sales Invoice View/Grid_Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Invoice View/Grid_Label'))+' and '+GlobalVariable.label_object+" are Matched")
				}
				else
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Sales Invoice View/Grid_Label'))+' and '+GlobalVariable.label_object+" are not Matched")
				}

				WebUI.takeScreenshot()
			}
		}
	}

	@When("User verifying whether user can able to view created sales Invoice in sales Invoice History")
	public void user_verifying_whether_user_can_able_to_view_created_sales_Invoice_in_sales_Invoice_History()
	{
		for (int ind = 0; ind < SIH_element_label.size(); ind++)
		{
			WebUI.click(findTestObject('PNG Product/Sales Invoice View/button_Search'))

			WebUI.click(findTestObject('PNG Product/Sales Invoice View/Grid Filter'))

			WebUI.sendKeys(findTestObject('PNG Product/Sales Invoice View/GridFilter/input_invoice_no'), GlobalVariable.salesInvoice_No)

			WebUI.click(findTestObject('PNG Product/Sales Invoice View/GridFilter/button_Apply'))

			WebUI.verifyElementPresent(findTestObject('PNG Product/Sales Invoice View/Grid Data/Invoice_No'), 0)
		}

	}

	@Then("close Sales Invoice and close application")
	def close_Sales_Invoice_and_close_application()
	{
		WebUI.closeBrowser()
	}

	@When("user click on the Collection Direct new Menu")
	public void user_click_on_the_Collection_Direct_new_Menu()
	{
		WebUI.callTestCase(findTestCase('PNG Product/Re-Usables/DatePicker_and _Navigation/Navigation'), [('Navigation') : findTestData(
			navpath).getValue(2, 5)], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(10)

		WebUI.verifyElementText(findTestObject('PNG Product/common object/Screen_header'), 'Collection Direct')
	}

	@When("User verifying the labels in the Collection Direct new screen for sales person")
	public void user_verifying_the_labels_in_the_Collection_Direct_new_screen_for_sales_person()
	{
		for (int ind = 0; ind < CD_S_element_label.size(); ind++) {
			for (int i = 1; i < (findTestData('PNG Product/Modules/CollectionDirect_Label_SalesPerson/' + configCD_s).getColumnNumbers() -
			1); i++) {
				GlobalVariable.label = findTestData('PNG Product/Modules/CollectionDirect_Label_SalesPerson/' + configCD_s).getValue(
						i, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/CollectionDirect_Label_SalesPerson/' + configCD_s).getValue(
						i, 2).trim()

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				println(WebUI.getText(findTestObject('PNG Product/Collection Direct New/Label')))

				WebUI.verifyElementText(findTestObject('PNG Product/Collection Direct New/Label'), GlobalVariable.label_object)

				if(WebUI.verifyElementText(findTestObject('PNG Product/Collection Direct New/Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Collection Direct New/Label'))+' and '+GlobalVariable.label_object+" are Matched")
				}
				else
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Collection Direct New/Label'))+' and '+GlobalVariable.label_object+" are not Matched")
				}

				WebUI.takeScreenshot()
			}


		}
	}

	@When("User verifying the labels in the Collection Direct new screen for SRR1")
	public void user_verifying_the_labels_in_the_Collection_Direct_new_screen_for_SRR()
	{
		for (int ind = 0; ind < CD_SRR_element_label.size(); ind++)
		{
			WebUI.click(findTestObject('PNG Product/Collection Direct New/radio_Button_SRR1'))
			for (int gridindex = 1; gridindex < (findTestData('PNG Product/Modules/CollectionDirect_GridLabel_SRR1/' + configCD_srr1G).getColumnNumbers() -
			1); gridindex++)
			{
				GlobalVariable.label = findTestData('PNG Product/Modules/CollectionDirect_GridLabel_SRR1/' + configCD_srr1G).getValue(
						gridindex, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/CollectionDirect_GridLabel_SRR1/' + configCD_srr1G).getValue(
						gridindex, 2)

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Collection Direct New/Grid_Label'), GlobalVariable.label_object)

				if(WebUI.verifyElementText(findTestObject('PNG Product/Collection Direct New/Grid_Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Collection Direct New/Grid_Label'))+' and '+GlobalVariable.label_object+" are Matched")
				}
				else
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Collection Direct New/Grid_Label'))+' and '+GlobalVariable.label_object+" are not Matched")
				}

				WebUI.takeScreenshot()
			}

		}

	}

	@When("User verifying the labels in the Collection Direct new screen for Invoice")
	public void user_verifying_the_labels_in_the_Collection_Direct_new_screen_for_Invoice()
	{
		for (int ind = 0; ind < CD_Invoice_element_label.size(); ind++)
		{
			WebUI.click(findTestObject('PNG Product/Collection Direct New/radio_Button_By_Invoice'))

			for (int i = 1; i < (findTestData('PNG Product/Modules/CollectionDirect_Label_Invoice/' + configCD_invoice).getColumnNumbers() -
			1); i++) {
				GlobalVariable.label = findTestData('PNG Product/Modules/CollectionDirect_Label_Invoice/' + configCD_invoice).getValue(i,
						1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/CollectionDirect_Label_Invoice/' + configCD_invoice).getValue(i, 2).trim()

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				println(WebUI.getText(findTestObject('PNG Product/Collection Direct New/Label')))

				WebUI.verifyElementText(findTestObject('PNG Product/Collection Direct New/Label'), GlobalVariable.label_object)

				if(WebUI.verifyElementText(findTestObject('PNG Product/Collection Direct New/Label'), GlobalVariable.label_object, FailureHandling.OPTIONAL))
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Collection Direct New/Label'))+' and '+GlobalVariable.label_object+" are Matched")
				}
				else
				{
					KeywordUtil.logInfo(WebUI.getText(findTestObject('PNG Product/Collection Direct New/Label'))+' and '+GlobalVariable.label_object+" are not Matched")
				}

				WebUI.takeScreenshot()
			}

		}

	}

	@When("User verifying the grid labels in the Collection Direct new screen for sales person")
	public void user_verifying_the_grid_labels_in_the_Collection_Direct_new_screen_for_sales_person()
	{
		for (int ind = 0; ind < CD_S_element_label.size(); ind++) {
			WebUI.click(findTestObject('PNG Product/Collection Direct New/radio_Button_SalesPerson'))
			WebUI.delay(5)
			for (int gridindex = 1; gridindex < (findTestData('PNG Product/Modules/CollectionDirect_GridLabel_SalesPerson/' + configCD_sG).getColumnNumbers() -
			1); gridindex++) {
				GlobalVariable.label = findTestData('PNG Product/Modules/CollectionDirect_GridLabel_SalesPerson/' + configCD_sG).getValue(
						gridindex, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/CollectionDirect_GridLabel_SalesPerson/' + configCD_sG).getValue(
						gridindex, 2)

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Collection Direct New/Grid_Label'), GlobalVariable.label_object)

				WebUI.takeScreenshot()
			}
		}
	}


	@When("User verifying the grid labels in the Collection Direct new screen for SRR1")
	public void user_verifying_the_grid_labels_in_the_Collection_Direct_new_screen_for_SRR1()
	{
		for (int ind = 0; ind < CD_SRR_element_label.size(); ind++)
		{
			WebUI.click(findTestObject('PNG Product/Collection Direct New/radio_Button_SRR1'))
			WebUI.delay(5)
			for (int gridindex = 1; gridindex < (findTestData('PNG Product/Modules/CollectionDirect_GridLabel_SRR1/' + configCD_srr1G).getColumnNumbers() -
			1); gridindex++)
			{
				GlobalVariable.label = findTestData('PNG Product/Modules/CollectionDirect_GridLabel_SRR1/' + configCD_srr1G).getValue(
						gridindex, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/CollectionDirect_GridLabel_SRR1/' + configCD_srr1G).getValue(
						gridindex, 2)

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Collection Direct New/Grid_Label'), GlobalVariable.label_object)

				WebUI.takeScreenshot()
			}
		}
	}

	@When("User verifying the grid labels in the Collection Direct new screen for Invoice")
	public void user_verifying_the_grid_labels_in_the_Collection_Direct_new_screen_for_Invoice()
	{
		for (int ind = 0; ind < CD_Invoice_element_label.size(); ind++)
		{
			WebUI.click(findTestObject('PNG Product/Collection Direct New/radio_Button_By_Invoice'))
			WebUI.delay(5)
			for (int gridindex = 1; gridindex <=(findTestData('PNG Product/Modules/CollectionDirect_GridLabel_Invoice/' + configCD_invoiceG).getColumnNumbers()-1); gridindex++) {
				GlobalVariable.label = findTestData('PNG Product/Modules/CollectionDirect_GridLabel_Invoice/' + configCD_invoiceG).getValue(gridindex, 1).trim()

				println(GlobalVariable.label)

				GlobalVariable.label_object = findTestData('PNG Product/Modules/CollectionDirect_GridLabel_Invoice/' + configCD_invoiceG).getValue(gridindex,2)

				println(GlobalVariable.label_object)

				WebUI.delay(5)

				WebUI.verifyElementText(findTestObject('PNG Product/Collection Direct New/Grid_Label_invoice'), GlobalVariable.label_object)

				WebUI.takeScreenshot()
			}
		}
	}

}
