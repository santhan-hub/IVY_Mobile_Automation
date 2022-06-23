package com.keywords

import com.kms.katalon.core.annotation.Keyword

import net.sourceforge.tess4j.ITesseract
import net.sourceforge.tess4j.Tesseract
import net.sourceforge.tess4j.TesseractException

public class ReadImage {

	@Keyword
	public static String crackingImage(String filePath){

		File imageFile = new File(filePath)

		ITesseract instance = new Tesseract()

		try {
			instance.setDatapath("F:\\PNG AMA\\Mobile\\PNG AMA\\tessdata")
			String result = instance.doOCR(imageFile)
			return 	result
		} catch (TesseractException e) {
			println e.getMessage()
			return 'Error while reading image'
		}
	}
}
