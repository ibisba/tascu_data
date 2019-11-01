package org.purl.ontology.bibo.domain;

import java.lang.String;
import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Note extends Document {
  void remAnnotates(String val);

  List<? extends String> getAllAnnotates();

  void addAnnotates(String val);
}
