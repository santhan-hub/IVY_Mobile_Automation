<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>AISS-REGR_VGP_SOD_TC0111
===============================================
VGP_SOD:To verify Interim Task is changing to Open when user select Reason code which assigned to Merchandiser' in VGP-SOD screen</description>
   <name>AISS-REGR_VGP_SOD_TC0111</name>
   <tag></tag>
   <elementGuidId>a73f2a0f-bd18-430a-bb33-50b6bf504870</elementGuidId>
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
      <webElementGuid>c35035be-8f42-40bd-9a4b-eb9cc2008cac</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>27efb5c3-8e0c-407e-87fe-2f853d2935f0</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=select ivybase__List_Name__c,Store_Hierarchy__c, ivybase__Display_Name__c, ivybase__Flex1__c,ivybase__List_Type__c,ivybase__Parent_Id__r.ivybase__List_Code__c  from ivybase__Standard_List_Master__c where ivybase__Location_Hierarchy__r.name ='Korea SMO' and ivybase__Resource_Type__r.Name ='KR Salesrep Sage' and ivybase__List_Type__c ='REASON' and ivybase__Flex1__c ='MERCHANDISER' and Active__c ='Yes' and ivybase__Parent_Id__r.ivybase__List_Code__c ='ISSUE_SOD' AND Store_Hierarchy__c= 'EMART_HM_Small' AND ivybase__List_Name__c!= 'OOS Which stops merch to execute display' Order by ivybase__List_Name__c</restUrl>
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
