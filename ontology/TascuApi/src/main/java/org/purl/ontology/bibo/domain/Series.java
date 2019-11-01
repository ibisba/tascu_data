package org.purl.ontology.bibo.domain;

import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Series extends Collection {
  void remHasPart(Document val);

  List<? extends Document> getAllHasPart();

  void addHasPart(Document val);
}
