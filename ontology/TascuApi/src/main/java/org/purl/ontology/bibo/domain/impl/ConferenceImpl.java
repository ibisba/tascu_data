package org.purl.ontology.bibo.domain.impl;

import com.xmlns.foaf.domain.Agent;
import java.lang.String;
import java.util.List;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import org.apache.jena.rdf.model.Resource;
import org.purl.ontology.bibo.domain.Conference;
import org.purl.ontology.bibo.domain.Document;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public class ConferenceImpl extends EventImpl implements Conference {
  public static final String TypeIRI = "http://purl.org/ontology/bibo/Conference";

  protected ConferenceImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static Conference make(Domain domain, Resource resource, boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new ConferenceImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,Conference.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,Conference.class,false);
          if(toRet == null) {
            toRet = new ConferenceImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof Conference)) {
          throw new RuntimeException("Instance of org.purl.ontology.bibo.domain.impl.ConferenceImpl expected");
        }
      }
      return (Conference)toRet;
    }
  }

  public void validate() {
    super.validate();
  }

  public void remPresents(Document val) {
    this.remRef("http://purl.org/ontology/bibo/presents",val,true);
  }

  public List<? extends Document> getAllPresents() {
    return this.getRefSet("http://purl.org/ontology/bibo/presents",true,Document.class);
  }

  public void addPresents(Document val) {
    this.addRef("http://purl.org/ontology/bibo/presents",val);
  }

  public void remOrganizer(Agent val) {
    this.remRef("http://purl.org/ontology/bibo/organizer",val,true);
  }

  public List<? extends Agent> getAllOrganizer() {
    return this.getRefSet("http://purl.org/ontology/bibo/organizer",true,Agent.class);
  }

  public void addOrganizer(Agent val) {
    this.addRef("http://purl.org/ontology/bibo/organizer",val);
  }

  public void remPlace(String val) {
    this.remStringLit("http://purl.org/ontology/bibo/place",val,true);
  }

  public List<? extends String> getAllPlace() {
    return this.getStringLitSet("http://purl.org/ontology/bibo/place",true);
  }

  public void addPlace(String val) {
    this.addStringLit("http://purl.org/ontology/bibo/place",val);
  }
}
