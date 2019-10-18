package org.purl.ontology.bibo.domain;

import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Slideshow extends Document {
  void remHasPart(Slide val);

  List<? extends Slide> getAllHasPart();

  void addHasPart(Slide val);
}
