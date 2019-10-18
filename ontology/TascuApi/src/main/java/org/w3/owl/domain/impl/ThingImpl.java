package org.w3.owl.domain.impl;

import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import nl.wur.ssb.RDFSimpleCon.api.OWLThingImpl;
import org.apache.jena.rdf.model.Resource;
import org.w3.owl.domain.Thing;

/**
 * Code generated from http://www.w3.org/2002/07/owl# ontology
 */
public class ThingImpl extends OWLThingImpl implements Thing {
  public static final String TypeIRI = "http://www.w3.org/2002/07/owl#Thing";

  protected ThingImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static Thing make(Domain domain, Resource resource, boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new ThingImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,Thing.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,Thing.class,false);
          if(toRet == null) {
            toRet = new ThingImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof Thing)) {
          throw new RuntimeException("Instance of org.w3.owl.domain.impl.ThingImpl expected");
        }
      }
      return (Thing)toRet;
    }
  }

  public void validate() {
    super.validate();
  }
}
