<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>VGP_SOS: To verify background color is changing to Red background in VGP-SOS screen without Arrow mark when user select Reason code which is assigned to Merchandiser</description>
   <name>AISS-REGR_VGP_SOS_TC0082_storeselect</name>
   <tag></tag>
   <elementGuidId>32697ef1-0f70-4130-8f15-bda44be56374</elementGuidId>
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
      <webElementGuid>1f158aa3-5507-4dc3-8262-b28cbf3ddff1</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>1cf97a97-c014-4a04-94c3-c842b0f0b0eb</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=select Instruction__c,Is_ReasonCode_Required__c,Collection_Method__c,Product_Category__r.name,Product_Hierarchy__r.name from Measure_Mapping__c where Market_Measure_Master__r.Screen_Group__c ='VGP-SOS' and Store_Hierarchy__r.ivybase__Internal_Id__c ='416' and Valid_From__c &lt;= Today and Valid_Upto__c >= Today and Is_ReasonCode_Required__c = true AND Collection_Method__c= 'Manual' AND Is_Competitor__c=false  order by Product_Hierarchy__r.Name Desc</restUrl>
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
