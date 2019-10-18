package com.xmlns.foaf.domain.impl;

import com.xmlns.foaf.domain.Agent;
import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import nl.wur.ssb.RDFSimpleCon.api.OWLThingImpl;
import org.apache.jena.rdf.model.Resource;

/**
 * Code generated from http://xmlns.com/foaf/0.1/ ontology
 */
public class AgentImpl extends OWLThingImpl implements Agent {
  public static final String TypeIRI = "http://xmlns.com/foaf/0.1/Agent";

  protected AgentImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static Agent make(Domain domain, Resource resource, boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new AgentImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,Agent.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,Agent.class,false);
          if(toRet == null) {
            toRet = new AgentImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof Agent)) {
          throw new RuntimeException("Instance of com.xmlns.foaf.domain.impl.AgentImpl expected");
        }
      }
      return (Agent)toRet;
    }
  }

  public void validate() {
    super.validate();
    this.checkCardMin1("http://xmlns.com/foaf/0.1/name");
  }

  public String getName() {
    return this.getStringLit("http://xmlns.com/foaf/0.1/name",false);
  }

  public void setName(String val) {
    this.setStringLit("http://xmlns.com/foaf/0.1/name",val);
  }
}
