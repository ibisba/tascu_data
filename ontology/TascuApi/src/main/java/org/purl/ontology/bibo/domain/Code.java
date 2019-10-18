package org.purl.ontology.bibo.domain;

import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Code extends Periodical {
  void remHasPart(Legislation val);

  List<? extends Legislation> getAllHasPart();

  void addHasPart(Legislation val);
}
