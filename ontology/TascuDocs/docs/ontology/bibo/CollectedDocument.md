# bibo:CollectedDocument a owl:Class extends [bibo:Document](/ontology/bibo/Document)

## Subclasses

[bibo:Issue](/ontology/bibo/Issue)

[bibo:EditedBook](/ontology/bibo/EditedBook)

## Annotations

|||
|-----|-----|
|rdfs:comment|A document that simultaneously contains other documents.|
|empusa:propertyDefinitions|bibo:hasPart @bibo:Document+;|
|<http://gbol.life/0.1/subDomain>|BIBO|
|rdfs:label|Collected Document|

## Properties

|property|description|cardinality|type|
|-----|-----|-----|-----|
|[bibo:hasPart](/ontology/bibo/hasPart)||1:N|[bibo:Document](/ontology/bibo/Document)|
