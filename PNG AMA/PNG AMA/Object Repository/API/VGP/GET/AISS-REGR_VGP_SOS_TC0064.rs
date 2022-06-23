<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>VGP_SOS: To verify Variant level data is displayed when user tap on Up Arrow mark in VGP-SOS screen for Manual P&amp;G and Non P&amp;G  Measures for Integer &amp; Decimal types if variant level data is available</description>
   <name>AISS-REGR_VGP_SOS_TC0064</name>
   <tag></tag>
   <elementGuidId>896ecc58-bbca-443e-ab4e-984b9d1eb5c2</elementGuidId>
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
      <webElementGuid>d6f0dffc-da26-4422-bac1-f66182f6706f</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>30476a34-5080-4092-bd35-3aefb3778211</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=SELECT Collection_Method__c,Product_Hierarchy__r.Name,Product_Category__r.Name,Instruction__c,Is_Competitor__c,Market_Measure_Master__r.Type__c  from Measure_Mapping__c   where  Product_Hierarchy__c IN (SELECT Product_Hierarchy__c from Product_Attribute_Mapping__c  WHERE Product_Attribute__r.RecordType.Name ='Variant' and Location_Hierarchy__r.Name ='South Africa SMO') AND Store_Hierarchy__r.ivybase__Internal_Id__c ='1370' AND Valid_From__C&lt;= today AND Valid_Upto__c>= today</restUrl>
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
