package org.purl.ontology.bibo.domain;

import com.xmlns.foaf.domain.Agent;
import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface AudioVisualDocument extends Document {
  void remDirector(Agent val);

  List<? extends Agent> getAllDirector();

  void addDirector(Agent val);
}
