for java version older than java version 11   

> 
cd <ProjectDir>\src\main\java>  
xjc -p org.san.xsddemo ..\resources\PersonDetails.xsd

------------------------------------------------------------
for java 11 onwards  

>java -cp "C:\Santaji\Java Learnings\XsdDemo\lib\javax.activation-api-1.2.0.jar:C:\Santaji\Java Learnings\XsdDemo\lib\jaxb-xjc-3.0.0.jar" com.sun.tools.xjc.XJCFacade -p com.ltss.ref.xsd.schema
