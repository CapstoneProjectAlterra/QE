<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CreateNewFamily</name>
   <tag></tag>
   <elementGuidId>43fe9184-82b6-41ed-8091-f37ade214438</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;date_of_birth\&quot;: \&quot;15-12-2001\&quot;,\n  \&quot;email\&quot;: \&quot;haha@hihi.com\&quot;,\n  \&quot;gender\&quot;: \&quot;LAKI_LAKI\&quot;,\n  \&quot;id_card_address\&quot;: \&quot;string\&quot;,\n  \&quot;nik\&quot;: \&quot;161043292102202\&quot;,\n  \&quot;phone_number\&quot;: \&quot;08822113344\&quot;,\n  \&quot;profile\&quot;: {\n    \&quot;role\&quot;: \&quot;ADMIN\&quot;,\n    \&quot;user_id\&quot;: 0\n  },\n  \&quot;residence_address\&quot;: \&quot;string\&quot;,\n  \&quot;status_in_family\&quot;: \&quot;ANAK\&quot;\n}&quot;,
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
      <value>Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJoYXJuYW5kYSIsImlhdCI6MTY1NjA1NjczNSwiZXhwIjoxNjU2MTQzMTM1fQ.onOvqQ_IOLXNgMcfFu6hdrSlVLZMTyIIWPcVCapwrIo</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://ec2-3-237-105-224.compute-1.amazonaws.com:8080/api/v1/family</restUrl>
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