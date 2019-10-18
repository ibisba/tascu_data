package life.gbol.domain;

import java.lang.Double;
import nl.wur.ssb.RDFSimpleCon.api.OWLThing;

/**
 * Code generated from http://gbol.life/0.1/ ontology
 */
public interface GeographicalCoordinate extends OWLThing {
  Double getLongitude();

  void setLongitude(Double val);

  Double getLatitude();

  void setLatitude(Double val);
}
