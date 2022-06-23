<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>VGP_SOD: To verify Camera Icon is displayed with Red color Manual P&amp;G and Non P&amp;G measure Mappings in VGP-SOD screen for Integer/Decimal type when Photo_Required is True in Measure Mapping at backend</description>
   <name>AISS-REGR_VGP_SOD_TC0019</name>
   <tag></tag>
   <elementGuidId>c81c51f3-e2fe-41fb-b4f0-88cc55718b3a</elementGuidId>
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
      <webElementGuid>f5cfceb9-64da-4411-9659-74e2a1a43fc2</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>d1663c85-7621-4a9a-8d49-7e6a9486aaa9</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=Select Market_Measure_Master__r.Type__c,Is_Competitor__c,Collection_Method__c, Instruction__c, Product_Category__r.Name,Product_Hierarchy__r.Name,Photo_Required__c from Measure_Mapping__c where (Market_Measure_Master__r.Type__c IN('Decimal' ,'Integer' )) and  Market_Measure_Master__r.Screen_Group__c ='VGP-SOD' and Valid_From__c &lt;= Today and Valid_Upto__c >= Today and Store_Hierarchy__r.Name = 'EMART_HM_Small' and Collection_Method__c ='Manual' and Photo_Required__c = true</restUrl>
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
