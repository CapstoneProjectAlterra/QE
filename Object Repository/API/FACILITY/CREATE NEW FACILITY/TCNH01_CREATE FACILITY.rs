<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>TCNH01_CREATE FACILITY</name>
   <tag></tag>
   <elementGuidId>c524a7ed-40ae-4bab-8557-0d1daf79e68d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;facility_name\&quot;: \&quot;Rumah Sakit Citama\&quot;,\n    \&quot;img_url\&quot;: \&quot;https://play-lh.googleusercontent.com/3VjNECMlOHcuuZhFHhrX2QrRD8tuCD-OytgpcEbiC9aa81cGEtQYu0IRf-M2TtE0GsiE\&quot;,\n    \&quot;street_name\&quot;: \&quot; Jl. Pabuaran No.52, Pabuaran, Kecamatan Bojonggede, Kabupaten Bogor, Jawa Barat\&quot;,\n    \&quot;office_number\&quot;: 1,\n    \&quot;village_name\&quot;: \&quot;PABUARAN\&quot;,\n    \&quot;district\&quot;: \&quot;BOJONGGEDE\&quot;,\n    \&quot;city\&quot;: \&quot;BOGOR\&quot;,\n    \&quot;province\&quot;: \&quot;JAWA BARAT\&quot;,\n    \&quot;postal_code\&quot;: 16320,\n    \&quot;profile\&quot;:{\n        \&quot;user_id\&quot;:5\n    }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.token}</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.url}/facility</restUrl>
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
