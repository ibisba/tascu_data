package com.example.domain;

import java.lang.Double;
import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.OWLThing;

/**
 * Code generated from http://example.com/ ontology
 */
public interface Step extends OWLThing {
  String getComment();

  void setComment(String val);

  String getName();

  void setName(String val);

  String getDescription();

  void setDescription(String val);

  String getProtocol();

  void setProtocol(String val);

  Service getService();

  void setService(Service val);

  String getId();

  void setId(String val);

  Double getDuration();

  void setDuration(Double val);

  Double getSuccessRate();

  void setSuccessRate(Double val);

  Step getParent();

  void setParent(Step val);
}
