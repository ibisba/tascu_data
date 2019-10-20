# bibo:Collection a owl:Class extends [bibo:Literature](/ontology/bibo/Literature)

## Subclasses

[bibo:Website](/ontology/bibo/Website)

[bibo:Series](/ontology/bibo/Series)

[bibo:MultiVolumeBook](/ontology/bibo/MultiVolumeBook)

[bibo:Periodical](/ontology/bibo/Periodical)

## Annotations

|||
|-----|-----|
|rdfs:comment|A collection of Documents or Collections|
|empusa:propertyDefinitions|bibo:hasPart @bibo:Literature*;<br>bibo:numVolumes xsd:String?; <br>bibo:eissn xsd:String?; <br>bibo:issn xsd:String?;|
|<http://gbol.life/0.1/subDomain>|BIBO|
|rdfs:label|Collection|
|skos:editorialNote|Properties a defined on the root, this is just a temporary note that can be used for that task<br><br>#bibo:distributor @foaf:Agent?;<br>#bibo:editor @foaf:Agent?;<br>#bibo:issuer @foaf:Agent?;<br>#bibo:owner @foaf:Agent?;<br>#bibo:producer @foaf:Agent?;<br>#bibo:translator @foaf:Agent?;<br>#bibo:doi xsd:String?;<br>#bibo:eissn xsd:String?; <br>#bibo:issn xsd:String?; <br>#bibo:asin xsd:String?; <br>#bibo:identifier xsd:String?; <br>#bibo:coden xsd:String?; <br>#bibo:eanucc13 xsd:String?; <br>#bibo:gtin14 xsd:String?; <br>#bibo:handle xsd:String?; <br>#bibo:isbn10 xsd:String?; <br>#bibo:isbn13 xsd:String?; <br>#bibo:lccn xsd:String?; <br>#bibo:numVolumes xsd:String?; <br>#bibo:oclcnum xsd:String?; <br>#bibo:pmid xsd:String?; <br>#bibo:sici xsd:String?; <br>#bibo:upc xsd:String?; <br>#bibo:uri xsd:String?;|

## Properties

|property|description|cardinality|type|
|-----|-----|-----|-----|
|[bibo:hasPart](/ontology/bibo/hasPart)||0:N|[bibo:Literature](/ontology/bibo/Literature)|
|[bibo:numVolumes](/ontology/bibo/numVolumes)||0:1|xsd:string|
|[bibo:eissn](/ontology/bibo/eissn)||0:1|xsd:string|
|[bibo:issn](/ontology/bibo/issn)||0:1|xsd:string|
