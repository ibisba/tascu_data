package life.gbol.domain.impl;

import java.lang.String;
import life.gbol.domain.Ocean;
import life.gbol.domain.WaterBasedGeographicalLocation;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import org.apache.jena.rdf.model.Resource;

/**
 * Code generated from http://gbol.life/0.1/ ontology
 */
public class WaterBasedGeographicalLocationImpl extends GeographicalLocationImpl implements WaterBasedGeographicalLocation {
  public static final String TypeIRI = "http://gbol.life/0.1/WaterBasedGeographicalLocation";

  protected WaterBasedGeographicalLocationImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static WaterBasedGeographicalLocation make(Domain domain, Resource resource,
      boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new WaterBasedGeographicalLocationImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,WaterBasedGeographicalLocation.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,WaterBasedGeographicalLocation.class,false);
          if(toRet == null) {
            toRet = new WaterBasedGeographicalLocationImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof WaterBasedGeographicalLocation)) {
          throw new RuntimeException("Instance of life.gbol.domain.impl.WaterBasedGeographicalLocationImpl expected");
        }
      }
      return (WaterBasedGeographicalLocation)toRet;
    }
  }

  public void validate() {
    super.validate();
    this.checkCardMin1("http://gbol.life/0.1/ocean");
  }

  public Ocean getOcean() {
    return this.getEnum("http://gbol.life/0.1/ocean",false,Ocean.class);
  }

  public void setOcean(Ocean val) {
    this.setEnum("http://gbol.life/0.1/ocean",val,Ocean.class);
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
