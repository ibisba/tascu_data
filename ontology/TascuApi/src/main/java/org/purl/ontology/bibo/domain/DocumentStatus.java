package org.purl.ontology.bibo.domain;

import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.EnumClass;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public enum DocumentStatus implements EnumClass {
  unpublished("http://purl.org/ontology/bibo/status/unpublished",new DocumentStatus[]{}),

  peerReviewed("http://purl.org/ontology/bibo/status/peerReviewed",new DocumentStatus[]{}),

  nonPeerReviewed("http://purl.org/ontology/bibo/status/nonPeerReviewed",new DocumentStatus[]{}),

  published("http://purl.org/ontology/bibo/status/published",new DocumentStatus[]{}),

  forthcoming("http://purl.org/ontology/bibo/status/forthcoming",new DocumentStatus[]{}),

  accepted("http://purl.org/ontology/bibo/status/accepted",new DocumentStatus[]{}),

  legal("http://purl.org/ontology/bibo/status/legal",new DocumentStatus[]{}),

  draft("http://purl.org/ontology/bibo/status/draft",new DocumentStatus[]{}),

  rejected("http://purl.org/ontology/bibo/status/rejected",new DocumentStatus[]{});

  private DocumentStatus[] parents;

  private String iri;

  private DocumentStatus(String iri, DocumentStatus[] parents) {
    this.iri = iri;
    this.parents = parents;
  }

  public EnumClass[] getParents() {
    return parents;
  }

  public String getIRI() {
    return this.iri;
  }

  public static DocumentStatus make(String iri) {
    for(DocumentStatus item : DocumentStatus.values()) {
      if(item.iri.equals(iri)) {
        return item;
      }
    }
    throw new RuntimeException("Enum value: " + iri + " not found for enum type: EnumExample");
  }
}
