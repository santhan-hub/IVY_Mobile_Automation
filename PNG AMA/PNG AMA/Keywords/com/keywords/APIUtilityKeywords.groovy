package com.keywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

import groovy.json.JsonSlurper
import io.appium.java_client.MobileElement

public class APIUtilityKeywords {



	@Keyword
	public HashMap<String ,String> get_category_and_product_name1(String Json_data,String Collection_Method_c,String Type__c ) {
		HashMap<String ,String> map =null;
		def Collection_Method_result =null;
		def Type__c_result =null;
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(Json_data)
		int categorySize = parsedJson.get('totalSize')

		List<MobileElement> apiCataegoryList = new ArrayList<String>()
		apiCataegoryList.add("FABRIC CARE")
		apiCataegoryList.add("DETERGENT")
		apiCataegoryList.add("ORAL CARE")
		apiCataegoryList.add("HOME CARE")
		apiCataegoryList.add("SHAVE CARE")
		apiCataegoryList.add("HAIR CARE")


		for (int i = 0; i <= (categorySize - 1); i++) {
			map =new HashMap<String ,String>();
			def dup_category = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
			if(apiCataegoryList.contains(dup_category)) {
				Collection_Method_result = parsedJson.get('records').get(i).get('Collection_Method__c')
				if(Collection_Method_result.equals(Collection_Method_c)) {

					Type__c_result = parsedJson.get('records').get(i).get('Market_Measure_Master__r').get('Type__c')
					if(Type__c_result.equals(Type__c)) {

						def Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
						def Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
						map.putAt("Category", Product_Category__r)
						map.putAt("Product_Name", Product_Hierarchy__r)
						map.putAt("Index", i)

						//KeywordUtil.logInfo ('Category  ' + Product_Category__r)
						//KeywordUtil.logInfo ('Measure_Mapping_name: ' + Product_Hierarchy__r)
						//KeywordUtil.logInfo ('Index: ' + i)
						break;
					}
				}
			}
		}
		return map
	}
	@Keyword
	public HashMap<String ,String> get_PNG_or_NONPNG_category_and_product_name1(String Json_data,boolean Is_Competitor__c,String Collection_Method_c,String Type__c ) {
		HashMap<String ,String> map =null;
		def Collection_Method_result =null;
		def Type__c_result =null;
		boolean Is_Competitor__c_result =null;
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(Json_data)
		int categorySize = parsedJson.get('totalSize')

		List<MobileElement> apiCataegoryList = new ArrayList<String>()
		apiCataegoryList.add("FABRIC CARE")
		apiCataegoryList.add("DETERGENT")
		apiCataegoryList.add("ORAL CARE")
		apiCataegoryList.add("HOME CARE")
		apiCataegoryList.add("SHAVE CARE")
		apiCataegoryList.add("HAIR CARE")


		for (int i = 0; i <= (categorySize - 1); i++) {
			map =new HashMap<String ,String>();
			def dup_category = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
			if(apiCataegoryList.contains(dup_category)) {

				Is_Competitor__c_result =parsedJson.get('records').get(i).get('Is_Competitor__c')

				if(Is_Competitor__c_result==Is_Competitor__c) {

					Collection_Method_result = parsedJson.get('records').get(i).get('Collection_Method__c')

					if(Collection_Method_result.equals(Collection_Method_c)) {

						Type__c_result = parsedJson.get('records').get(i).get('Market_Measure_Master__r').get('Type__c')
						if(Type__c_result.equals(Type__c)) {

							def Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
							def Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
							map.putAt("Category", Product_Category__r)
							map.putAt("Product_Name", Product_Hierarchy__r)
							map.putAt("Index", i)

							//KeywordUtil.logInfo ('Category  ' + Product_Category__r)
							//KeywordUtil.logInfo ('Measure_Mapping_name: ' + Product_Hierarchy__r)
							//KeywordUtil.logInfo ('Index: ' + i)
							break;
						}
					}
				}
			}
		}
		return map
	}

