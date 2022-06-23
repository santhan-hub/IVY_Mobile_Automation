<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>AISS-REGR_VGP_SOS_TC0094
===============================================
VGP_SOS: To verify Is Task Fixed label name is displayed with Yes and NO options for VGP-SOS Open Task in VGP-SOS screen for IR Measure mapping</description>
   <name>AISS-REGR_VGP_SOS_TC0094</name>
   <tag></tag>
   <elementGuidId>e8e897b7-5162-480a-978e-878e882e500c</elementGuidId>
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
      <webElementGuid>04813a54-7d9e-47b0-b108-849bca054fd5</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>ce4c22c4-81ca-4fea-9338-03fc513e221b</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=select Is_Escalated__c,Status,Store__r.Name,Measure_Tracking__r.Measure_Mapping__r.Collection_Method__c, Measure_Tracking__r.Measure_Mapping__r.Instruction__c,Measure_Tracking__r.Target__c, Measure_Tracking__r.Product_Category__r.Name, Measure_Tracking__r.Product_Hierarchy__r.Name  from Task where Status ='Open'  and  Store__r.Name IN ('KIM JONG UN (Manual Store)','KIM JONG UN (IR Store)') AND Module_Type__c ='MENU_SOS' AND Measure_Tracking__r.Measure_Mapping__r.Collection_Method__c='IR' order by Store__r.Name </restUrl>
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
