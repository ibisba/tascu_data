# Step a owl:Class

## Subclasses

## Annotations

|||
|-----|-----|
|empusa:propertyDefinitions|#* Identifier for this step<br>id xsd:Integer;<br>#* Optional parental step<br>parent @tascu:Step?;<br>#* Step name<br>name xsd:String;<br>#* Step description<br>description xsd:String?;<br>#* Protocol<br>protocol IRI?;<br>#* Duration (in days)<br>duration xsd:Double?;<br>#* Can be part of a specific service<br>service @tascu:Service?;<br>#* Additional comments<br>comment xsd:String?;<br>#* Success rate<br>successRate xsd:Double?;|

## Properties

|property|description|cardinality|type|
|-----|-----|-----|-----|
|[description](/description)|Step description|0:1|xsd:string|
|[name](/name)|Step name|1:1|xsd:string|
|[service](/service)|Can be part of a specific service|0:1|[Service](/Service)|
|[parent](/parent)|Optional parental step|0:1|[Step](/Step)|
|[duration](/duration)|Duration (in days)|0:1|xsd:Double|
|[id](/id)|Identifier for this step|1:1|xsd:Integer|
|[protocol](/protocol)|Protocol|0:1|IRI|
|[comment](/comment)|Additional comments|0:1|xsd:string|
|[successRate](/successRate)|Success rate|0:1|xsd:Double|
