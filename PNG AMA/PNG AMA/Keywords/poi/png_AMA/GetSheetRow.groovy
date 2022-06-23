package poi.png_AMA

import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook

import com.kms.katalon.core.annotation.Keyword


public class GetSheetRow {
	@Keyword
	public int getSheet(String Sheet_name){
		String Masterfile = 'DDF//PNG Product//Master//Master.xlsx'

		Workbook WorkBook =ExcelKeywords.getWorkbook(Masterfile)

		Sheet configSheet = ExcelKeywords.getExcelSheet(WorkBook,"Master" )

		int rowindex=ExcelKeywords.getRowIndexByCellContent(configSheet,Sheet_name, 3)

		return rowindex+1
	}
}
