<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Select Is_Competitor__c,Market_Measure_Master__r.Type__c,Collection_Method__c, Instruction__c, Product_Category__r.Name,Product_Hierarchy__r.Name,Photo_Required__c from Measure_Mapping__c where (Market_Measure_Master__r.Type__c IN('Decimal' ,'Integer' )) and  Market_Measure_Master__r.Screen_Group__c ='VGP-SOS' and Valid_From__c &lt;= Today and Valid_Upto__c >= Today and Store_Hierarchy__r.Name = 'EMART_HM_Small' and Collection_Method__c ='Manual' and Photo_Required__c = false</description>
   <name>AISS-REGR_VGP_SOS_TC0035</name>
   <tag></tag>
   <elementGuidId>c13b15fc-5e71-4587-b5c5-14b57ff0a3a6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>OAuth ${AuthToken}</value>
      <webElementGuid>346074ac-f5f4-42f3-b85a-97ad8111d08a</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>4c7c5df9-65f3-4dbe-8143-94a05259bce9</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=Select Is_Competitor__c,Market_Measure_Master__r.Type__c,Collection_Method__c, Instruction__c, Product_Category__r.Name,Product_Hierarchy__r.Name,Photo_Required__c from Measure_Mapping__c where (Market_Measure_Master__r.Type__c IN('Decimal' ,'Integer' )) and  Market_Measure_Master__r.Screen_Group__c ='VGP-SOS' and Valid_From__c &lt;= Today and Valid_Upto__c >= Today and Store_Hierarchy__r.Name = 'EMART_HM_Small' and Collection_Method__c ='Manual' and Photo_Required__c = false order by Product_Hierarchy__r.Name DESC</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
