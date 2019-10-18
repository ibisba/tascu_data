package org.purl.ontology.bibo.domain;

import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface MultiVolumeBook extends Collection {
  void remHasPart(Book val);

  List<? extends Book> getAllHasPart();

  void addHasPart(Book val);
}
