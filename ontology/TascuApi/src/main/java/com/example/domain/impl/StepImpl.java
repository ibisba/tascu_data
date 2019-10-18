package com.example.domain.impl;

import com.example.domain.Service;
import com.example.domain.Step;
import java.lang.Double;
import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import nl.wur.ssb.RDFSimpleCon.api.OWLThingImpl;
import org.apache.jena.rdf.model.Resource;

/**
 * Code generated from http://example.com/ ontology
 */
public class StepImpl extends OWLThingImpl implements Step {
  public static final String TypeIRI = "http://example.com/Step";

  protected StepImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static Step make(Domain domain, Resource resource, boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new StepImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,Step.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,Step.class,false);
          if(toRet == null) {
            toRet = new StepImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof Step)) {
          throw new RuntimeException("Instance of com.example.domain.impl.StepImpl expected");
        }
      }
      return (Step)toRet;
    }
  }

  public void validate() {
    super.validate();
    this.checkCardMin1("http://gbol.life/0.1/name");
    this.checkCardMin1("http://gbol.life/0.1/id");
  }

  public String getComment() {
    return this.getStringLit("http://gbol.life/0.1/comment",true);
  }

  public void setComment(String val) {
    this.setStringLit("http://gbol.life/0.1/comment",val);
  }

  public String getName() {
    return this.getStringLit("http://gbol.life/0.1/name",false);
  }

  public void setName(String val) {
    this.setStringLit("http://gbol.life/0.1/name",val);
  }

  public String getDescription() {
    return this.getStringLit("http://gbol.life/0.1/description",true);
  }

  public void setDescription(String val) {
    this.setStringLit("http://gbol.life/0.1/description",val);
  }

  public String getProtocol() {
    return this.getExternalRef("http://gbol.life/0.1/protocol",true);
  }

  public void setProtocol(String val) {
    this.setExternalRef("http://gbol.life/0.1/protocol",val);
  }

  public Service getService() {
    return this.getRef("http://gbol.life/0.1/service",true,Service.class);
  }

  public void setService(Service val) {
    this.setRef("http://gbol.life/0.1/service",val,Service.class);
  }

  public String getId() {
    return this.getStringLit("http://gbol.life/0.1/id",false);
  }

  public void setId(String val) {
    this.setStringLit("http://gbol.life/0.1/id",val);
  }

  public Double getDuration() {
    return this.getDoubleLit("http://gbol.life/0.1/duration",true);
  }

  public void setDuration(Double val) {
    this.setDoubleLit("http://gbol.life/0.1/duration",val);
  }

  public Double getSuccessRate() {
    return this.getDoubleLit("http://gbol.life/0.1/successRate",true);
  }

  public void setSuccessRate(Double val) {
    this.setDoubleLit("http://gbol.life/0.1/successRate",val);
  }

  public Step getParent() {
    return this.getRef("http://gbol.life/0.1/parent",true,Step.class);
  }

  public void setParent(Step val) {
    this.setRef("http://gbol.life/0.1/parent",val,Step.class);
  }
}
