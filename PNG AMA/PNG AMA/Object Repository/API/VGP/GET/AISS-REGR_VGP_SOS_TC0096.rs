<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>VGP_SOS: To verify Is Task Fixed label name is not displayed with Yes and NO options for VGP-SOS Open task  in VGP-SOS screen for Manual Measure mapping</description>
   <name>AISS-REGR_VGP_SOS_TC0096</name>
   <tag></tag>
   <elementGuidId>3c6c876d-d4b4-4c27-a85e-34e851b62e63</elementGuidId>
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
      <webElementGuid>7f6766be-db90-49dd-8495-af9f3c3c1636</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>0a01cfb2-7c3f-4ded-9a1b-6d2773d4ed24</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=select Is_Escalated__c,Status,Store__r.Name,Measure_Tracking__r.Measure_Mapping__r.Collection_Method__c, Measure_Tracking__r.Measure_Mapping__r.Instruction__c,Measure_Tracking__r.Target__c, Measure_Tracking__r.Product_Category__r.Name, Measure_Tracking__r.Product_Hierarchy__r.Name  from Task where Status ='Open'  and  Store__r.Name IN ('KIM JONG UN (Manual Store)','KIM JONG UN (IR Store)') AND Module_Type__c ='MENU_SOS' AND Measure_Tracking__r.Measure_Mapping__r.Collection_Method__c='Manual' order by Store__r.Name </restUrl>
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
