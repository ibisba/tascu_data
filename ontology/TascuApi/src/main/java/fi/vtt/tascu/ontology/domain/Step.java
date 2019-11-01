package fi.vtt.tascu.ontology.domain;

import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.OWLThing;

/**
 * Code generated from http://tascu.vtt.fi/ontology/ ontology
 */
public interface Step extends OWLThing {
  Double getSuccessRate();

  void setSuccessRate(Double val);

  String getName();

  void setName(String val);

  String getComment();

  void setComment(String val);

  String getDescription();

  void setDescription(String val);

  Service getService();

  void setService(Service val);

  Integer getId();

  void setId(Integer val);

  Double getDuration();

  void setDuration(Double val);

  String getProtocol();

  void setProtocol(String val);

  Step getParent();

  void setParent(Step val);
}
