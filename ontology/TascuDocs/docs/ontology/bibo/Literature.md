# bibo:Literature a owl:Class

## Subclasses

[bibo:Collection](/ontology/bibo/Collection)

[bibo:Document](/ontology/bibo/Document)

## Annotations

|||
|-----|-----|
|empusa:propertyDefinitions|bibo:asin xsd:String?;<br>bibo:authorList @foaf:Agent*~;<br>bibo:citedBy @bibo:Document*;<br>bibo:cites @bibo:Document*;<br>bibo:coden xsd:String?;<br>bibo:content xsd:String?;<br>bibo:contributorList @foaf:Agent*~;<br>bibo:distributor @foaf:Agent?;<br>bibo:doi xsd:String?;<br>bibo:eanucc13 xsd:String?;<br>bibo:edition xsd:String?;<br>bibo:editor @foaf:Agent?;<br>bibo:editorList @foaf:Agent*~;<br>bibo:gtin14 xsd:String?;<br>bibo:handle xsd:String?;<br>bibo:identifier xsd:String?;<br>bibo:isbn10 xsd:String?;<br>bibo:isbn13 xsd:String?;<br>bibo:issuer @foaf:Agent?;<br>bibo:lccn xsd:String?;<br>bibo:locator xsd:String?;<br>bibo:number xsd:String?;<br>bibo:numPages xsd:Integer?;<br>bibo:oclcnum xsd:String?;<br>bibo:owner @foaf:Agent?;<br>bibo:pageEnd xsd:String?;<br>bibo:pageStart xsd:String?;<br>bibo:pages xsd:String?;<br>bibo:pmid xsd:String?;<br>#bibo:presentedAt @bibo:Event?;<br>bibo:producer @foaf:Agent?;<br>bibo:reproducedIn @bibo:Document*;<br>bibo:reviewOf @bibo:Literature*;<br>bibo:section xsd:String?;<br>bibo:shortDescription xsd:String?;<br>bibo:shortTitle xsd:String?;<br>bibo:sici xsd:String?;<br>bibo:status @bibo:DocumentStatus?;<br>bibo:transcriptOf @bibo:Literature?;<br>bibo:translationOf @bibo:Document?;<br>bibo:translator @foaf:Agent?;<br>bibo:upc xsd:String?;<br>bibo:uri xsd:String?;<br>bibo:volume xsd:String?;<br>dc:abstract xsd:String?;<br>dc:contributor @foaf:Agent*;<br>dc:created xsd:date?;<br>dc:description xsd:String?;<br>dc:issued xsd:date?;<br>dc:language xsd:String?;<br>dc:publisher @foaf:Organization?;<br>dc:relation IRI*;<br>dc:rights xsd:String?;<br>dc:subject xsd:String?;<br>dc:title xsd:String?;<br>dc:dateAccepted xsd:Date?;<br>dc:dateSubmitted xsd:Date?;<br>#* Use this property to describe the content of the document<br>rdf:value xsd:String?;<br>#* A list of cross references to a resources holding the same document. <br>#xref @:XRef*;|
|<http://gbol.life/0.1/subDomain>|BIBO|

## Properties

