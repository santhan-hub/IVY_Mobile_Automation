<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>VGP_SOS: To verify background color is changing to Red background in VGP-SOS screen without Arrow mark when user select Reason code which is assigned to Merchandiser</description>
   <name>AISS-REGR_VGP_SOS_TC0082_reason_select</name>
   <tag></tag>
   <elementGuidId>28d42cfe-859d-4661-a5e1-5e31cea96926</elementGuidId>
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
      <webElementGuid>5c20e5ed-9fab-4ac4-a1da-9bcadf206bcb</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>a9f6e22e-c1ca-47dd-8c94-8a2910a4a41a</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=select ivybase__List_Name__c,Store_Hierarchy__c, ivybase__Display_Name__c, ivybase__Flex1__c,ivybase__List_Type__c,ivybase__Parent_Id__r.ivybase__List_Code__c  from ivybase__Standard_List_Master__c where ivybase__Location_Hierarchy__r.name ='Korea SMO' and ivybase__Resource_Type__r.Name ='KR Salesrep Sage' and ivybase__List_Type__c ='REASON' and ivybase__Flex1__c='MERCHANDISER' and Active__c ='Yes' and ivybase__Parent_Id__r.ivybase__List_Code__c ='ISSUE_SOS' AND Store_Hierarchy__c= 'EMART_HM_Small' AND         ivybase__List_Name__c!='OOS Which stops merch to execute display' Order by ivybase__List_Name__c</restUrl>
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
