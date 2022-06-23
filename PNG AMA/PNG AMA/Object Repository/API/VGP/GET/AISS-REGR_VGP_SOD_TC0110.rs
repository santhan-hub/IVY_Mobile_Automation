<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>AISS-REGR_VGP_SOD_TC0110</name>
   <tag></tag>
   <elementGuidId>bc260e35-8ec3-4a87-a395-85700729be82</elementGuidId>
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
      <webElementGuid>64b8bd86-0e5f-4c86-aefd-78336bf2e4ed</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>3793a318-f8ba-4edc-baa7-8eb1ac784a80</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=select Measure_Tracking__r.Measure_Mapping__r.Collection_Method__c,Status,Is_Escalated__c,Store__r.Name,Measure_Tracking__r.Product_Category_Name__c,ivybase__Product_Hierarchy__r.Name,Measure_Tracking__r.Measure_Mapping_Instruction__c from task where Status ='Open' and Measure_Tracking__r.Measure_Mapping__r.Market_Measure_Master__r.Screen_Group__c ='VGP-SOD' and Store__r.name IN ('KIM JONG UN (Manual Store)','KIM JONG UN (IR Store)') AND Is_Escalated__c= false AND Measure_Tracking__r.Measure_Mapping__r.Collection_Method__c='MANUAL' order by ivybase__Product_Hierarchy__r.Name,Store__r.Name</restUrl>
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
