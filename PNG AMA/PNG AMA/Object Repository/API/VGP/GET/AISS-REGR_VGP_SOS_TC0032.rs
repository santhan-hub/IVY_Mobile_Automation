<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>AISS-REGR_VGP_SOS_TC0032

VGP_SOS: To verify when actual is Blank user is not enforcing to capture mandatory photo in VGP-SOS screen for Manual P&amp;G and Non P&amp;G Integer &amp; Decimal measure mappings when tap on Proceed To Summary button without capturing photo if camera icon displayed in Blue color</description>
   <name>AISS-REGR_VGP_SOS_TC0032</name>
   <tag></tag>
   <elementGuidId>c45ba2b4-c799-4a49-aeff-898d626bbbcb</elementGuidId>
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
      <webElementGuid>1b7fb8d3-d787-453b-8887-32ccba636eab</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>55488834-a992-4d58-8c32-3c1a3e66199e</webElementGuid>
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
