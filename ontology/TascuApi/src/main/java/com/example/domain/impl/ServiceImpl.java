package com.example.domain.impl;

import com.example.domain.Service;
import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import nl.wur.ssb.RDFSimpleCon.api.OWLThingImpl;
import org.apache.jena.rdf.model.Resource;

/**
 * Code generated from http://example.com/ ontology
 */
public class ServiceImpl extends OWLThingImpl implements Service {
  public static final String TypeIRI = "http://example.com/Service";

  protected ServiceImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static Service make(Domain domain, Resource resource, boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new ServiceImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,Service.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,Service.class,false);
          if(toRet == null) {
            toRet = new ServiceImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof Service)) {
          throw new RuntimeException("Instance of com.example.domain.impl.ServiceImpl expected");
        }
      }
      return (Service)toRet;
    }
  }

  public void validate() {
    super.validate();
    this.checkCardMin1("http://gbol.life/0.1/id");
  }

  public String getId() {
    return this.getStringLit("http://gbol.life/0.1/id",false);
  }

  public void setId(String val) {
    this.setStringLit("http://gbol.life/0.1/id",val);
  }
}
