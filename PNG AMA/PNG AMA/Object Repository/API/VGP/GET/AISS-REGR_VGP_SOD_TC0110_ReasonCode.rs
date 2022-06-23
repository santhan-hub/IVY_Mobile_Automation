<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>AISS-REGR_VGP_SOD_TC0110_ReasonCode</name>
   <tag></tag>
   <elementGuidId>316852f7-aae4-4c3f-a55f-8f2ff792d51c</elementGuidId>
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
      <webElementGuid>f248d20f-d567-480f-8e52-73e29af4cd37</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>1b4be541-db49-4be9-8312-4c041064a07e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=select ivybase__List_Name__c,Store_Hierarchy__c, ivybase__Display_Name__c, ivybase__Flex1__c,ivybase__List_Type__c,ivybase__Parent_Id__r.ivybase__List_Code__c  from ivybase__Standard_List_Master__c where ivybase__Location_Hierarchy__r.name ='Korea SMO' and ivybase__Resource_Type__r.Name ='KR Salesrep Sage' and ivybase__List_Type__c ='REASON' and  Active__c ='Yes' and ivybase__Parent_Id__r.ivybase__List_Code__c ='ISSUE_SOD' AND Store_Hierarchy__c= 'EMART_HM_Small' AND ivybase__List_Name__c= 'OOS which stops Merch to execute display' Order by ivybase__List_Name__c</restUrl>
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
