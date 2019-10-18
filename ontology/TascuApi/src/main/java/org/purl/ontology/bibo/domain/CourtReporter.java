package org.purl.ontology.bibo.domain;

import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface CourtReporter extends Periodical {
  void remHasPart(LegalDocument val);

  List<? extends LegalDocument> getAllHasPart();

  void addHasPart(LegalDocument val);
}
