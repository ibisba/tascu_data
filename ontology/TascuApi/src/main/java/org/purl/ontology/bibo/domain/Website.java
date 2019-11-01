package org.purl.ontology.bibo.domain;

import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Website extends Collection {
  void remHasPart(Webpage val);

  List<? extends Webpage> getAllHasPart();

  void addHasPart(Webpage val);
}
