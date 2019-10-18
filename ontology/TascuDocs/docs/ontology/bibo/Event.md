# bibo:Event a owl:Class

## Subclasses

[bibo:PersonalCommunication](/ontology/bibo/PersonalCommunication)

[bibo:Workshop](/ontology/bibo/Workshop)

[bibo:Interview](/ontology/bibo/Interview)

[bibo:Performance](/ontology/bibo/Performance)

[bibo:Conference](/ontology/bibo/Conference)

[bibo:Hearing](/ontology/bibo/Hearing)

## Annotations

|||
|-----|-----|
|empusa:propertyDefinitions|bibo:presents @bibo:Document*;<br>bibo:organizer @foaf:Agent*;<br>bibo:place xsd:String*;|
|subDomain|BIBO|
|skos:exactMatch|http://purl.org/NET/c4dm/event.owl#Event<br>http://purl.org/NET/c4dm/event.owl#SecondEvent|

## Properties

|property|description|cardinality|type|
|-----|-----|-----|-----|
|[bibo:presents](/ontology/bibo/presents)||0:N|[bibo:Document](/ontology/bibo/Document)|
|[bibo:organizer](/ontology/bibo/organizer)||0:N|[foaf:Agent](/foaf/0.1/Agent)|
|[bibo:place](/ontology/bibo/place)||0:N|xsd:string|
