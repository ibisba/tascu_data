package life.gbol.domain.impl;

import java.lang.Double;
import java.lang.String;
import life.gbol.domain.GeographicalCoordinate;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import nl.wur.ssb.RDFSimpleCon.api.OWLThingImpl;
import org.apache.jena.rdf.model.Resource;

/**
 * Code generated from http://gbol.life/0.1/ ontology
 */
public class GeographicalCoordinateImpl extends OWLThingImpl implements GeographicalCoordinate {
  public static final String TypeIRI = "http://gbol.life/0.1/GeographicalCoordinate";

  protected GeographicalCoordinateImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static GeographicalCoordinate make(Domain domain, Resource resource, boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new GeographicalCoordinateImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,GeographicalCoordinate.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,GeographicalCoordinate.class,false);
          if(toRet == null) {
            toRet = new GeographicalCoordinateImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof GeographicalCoordinate)) {
          throw new RuntimeException("Instance of life.gbol.domain.impl.GeographicalCoordinateImpl expected");
        }
      }
      return (GeographicalCoordinate)toRet;
    }
  }

  public void validate() {
    super.validate();
    this.checkCardMin1("http://gbol.life/0.1/longitude");
    this.checkCardMin1("http://gbol.life/0.1/latitude");
  }

  public Double getLongitude() {
    return this.getDoubleLit("http://gbol.life/0.1/longitude",false);
  }

  public void setLongitude(Double val) {
    this.setDoubleLit("http://gbol.life/0.1/longitude",val);
  }

  public Double getLatitude() {
    return this.getDoubleLit("http://gbol.life/0.1/latitude",false);
  }

  public void setLatitude(Double val) {
    this.setDoubleLit("http://gbol.life/0.1/latitude",val);
  }
}
