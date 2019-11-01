package com.xmlns.foaf.domain.impl;

import com.xmlns.foaf.domain.Organization;
import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import org.apache.jena.rdf.model.Resource;

/**
 * Code generated from http://xmlns.com/foaf/0.1/ ontology
 */
public class OrganizationImpl extends AgentImpl implements Organization {
  public static final String TypeIRI = "http://xmlns.com/foaf/0.1/Organization";

  protected OrganizationImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static Organization make(Domain domain, Resource resource, boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new OrganizationImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,Organization.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,Organization.class,false);
          if(toRet == null) {
            toRet = new OrganizationImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof Organization)) {
          throw new RuntimeException("Instance of com.xmlns.foaf.domain.impl.OrganizationImpl expected");
        }
      }
      return (Organization)toRet;
    }
  }

  public void validate() {
    super.validate();
  }

  public String getLegalName() {
    return this.getStringLit("http://www.w3.org/ns/regorg#legalName",true);
  }

  public void setLegalName(String val) {
    this.setStringLit("http://www.w3.org/ns/regorg#legalName",val);
  }

  public String getLogo() {
    return this.getExternalRef("http://xmlns.com/foaf/0.1/logo",true);
  }

  public void setLogo(String val) {
    this.setExternalRef("http://xmlns.com/foaf/0.1/logo",val);
  }

  public String getPhone() {
    return this.getStringLit("http://xmlns.com/foaf/0.1/phone",true);
  }

  public void setPhone(String val) {
    this.setStringLit("http://xmlns.com/foaf/0.1/phone",val);
  }

  public String getHomepage() {
    return this.getStringLit("http://xmlns.com/foaf/0.1/homepage",true);
  }

  public void setHomepage(String val) {
    this.setStringLit("http://xmlns.com/foaf/0.1/homepage",val);
  }

  public String getMbox() {
    return this.getExternalRef("http://xmlns.com/foaf/0.1/mbox",true);
  }

  public void setMbox(String val) {
    this.setExternalRef("http://xmlns.com/foaf/0.1/mbox",val);
  }

  public String getBased_near() {
    return this.getStringLit("http://xmlns.com/foaf/0.1/based_near",true);
  }

  public void setBased_near(String val) {
    this.setStringLit("http://xmlns.com/foaf/0.1/based_near",val);
  }

  public String getName() {
    return this.getStringLit("http://xmlns.com/foaf/0.1/name",false);
  }

  public void setName(String val) {
    this.setStringLit("http://xmlns.com/foaf/0.1/name",val);
  }
}
