<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>VGP_SOS: To verify user is able to View captured images for  Manual P&amp;G and Non P&amp;G measure Mappings in VGP-SOS screen for Integer &amp; Decimal type</description>
   <name>AISS-REGR_VGP_SOS_TC0028</name>
   <tag></tag>
   <elementGuidId>2d27e842-3410-46d5-9e4c-50a7b3074c1c</elementGuidId>
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
      <webElementGuid>8b21868a-dbef-4834-966e-6de22aacc318</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>09e83c3b-9160-4af8-8028-eb5da5bd626d</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=Select Market_Measure_Master__r.Type__c,Is_Competitor__c,Collection_Method__c, Instruction__c, Product_Category__r.Name,Product_Hierarchy__r.Name from Measure_Mapping__c where (Market_Measure_Master__r.Type__c IN( 'Decimal','Integer' )) and  Market_Measure_Master__r.Screen_Group__c ='VGP-SOS' and Valid_From__c &lt;= Today and Valid_Upto__c >= Today and Store_Hierarchy__r.Name = 'EMART_HM_Small' AND Collection_Method__c = 'Manual' order by Product_Hierarchy__r.Name DESC</restUrl>
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
