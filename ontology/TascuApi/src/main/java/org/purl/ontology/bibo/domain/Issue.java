package org.purl.ontology.bibo.domain;

import java.lang.String;
import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Issue extends CollectedDocument {
  void remHasPart(Article val);

  List<? extends Article> getAllHasPart();

  void addHasPart(Article val);

  String getIssue();

  void setIssue(String val);
}
