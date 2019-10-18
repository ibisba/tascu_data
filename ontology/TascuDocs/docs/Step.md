# tascu:Step a owl:Class

## Subclasses

## Annotations

|||
|-----|-----|
|empusa:propertyDefinitions|#* Identifier for this step<br>id xsd:String;<br>#* Optional parental step<br>parent @tascu:Step?;<br>#* Step name<br>name xsd:String;<br>#* Step description<br>description xsd:String?;<br>#* Protocol<br>protocol IRI?;<br>#* Duration (in days)<br>duration xsd:Double?;<br>#* Can be part of a specific service<br>service @tascu:Service?;<br>#* Additional comments<br>comment xsd:String?;<br>#* Success rate<br>successRate xsd:Double?;|

## Properties

|property|description|cardinality|type|
|-----|-----|-----|-----|
|[comment](/0.1/comment)|Additional comments|0:1|xsd:string|
|[name](/0.1/name)|Step name|1:1|xsd:string|
|[description](/0.1/description)|Step description|0:1|xsd:string|
|[protocol](/0.1/protocol)|Protocol|0:1|IRI|
|[service](/0.1/service)|Can be part of a specific service|0:1|[tascu:Service](/Service)|
|[id](/0.1/id)|Identifier for this step|1:1|xsd:string|
|[duration](/0.1/duration)|Duration (in days)|0:1|xsd:Double|
|[successRate](/0.1/successRate)|Success rate|0:1|xsd:Double|
|[parent](/0.1/parent)|Optional parental step|0:1|[tascu:Step](/Step)|