<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Last Visit Stock</name>
   <tag></tag>
   <elementGuidId>0845dea2-f661-4c0b-b8b9-893e50a0c367</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
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
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content_Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=SELECT CreatedDate,CreatedMonth__c,CustomerName__c,Ghost_Stock_Quantity__c,Id,Is_Distributed__c,Is_Ghost_Stock__c,Is_Price_Tag_Available__c,ivybase__Available__c,ivybase__Has_PriceTag__c,ivybase__Internal_Id__c,ivybase__Is_Distributed__c,ivybase__Location__c,ivybase__Product__c,ivybase__Product__r.Location_Hierarchy_Name__c,ivybase__Product__r.ivybase__InternalId__c,ivybase__Product__r.ivybase__Full_Description__c,ivybase__Product__r.ivybase__Short_Description__c,ivybase__Type__c,ivybase__Visit__c,Name,OwnerId,Product_Barcode__c,Product_Hierarchy__c,RelatedUserId__c,SKU_Type__c,StoreId__c,StoreName__c,Store_ID__c,Store_Name__c,SystemModstamp,Total_inventory__c,Unique_Combination__c,Visit_Date__c FROM ivybase__Location_Stock__c WHERE ivybase__Product__r.Location_Hierarchy_Name__c LIKE 'Korea SMO' AND Visit_Date__c >= TODAY AND ivybase__Type__c = 'Stock Assortment'</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.instance_url</defaultValue>
      <description></description>
      <id>7fd1ef47-1508-4a1f-93ad-98edbc0d52ee</id>
      <masked>false</masked>
      <name>instance_url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.AuthToken</defaultValue>
      <description></description>
      <id>e2329d4c-2536-4c9d-8127-bf985d9bd86b</id>
      <masked>false</masked>
      <name>AuthToken</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
