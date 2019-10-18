package life.gbol.domain.impl;

import java.lang.String;
import life.gbol.domain.GeographicalLocation;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import nl.wur.ssb.RDFSimpleCon.api.OWLThingImpl;
import org.apache.jena.rdf.model.Resource;

/**
 * Code generated from http://gbol.life/0.1/ ontology
 */
public class GeographicalLocationImpl extends OWLThingImpl implements GeographicalLocation {
  public static final String TypeIRI = "http://gbol.life/0.1/GeographicalLocation";

  protected GeographicalLocationImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static GeographicalLocation make(Domain domain, Resource resource, boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new GeographicalLocationImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,GeographicalLocation.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,GeographicalLocation.class,false);
          if(toRet == null) {
            toRet = new GeographicalLocationImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof GeographicalLocation)) {
          throw new RuntimeException("Instance of life.gbol.domain.impl.GeographicalLocationImpl expected");
        }
      }
      return (GeographicalLocation)toRet;
    }
  }

  public void validate() {
    super.validate();
  }

  public String getLocality() {
    return this.getStringLit("http://gbol.life/0.1/locality",true);
  }

  public void setLocality(String val) {
    this.setStringLit("http://gbol.life/0.1/locality",val);
  }

  public String getRegion() {
    return this.getStringLit("http://gbol.life/0.1/region",true);
  }

  public void setRegion(String val) {
    this.setStringLit("http://gbol.life/0.1/region",val);
  }
}