	@Keyword
	public HashMap<String ,String> get_PNG_or_NONPNG_category_and_product_name(String Json_data,boolean Is_Competitor__c,String Collection_Method_c,String Type__c ) {

		HashMap<String ,String> map =null;
		def Collection_Method_result =null;
		def Type__c_result =null;
		boolean Is_Competitor__c_result =null;
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(Json_data)
		int categorySize = parsedJson.get('totalSize')
		List<MobileElement> apiCataegoryList = new ArrayList<String>()
		apiCataegoryList.add("FABRIC CARE")
		apiCataegoryList.add("DETERGENT")
		apiCataegoryList.add("ORAL CARE")
		apiCataegoryList.add("HOME CARE")
		apiCataegoryList.add("SHAVE CARE")
		apiCataegoryList.add("HAIR CARE")

		for (int i = 0; i <= (categorySize - 1); i++) {
			map =new HashMap<String ,String>();
			try {
				def dup_category = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
				Collection_Method_result = parsedJson.get('records').get(i).get('Collection_Method__c')
				if(Collection_Method_result.equals(Collection_Method_c)) {

					Type__c_result = parsedJson.get('records').get(i).get('Market_Measure_Master__r').get('Type__c')
					if(Type__c_result==Type__c) {
						Is_Competitor__c_result = parsedJson.get('records').get(i).get('Is_Competitor__c')
						//KeywordUtil.logInfo('&&&&&&&&&&&&&&&&&&&&&&' +Is_Competitor__c)
						if(Is_Competitor__c_result==Is_Competitor__c) {
							try {
								String Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
								String Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
								//KeywordUtil.logInfo('#######################' +Product_Category__r)
								int flag=0
								for(int j=0;j<apiCataegoryList.size();j++) {
									if(Product_Category__r.contains(apiCataegoryList.get(j))) {
										//KeywordUtil.logInfo('*****************' +Product_Category__r)
										map.putAt("Category",apiCataegoryList.get(j) )
										map.putAt("Product_Name", Product_Hierarchy__r)
										map.putAt("Index", i)
										map.putAt("Sub_Cataegory", Product_Category__r)
										flag=1
										break;
									}

								}
								if(flag==1) {
									break;
								}
							}catch(Exception e) {
								e.println()
							}

						}else if(Is_Competitor__c_result==Is_Competitor__c) {
							try {
								def Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
								def Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
								map.putAt("Category", Product_Category__r)
								map.putAt("Product_Name", Product_Hierarchy__r)
								map.putAt("Index", i)
								break;
							}catch(Exception e){
								e.println()
							}
						}
					}
				}
			} catch(Exception e){
				e.println()
			}
		}
		return map
	}
	@Keyword
	public HashMap<String ,String> get_category_and_product_name(String Json_data,String Collection_Method_c,String Type__c ) {

		HashMap<String ,String> map =null;
		def Collection_Method_result =null;
		def Type__c_result =null;
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(Json_data)
		int categorySize = parsedJson.get('totalSize')
		List<MobileElement> apiCataegoryList = new ArrayList<String>()
		apiCataegoryList.add("FABRIC CARE")
		apiCataegoryList.add("DETERGENT")
		apiCataegoryList.add("ORAL CARE")
		apiCataegoryList.add("HOME CARE")
		apiCataegoryList.add("SHAVE CARE")
		apiCataegoryList.add("HAIR CARE")

		for (int i = 0; i <= (categorySize - 1); i++) {
			map =new HashMap<String ,String>();
			try {
				def dup_category = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
				Collection_Method_result = parsedJson.get('records').get(i).get('Collection_Method__c')
				if(Collection_Method_result.equals(Collection_Method_c)) {

					Type__c_result = parsedJson.get('records').get(i).get('Market_Measure_Master__r').get('Type__c')

					if(Type__c_result==Type__c) {

						try {
							def Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
							def Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')


							int flag=0
							for(int j=0;j<apiCataegoryList.size();j++) {
								if(Product_Category__r.contains(apiCataegoryList.get(j))) {
									map.putAt("Category",apiCataegoryList.get(j) )
									map.putAt("Product_Name", Product_Hierarchy__r)
									map.putAt("Index", i)
									map.putAt("Sub_Cataegory", Product_Category__r)
									flag=1
									break;
								}

							}
							if(flag==1) {
								break;
							}
							if(flag==0) {
								map.putAt("Category", Product_Category__r)
								map.putAt("Product_Name", Product_Hierarchy__r)
								map.putAt("Index", i)
								break;
							}

						}catch(Exception e){
							e.println()
						}

					}
				}
			} catch(Exception e){
				e.println()
			}
		}

		return map
	}
	@Keyword
	public HashMap<String ,String> get_category_and_product_name_when_Is_ReasonCode_Required(String Json_data, boolean Is_ReasonCode_Required){
		HashMap<String ,String> map =null;
		boolean Is_ReasonCode_Required_c=null;
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(Json_data)
		int categorySize = parsedJson.get('totalSize')
		try {
			for (int i = 0; i <= (categorySize - 1); i++) {
				map =new HashMap<String ,String>();
				Is_ReasonCode_Required_c = parsedJson.get('records').get(i).get('Is_ReasonCode_Required__c')
				if(Is_ReasonCode_Required_c==Is_ReasonCode_Required) {
					def Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
					def Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
					map.putAt("Category", Product_Category__r)
					map.putAt("Product_Name", Product_Hierarchy__r)
					map.putAt("Index", i)
					KeywordUtil.logInfo('Category : ' + map.get("Category"))
					KeywordUtil.logInfo('Product_Name : ' + map.get("Product_Name"))
					break;
				}
			}
		}catch(Exception e) {

			e.println()

		}
		return map
	}

