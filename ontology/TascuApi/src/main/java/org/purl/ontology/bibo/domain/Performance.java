package org.purl.ontology.bibo.domain;

import com.xmlns.foaf.domain.Agent;
import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Performance extends Event {
  void remPerformer(Agent val);

  List<? extends Agent> getAllPerformer();

  void addPerformer(Agent val);
}