|property|description|cardinality|type|
|-----|-----|-----|-----|
|[bibo:gtin14](/ontology/bibo/gtin14)||0:1|xsd:string|
|[bibo:reviewOf](/ontology/bibo/reviewOf)||0:N|[bibo:Literature](/ontology/bibo/Literature)|
|[bibo:edition](/ontology/bibo/edition)||0:1|xsd:string|
|[bibo:status](/ontology/bibo/status)||0:1|[bibo:DocumentStatus](/ontology/bibo/DocumentStatus)|
|[rdf:value](/1999/02/22-rdf-syntax-ns/value)|Use this property to describe the content of the document|0:1|xsd:string|
|[bibo:pageStart](/ontology/bibo/pageStart)||0:1|xsd:string|
|[bibo:content](/ontology/bibo/content)||0:1|xsd:string|
|[dc:description](/dc/terms/description)||0:1|xsd:string|
|[bibo:handle](/ontology/bibo/handle)||0:1|xsd:string|
|[bibo:numPages](/ontology/bibo/numPages)||0:1|xsd:Integer|
|[bibo:uri](/ontology/bibo/uri)||0:1|xsd:string|
|[dc:subject](/dc/terms/subject)||0:1|xsd:string|
|[bibo:pages](/ontology/bibo/pages)||0:1|xsd:string|
|[bibo:producer](/ontology/bibo/producer)||0:1|[foaf:Agent](/foaf/0.1/Agent)|
|[bibo:authorList](/ontology/bibo/authorList)||0:N|[foaf:Agent](/foaf/0.1/Agent)|
|[bibo:issuer](/ontology/bibo/issuer)||0:1|[foaf:Agent](/foaf/0.1/Agent)|
|[bibo:distributor](/ontology/bibo/distributor)||0:1|[foaf:Agent](/foaf/0.1/Agent)|
|[bibo:pageEnd](/ontology/bibo/pageEnd)||0:1|xsd:string|
|[dc:relation](/dc/terms/relation)||0:N|IRI|
|[dc:publisher](/dc/terms/publisher)||0:1|[foaf:Organization](/foaf/0.1/Organization)|
|[bibo:contributorList](/ontology/bibo/contributorList)||0:N|[foaf:Agent](/foaf/0.1/Agent)|
|[bibo:citedBy](/ontology/bibo/citedBy)||0:N|[bibo:Document](/ontology/bibo/Document)|
|[bibo:identifier](/ontology/bibo/identifier)||0:1|xsd:string|
|[bibo:coden](/ontology/bibo/coden)||0:1|xsd:string|
|[bibo:shortDescription](/ontology/bibo/shortDescription)||0:1|xsd:string|
|[bibo:doi](/ontology/bibo/doi)||0:1|xsd:string|
|[bibo:isbn10](/ontology/bibo/isbn10)||0:1|xsd:string|
|[bibo:pmid](/ontology/bibo/pmid)||0:1|xsd:string|
|[dc:abstract](/dc/terms/abstract)||0:1|xsd:string|
|[bibo:isbn13](/ontology/bibo/isbn13)||0:1|xsd:string|
|[bibo:reproducedIn](/ontology/bibo/reproducedIn)||0:N|[bibo:Document](/ontology/bibo/Document)|
|[bibo:volume](/ontology/bibo/volume)||0:1|xsd:string|
|[bibo:asin](/ontology/bibo/asin)||0:1|xsd:string|
|[bibo:section](/ontology/bibo/section)||0:1|xsd:string|
|[bibo:upc](/ontology/bibo/upc)||0:1|xsd:string|
|[dc:dateSubmitted](/dc/terms/dateSubmitted)||0:1|xsd:Date|
|[bibo:editor](/ontology/bibo/editor)||0:1|[foaf:Agent](/foaf/0.1/Agent)|
|[bibo:cites](/ontology/bibo/cites)||0:N|[bibo:Document](/ontology/bibo/Document)|
|[bibo:transcriptOf](/ontology/bibo/transcriptOf)||0:1|[bibo:Literature](/ontology/bibo/Literature)|
|[bibo:locator](/ontology/bibo/locator)||0:1|xsd:string|
|[bibo:eanucc13](/ontology/bibo/eanucc13)||0:1|xsd:string|
|[bibo:editorList](/ontology/bibo/editorList)||0:N|[foaf:Agent](/foaf/0.1/Agent)|
|[bibo:owner](/ontology/bibo/owner)||0:1|[foaf:Agent](/foaf/0.1/Agent)|
|[dc:language](/dc/terms/language)||0:1|xsd:string|
|[bibo:sici](/ontology/bibo/sici)||0:1|xsd:string|
|[bibo:translator](/ontology/bibo/translator)||0:1|[foaf:Agent](/foaf/0.1/Agent)|
|[bibo:translationOf](/ontology/bibo/translationOf)||0:1|[bibo:Document](/ontology/bibo/Document)|
|[bibo:oclcnum](/ontology/bibo/oclcnum)||0:1|xsd:string|
|[dc:issued](/dc/terms/issued)||0:1|xsd:Date|
|[bibo:lccn](/ontology/bibo/lccn)||0:1|xsd:string|
|[bibo:shortTitle](/ontology/bibo/shortTitle)||0:1|xsd:string|
|[bibo:number](/ontology/bibo/number)||0:1|xsd:string|
|[dc:created](/dc/terms/created)||0:1|xsd:Date|
|[dc:contributor](/dc/terms/contributor)||0:N|[foaf:Agent](/foaf/0.1/Agent)|
|[dc:title](/dc/terms/title)||0:1|xsd:string|
|[dc:dateAccepted](/dc/terms/dateAccepted)||0:1|xsd:Date|
|[dc:rights](/dc/terms/rights)||0:1|xsd:string|
