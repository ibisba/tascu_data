package fi.vtt.tascu.ontology.domain.impl;

import fi.vtt.tascu.ontology.domain.Service;
import fi.vtt.tascu.ontology.domain.Step;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import nl.wur.ssb.RDFSimpleCon.api.OWLThingImpl;
import org.apache.jena.rdf.model.Resource;

/**
 * Code generated from http://tascu.vtt.fi/ontology/ ontology
 */
public class StepImpl extends OWLThingImpl implements Step {
  public static final String TypeIRI = "http://tascu.vtt.fi/ontology/Step";

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
          throw new RuntimeException("Instance of fi.vtt.tascu.ontology.domain.impl.StepImpl expected");
        }
      }
      return (Step)toRet;
    }
  }

  public void validate() {
    super.validate();
    this.checkCardMin1("http://tascu.vtt.fi/ontology/name");
    this.checkCardMin1("http://tascu.vtt.fi/ontology/id");
  }

  public Double getSuccessRate() {
    return this.getDoubleLit("http://tascu.vtt.fi/ontology/successRate",true);
  }

  public void setSuccessRate(Double val) {
    this.setDoubleLit("http://tascu.vtt.fi/ontology/successRate",val);
  }

  public String getName() {
    return this.getStringLit("http://tascu.vtt.fi/ontology/name",false);
  }

  public void setName(String val) {
    this.setStringLit("http://tascu.vtt.fi/ontology/name",val);
  }

  public String getComment() {
    return this.getStringLit("http://tascu.vtt.fi/ontology/comment",true);
  }

  public void setComment(String val) {
    this.setStringLit("http://tascu.vtt.fi/ontology/comment",val);
  }

  public String getDescription() {
    return this.getStringLit("http://tascu.vtt.fi/ontology/description",true);
  }

  public void setDescription(String val) {
    this.setStringLit("http://tascu.vtt.fi/ontology/description",val);
  }

  public Service getService() {
    return this.getRef("http://tascu.vtt.fi/ontology/service",true,Service.class);
  }

  public void setService(Service val) {
    this.setRef("http://tascu.vtt.fi/ontology/service",val,Service.class);
  }

  public Integer getId() {
    return this.getIntegerLit("http://tascu.vtt.fi/ontology/id",false);
  }

  public void setId(Integer val) {
    this.setIntegerLit("http://tascu.vtt.fi/ontology/id",val);
  }

  public Double getDuration() {
    return this.getDoubleLit("http://tascu.vtt.fi/ontology/duration",true);
  }

  public void setDuration(Double val) {
    this.setDoubleLit("http://tascu.vtt.fi/ontology/duration",val);
  }

  public String getProtocol() {
    return this.getExternalRef("http://tascu.vtt.fi/ontology/protocol",true);
  }

  public void setProtocol(String val) {
    this.setExternalRef("http://tascu.vtt.fi/ontology/protocol",val);
  }

  public Step getParent() {
    return this.getRef("http://tascu.vtt.fi/ontology/parent",true,Step.class);
  }

  public void setParent(Step val) {
    this.setRef("http://tascu.vtt.fi/ontology/parent",val,Step.class);
  }
}