	@Keyword
	public int get_product_name_Count_forsame_category(String Json_data, String category_name,String Product_name){
		int product_name_count = 1
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(Json_data)
		int categorySize = parsedJson.get('totalSize')
		try {
			for (int i = 0; i <= (categorySize - 1); i++) {

				String Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
				String Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')

				if(Product_Category__r.contains(category_name) && Product_Hierarchy__r.equals(Product_name)) {

					product_name_count=product_name_count+1
				}

			}
		}catch(Exception e) {

			e.println()

		}
		return product_name_count
	}

	@Keyword
	public HashMap<String ,String> get_category_and_product_name_irrespectiveof_Integer_or_Decimal(String Json_data,String Collection_Method_c) {

		HashMap<String ,String> map =null;
		def Collection_Method_result =null;
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(Json_data)
		int categorySize = parsedJson.get('totalSize')
		List<MobileElement> apiCataegoryList = new ArrayList<String>()
		apiCataegoryList.add("FABRIC CARE")
		apiCataegoryList.add("DETERGENT")
		apiCataegoryList.add("ORAL CARE")
		apiCataegoryList.add("HOME CARE")
		apiCataegoryList.add("SHAVE CARE")
		apiCataegoryList.add("HAIR CARE")

		for (int i = 0; i <= (categorySize - 1); i++) {
			map =new HashMap<String ,String>();
			try {
				def dup_category = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
				Collection_Method_result = parsedJson.get('records').get(i).get('Collection_Method__c')
				if(Collection_Method_result.equals(Collection_Method_c)) {

					try {
						def Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
						def Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')


						int flag=0
						for(int j=0;j<apiCataegoryList.size();j++) {
							if(Product_Category__r.contains(apiCataegoryList.get(j))) {
								map.putAt("Category",apiCataegoryList.get(j) )
								map.putAt("Product_Name", Product_Hierarchy__r)
								map.putAt("Index", i)
								map.putAt("Sub_Cataegory", Product_Category__r)
								flag=1
								break;
							}

						}
						if(flag==1) {
							break;
						}
						if(flag==0) {
							map.putAt("Category", Product_Category__r)
							map.putAt("Product_Name", Product_Hierarchy__r)
							map.putAt("Index", i)
							break;
						}

					}catch(Exception e){
						e.println()
					}


				}
			} catch(Exception e){
				e.println()
			}
		}

		return map
	}



