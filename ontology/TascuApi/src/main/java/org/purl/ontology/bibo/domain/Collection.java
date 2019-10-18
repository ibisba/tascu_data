package org.purl.ontology.bibo.domain;

import java.lang.String;
import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Collection extends Literature {
  void remHasPart(Literature val);

  List<? extends Literature> getAllHasPart();

  void addHasPart(Literature val);

  String getNumVolumes();

  void setNumVolumes(String val);

  String getEissn();

  void setEissn(String val);

  String getIssn();

  void setIssn(String val);
}
