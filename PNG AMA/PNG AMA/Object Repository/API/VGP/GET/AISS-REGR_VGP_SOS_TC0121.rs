<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>AISS-REGR_VGP_SOS_TC0121
VGP_SOS:To verify Open Task is changing to IR when user Capture Image and Come back from Ghibli-Shlef screen by selecting Yes option from Is Task Fixed label in VGP-SOS screen (Yes=True, background color = Yellow)</description>
   <name>AISS-REGR_VGP_SOS_TC0121</name>
   <tag></tag>
   <elementGuidId>9e78c381-df8d-47e7-907b-f06ae5540a63</elementGuidId>
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
      <webElementGuid>5d028f85-66e1-4eee-b600-d56ba49e6da7</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>99423201-1681-441c-ac13-067b34f49a87</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=select Is_Escalated__c,Status,Store__r.Name,Measure_Tracking__r.Measure_Mapping__r.Collection_Method__c, Measure_Tracking__r.Measure_Mapping__r.Instruction__c,Measure_Tracking__r.Target__c, Measure_Tracking__r.Product_Category__r.Name, Measure_Tracking__r.Product_Hierarchy__r.Name  from Task where Status ='Open'  and  Store__r.Name IN ('KIM JONG UN (Manual Store)','KIM JONG UN (IR Store)') AND Module_Type__c ='MENU_SOS' AND Measure_Tracking__r.Measure_Mapping__r.Collection_Method__c='IR' AND Is_Escalated__c = false order by Store__r.Name </restUrl>
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
