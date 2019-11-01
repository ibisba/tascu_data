package org.purl.ontology.bibo.domain;

import com.xmlns.foaf.domain.Agent;
import java.lang.String;
import java.util.List;
import nl.wur.ssb.RDFSimpleCon.api.OWLThing;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Event extends OWLThing {
  void remPresents(Document val);

  List<? extends Document> getAllPresents();

  void addPresents(Document val);

  void remOrganizer(Agent val);

  List<? extends Agent> getAllOrganizer();

  void addOrganizer(Agent val);

  void remPlace(String val);

  List<? extends String> getAllPlace();

  void addPlace(String val);
}
