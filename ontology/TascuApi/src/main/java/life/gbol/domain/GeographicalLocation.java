package life.gbol.domain;

import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.OWLThing;

/**
 * Code generated from http://gbol.life/0.1/ ontology
 */
public interface GeographicalLocation extends OWLThing {
  String getLocality();

  void setLocality(String val);

  String getRegion();

  void setRegion(String val);
}
