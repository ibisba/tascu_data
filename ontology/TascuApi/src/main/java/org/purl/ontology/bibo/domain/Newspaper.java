package org.purl.ontology.bibo.domain;

import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Newspaper extends Periodical {
  void remHasPart(Issue val);

  List<? extends Issue> getAllHasPart();

  void addHasPart(Issue val);
}
