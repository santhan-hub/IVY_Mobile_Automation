<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>select Is_Competitor__c,Target__c,Collection_Method__c,Product_Category__r.name,Product_Hierarchy__r.name from Measure_Mapping__c where Market_Measure_Master__r.Screen_Group__c ='VGP-SOD' and Store_Hierarchy__r.ivybase__Internal_Id__c ='416' and Valid_Upto__c >=TODAY and Is_Competitor__c =TRUE order by Collection_Method__c,Product_Category__r.Name,Product_Hierarchy__r.Name</description>
   <name>AISS-REGR_VGP_SOD_TC0048</name>
   <tag></tag>
   <elementGuidId>ef56138f-460f-4d83-9d49-4e91e073abeb</elementGuidId>
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
      <webElementGuid>76fa5c7a-b46c-4974-a5d9-fc0aaf4cd1ca</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>ebdc1df6-acfb-4166-a196-d272c894ed47</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=select Is_Competitor__c,Target__c,Collection_Method__c,Market_Measure_Master__r.Type__c,Instruction__c,Product_Category__r.name,Product_Hierarchy__r.name from Measure_Mapping__c where Market_Measure_Master__r.Screen_Group__c ='VGP-SOD' and Store_Hierarchy__r.ivybase__Internal_Id__c ='416' and Valid_Upto__c >=TODAY and Is_Competitor__c =TRUE order by Collection_Method__c,Product_Category__r.Name,Product_Hierarchy__r.Name</restUrl>
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
