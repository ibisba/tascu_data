package org.purl.ontology.bibo.domain;

import com.xmlns.foaf.domain.Organization;
import java.time.LocalDate;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface LegalDocument extends Document {
  Organization getCourt();

  void setCourt(Organization val);

  LocalDate getArgued();

  void setArgued(LocalDate val);
}
