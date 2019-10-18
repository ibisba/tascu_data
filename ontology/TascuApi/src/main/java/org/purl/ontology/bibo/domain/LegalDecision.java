package org.purl.ontology.bibo.domain;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface LegalDecision extends LegalCaseDocument {
  LegalDecision getAffirmedBy();

  void setAffirmedBy(LegalDecision val);

  LegalDecision getSubsequentLegalDecision();

  void setSubsequentLegalDecision(LegalDecision val);

  LegalDecision getReversedBy();

  void setReversedBy(LegalDecision val);
}
