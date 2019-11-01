package life.gbol.domain.impl;

import java.lang.String;
import life.gbol.domain.Country;
import life.gbol.domain.LandBasedGeographicalLocation;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import org.apache.jena.rdf.model.Resource;

/**
 * Code generated from http://gbol.life/0.1/ ontology
 */
public class LandBasedGeographicalLocationImpl extends GeographicalLocationImpl implements LandBasedGeographicalLocation {
  public static final String TypeIRI = "http://gbol.life/0.1/LandBasedGeographicalLocation";

  protected LandBasedGeographicalLocationImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static LandBasedGeographicalLocation make(Domain domain, Resource resource,
      boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new LandBasedGeographicalLocationImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,LandBasedGeographicalLocation.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,LandBasedGeographicalLocation.class,false);
          if(toRet == null) {
            toRet = new LandBasedGeographicalLocationImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof LandBasedGeographicalLocation)) {
          throw new RuntimeException("Instance of life.gbol.domain.impl.LandBasedGeographicalLocationImpl expected");
        }
      }
      return (LandBasedGeographicalLocation)toRet;
    }
  }

  public void validate() {
    super.validate();
    this.checkCardMin1("http://gbol.life/0.1/country");
  }

  public Country getCountry() {
    return this.getEnum("http://gbol.life/0.1/country",false,Country.class);
  }

  public void setCountry(Country val) {
    this.setEnum("http://gbol.life/0.1/country",val,Country.class);
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