	@Keyword
	public HashMap<String ,String> get_M2_PNG_or_NONPNG_category_and_product_name(String Json_data,boolean Is_Competitor__c,String Collection_Method_c,String Type__c ) {

		HashMap<String ,String> map =null;
		def Collection_Method_result =null;
		def Type__c_result =null;
		boolean Is_Competitor__c_result =null;
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(Json_data)
		int categorySize = parsedJson.get('totalSize')
		List<MobileElement> apiCataegoryList = new ArrayList<String>()
		apiCataegoryList.add("BABY CARE")
		apiCataegoryList.add("FABRIC SOFTENER")
		apiCataegoryList.add("FEMININE CARE")
		apiCataegoryList.add("HAIR CARE")
		apiCataegoryList.add("HOME CARE")
		apiCataegoryList.add("LAUNDRY")
		apiCataegoryList.add("ORAL CARE")
		apiCataegoryList.add("PERSONAL CARE")
		apiCataegoryList.add("PERSONAL HEALTHCARE")
		apiCataegoryList.add("SHAVE CARE FEMALE")
		apiCataegoryList.add("SHAVE CARE MALE")



		for (int i = 0; i <= (categorySize - 1); i++) {
			map =new HashMap<String ,String>();
			try {
				def dup_category = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
				Collection_Method_result = parsedJson.get('records').get(i).get('Collection_Method__c')
				if(Collection_Method_result.equals(Collection_Method_c)) {

					Type__c_result = parsedJson.get('records').get(i).get('Market_Measure_Master__r').get('Type__c')
					if(Type__c_result==Type__c) {
						Is_Competitor__c_result = parsedJson.get('records').get(i).get('Is_Competitor__c')
						KeywordUtil.logInfo('&&&&&&&&&&&&&&&&&&&&&&' +Is_Competitor__c)
						if(Is_Competitor__c_result==Is_Competitor__c) {
							try {
								String Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
								String Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
								KeywordUtil.logInfo('#######################' +Product_Category__r)
								int flag=0
								for(int j=0;j<apiCataegoryList.size();j++) {
									if(Product_Category__r.contains(apiCataegoryList.get(j))) {
										KeywordUtil.logInfo('*****************' +Product_Category__r)
										map.putAt("Category",apiCataegoryList.get(j) )
										map.putAt("Product_Name", Product_Hierarchy__r)
										map.putAt("Index", i)
										map.putAt("Sub_Cataegory", Product_Category__r)
										flag=1
										break;
									}

								}
								if(flag==1) {
									break;
								}
							}catch(Exception e) {
								e.println()
							}

						}else if(Is_Competitor__c_result==Is_Competitor__c) {
							try {
								def Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
								def Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')
								map.putAt("Category", Product_Category__r)
								map.putAt("Product_Name", Product_Hierarchy__r)
								map.putAt("Index", i)
								break;
							}catch(Exception e){
								e.println()
							}
						}
					}
				}
			} catch(Exception e){
				e.println()
			}
		}
		return map
	}




	@Keyword
	public HashMap<String ,String> get_category_and_product_name_when_Is_ReasonCode_Required1(String Json_data, boolean Is_ReasonCode_Required){
		HashMap<String ,String> map =null;
		boolean Is_ReasonCode_Required_c=null;
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(Json_data)
		int categorySize = parsedJson.get('totalSize')
		def Product_Category__r =null;
		List<MobileElement> apiCataegoryList = new ArrayList<String>()
		apiCataegoryList.add("FABRIC CARE")
		apiCataegoryList.add("DETERGENT")
		apiCataegoryList.add("ORAL CARE")
		apiCataegoryList.add("HOME CARE")
		apiCataegoryList.add("SHAVE CARE")
		apiCataegoryList.add("HAIR CARE")
		try {
			for (int i = 0; i <= (categorySize - 1); i++) {
				map =new HashMap<String ,String>();
				Is_ReasonCode_Required_c = parsedJson.get('records').get(i).get('Is_ReasonCode_Required__c')
				if(Is_ReasonCode_Required_c==Is_ReasonCode_Required) {
					try {
						def Product_Hierarchy__r = parsedJson.get('records').get(i).get('Product_Hierarchy__r').get('Name')
						Product_Category__r = parsedJson.get('records').get(i).get('Product_Category__r').get('Name')


						int flag=0
						for(int j=0;j<apiCataegoryList.size();j++) {
							if(Product_Category__r.contains(apiCataegoryList.get(j))) {
								map.putAt("Category",apiCataegoryList.get(j) )
								map.putAt("Product_Name", Product_Hierarchy__r)
								map.putAt("Index", i)
								map.putAt("Sub_Cataegory", Product_Category__r)
								flag=1
								break;
							}

						}
						if(flag==1) {
							break;
						}
						if(flag==0) {
							map.putAt("Category", Product_Category__r)
							map.putAt("Product_Name", Product_Hierarchy__r)
							map.putAt("Index", i)
							break;
						}

					}catch(Exception e){
						e.println()
					}
				}
			}
		}catch(Exception e) {

			e.println()

		}
		return map
	}



}


















