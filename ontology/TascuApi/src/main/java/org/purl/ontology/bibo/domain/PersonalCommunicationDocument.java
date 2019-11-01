package org.purl.ontology.bibo.domain;

import com.xmlns.foaf.domain.Agent;
import java.util.List;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface PersonalCommunicationDocument extends Document {
  void remRecipient(Agent val);

  List<? extends Agent> getAllRecipient();

  void addRecipient(Agent val);
}
