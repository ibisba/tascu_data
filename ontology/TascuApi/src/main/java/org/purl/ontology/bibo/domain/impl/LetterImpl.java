package org.purl.ontology.bibo.domain.impl;

import com.xmlns.foaf.domain.Agent;
import com.xmlns.foaf.domain.Organization;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import org.apache.jena.rdf.model.Resource;
import org.purl.ontology.bibo.domain.Document;
import org.purl.ontology.bibo.domain.DocumentStatus;
import org.purl.ontology.bibo.domain.Letter;
import org.purl.ontology.bibo.domain.Literature;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public class LetterImpl extends PersonalCommunicationDocumentImpl implements Letter {
  public static final String TypeIRI = "http://purl.org/ontology/bibo/Letter";

  protected LetterImpl(Domain domain, Resource resource) {
    super(domain,resource);
  }

  public static Letter make(Domain domain, Resource resource, boolean direct) {
    synchronized(domain) {
      Object toRet = null;
      if(direct) {
        toRet = new LetterImpl(domain,resource);;
      }
      else {
        toRet = domain.getObject(resource,Letter.class);
        if(toRet == null) {
          toRet = domain.getObjectFromResource(resource,Letter.class,false);
          if(toRet == null) {
            toRet = new LetterImpl(domain,resource);;
          }
        }
        else if(!(toRet instanceof Letter)) {
          throw new RuntimeException("Instance of org.purl.ontology.bibo.domain.impl.LetterImpl expected");
        }
      }
      return (Letter)toRet;
    }
  }

  public void validate() {
    super.validate();
  }

  public void remRecipient(Agent val) {
    this.remRef("http://purl.org/ontology/bibo/recipient",val,true);
  }

  public List<? extends Agent> getAllRecipient() {
    return this.getRefSet("http://purl.org/ontology/bibo/recipient",true,Agent.class);
  }

  public void addRecipient(Agent val) {
    this.addRef("http://purl.org/ontology/bibo/recipient",val);
  }

  public String getGtin14() {
    return this.getStringLit("http://purl.org/ontology/bibo/gtin14",true);
  }

  public void setGtin14(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/gtin14",val);
  }

  public void remReviewOf(Literature val) {
    this.remRef("http://purl.org/ontology/bibo/reviewOf",val,true);
  }

  public List<? extends Literature> getAllReviewOf() {
    return this.getRefSet("http://purl.org/ontology/bibo/reviewOf",true,Literature.class);
  }

  public void addReviewOf(Literature val) {
    this.addRef("http://purl.org/ontology/bibo/reviewOf",val);
  }

  public String getEdition() {
    return this.getStringLit("http://purl.org/ontology/bibo/edition",true);
  }

  public void setEdition(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/edition",val);
  }

  public DocumentStatus getStatus() {
    return this.getEnum("http://purl.org/ontology/bibo/status",true,DocumentStatus.class);
  }

  public void setStatus(DocumentStatus val) {
    this.setEnum("http://purl.org/ontology/bibo/status",val,DocumentStatus.class);
  }

  public String getValue() {
    return this.getStringLit("http://www.w3.org/1999/02/22-rdf-syntax-ns#value",true);
  }

  public void setValue(String val) {
    this.setStringLit("http://www.w3.org/1999/02/22-rdf-syntax-ns#value",val);
  }

  public String getPageStart() {
    return this.getStringLit("http://purl.org/ontology/bibo/pageStart",true);
  }

  public void setPageStart(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/pageStart",val);
  }

  public String getContent() {
    return this.getStringLit("http://purl.org/ontology/bibo/content",true);
  }

  public void setContent(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/content",val);
  }

  public String getDescription() {
    return this.getStringLit("http://purl.org/dc/terms/description",true);
  }

  public void setDescription(String val) {
    this.setStringLit("http://purl.org/dc/terms/description",val);
  }

  public String getHandle() {
    return this.getStringLit("http://purl.org/ontology/bibo/handle",true);
  }

  public void setHandle(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/handle",val);
  }

  public Integer getNumPages() {
    return this.getIntegerLit("http://purl.org/ontology/bibo/numPages",true);
  }

  public void setNumPages(Integer val) {
    this.setIntegerLit("http://purl.org/ontology/bibo/numPages",val);
  }

  public String getUri() {
    return this.getStringLit("http://purl.org/ontology/bibo/uri",true);
  }

  public void setUri(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/uri",val);
  }

  public String getSubject() {
    return this.getStringLit("http://purl.org/dc/terms/subject",true);
  }

  public void setSubject(String val) {
    this.setStringLit("http://purl.org/dc/terms/subject",val);
  }

  public String getPages() {
    return this.getStringLit("http://purl.org/ontology/bibo/pages",true);
  }

  public void setPages(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/pages",val);
  }

  public Agent getProducer() {
    return this.getRef("http://purl.org/ontology/bibo/producer",true,Agent.class);
  }

  public void setProducer(Agent val) {
    this.setRef("http://purl.org/ontology/bibo/producer",val,Agent.class);
  }

  public Agent getAuthorList(int index) {
    return this.getRefListAtIndexList("http://purl.org/ontology/bibo/authorList",true,Agent.class,index);
  }

  public List<? extends Agent> getAllAuthorList() {
    return this.getRefListList("http://purl.org/ontology/bibo/authorList",true,Agent.class);
  }

  public void addAuthorList(Agent val) {
    this.addRefListList("http://purl.org/ontology/bibo/authorList",val);
  }

  public void setAuthorList(Agent val, int index) {
    this.setRefListList("http://purl.org/ontology/bibo/authorList",val,true,index);
  }

  public void remAuthorList(Agent val) {
    this.remRefListList("http://purl.org/ontology/bibo/authorList",val,true);
  }

  public Agent getIssuer() {
    return this.getRef("http://purl.org/ontology/bibo/issuer",true,Agent.class);
  }

  public void setIssuer(Agent val) {
    this.setRef("http://purl.org/ontology/bibo/issuer",val,Agent.class);
  }

  public Agent getDistributor() {
    return this.getRef("http://purl.org/ontology/bibo/distributor",true,Agent.class);
  }

  public void setDistributor(Agent val) {
    this.setRef("http://purl.org/ontology/bibo/distributor",val,Agent.class);
  }

  public String getPageEnd() {
    return this.getStringLit("http://purl.org/ontology/bibo/pageEnd",true);
  }

  public void setPageEnd(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/pageEnd",val);
  }

  public void remRelation(String val) {
    this.remExternalRef("http://purl.org/dc/terms/relation",val,true);
  }

  public List<? extends String> getAllRelation() {
    return this.getExternalRefSet("http://purl.org/dc/terms/relation",true);
  }

  public void addRelation(String val) {
    this.addExternalRef("http://purl.org/dc/terms/relation",val);
  }

  public Organization getPublisher() {
    return this.getRef("http://purl.org/dc/terms/publisher",true,Organization.class);
  }

  public void setPublisher(Organization val) {
    this.setRef("http://purl.org/dc/terms/publisher",val,Organization.class);
  }

  public Agent getContributorList(int index) {
    return this.getRefListAtIndexList("http://purl.org/ontology/bibo/contributorList",true,Agent.class,index);
  }

  public List<? extends Agent> getAllContributorList() {
    return this.getRefListList("http://purl.org/ontology/bibo/contributorList",true,Agent.class);
  }

  public void addContributorList(Agent val) {
    this.addRefListList("http://purl.org/ontology/bibo/contributorList",val);
  }

  public void setContributorList(Agent val, int index) {
    this.setRefListList("http://purl.org/ontology/bibo/contributorList",val,true,index);
  }

  public void remContributorList(Agent val) {
    this.remRefListList("http://purl.org/ontology/bibo/contributorList",val,true);
  }

  public void remCitedBy(Document val) {
    this.remRef("http://purl.org/ontology/bibo/citedBy",val,true);
  }

  public List<? extends Document> getAllCitedBy() {
    return this.getRefSet("http://purl.org/ontology/bibo/citedBy",true,Document.class);
  }

  public void addCitedBy(Document val) {
    this.addRef("http://purl.org/ontology/bibo/citedBy",val);
  }

  public String getIdentifier() {
    return this.getStringLit("http://purl.org/ontology/bibo/identifier",true);
  }

  public void setIdentifier(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/identifier",val);
  }

  public String getCoden() {
    return this.getStringLit("http://purl.org/ontology/bibo/coden",true);
  }

  public void setCoden(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/coden",val);
  }

  public String getShortDescription() {
    return this.getStringLit("http://purl.org/ontology/bibo/shortDescription",true);
  }

  public void setShortDescription(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/shortDescription",val);
  }

  public String getDoi() {
    return this.getStringLit("http://purl.org/ontology/bibo/doi",true);
  }

  public void setDoi(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/doi",val);
  }

  public String getIsbn10() {
    return this.getStringLit("http://purl.org/ontology/bibo/isbn10",true);
  }

  public void setIsbn10(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/isbn10",val);
  }

  public String getPmid() {
    return this.getStringLit("http://purl.org/ontology/bibo/pmid",true);
  }

  public void setPmid(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/pmid",val);
  }

  public String getAbstract() {
    return this.getStringLit("http://purl.org/dc/terms/abstract",true);
  }

  public void setAbstract(String val) {
    this.setStringLit("http://purl.org/dc/terms/abstract",val);
  }

  public String getIsbn13() {
    return this.getStringLit("http://purl.org/ontology/bibo/isbn13",true);
  }

  public void setIsbn13(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/isbn13",val);
  }

  public void remReproducedIn(Document val) {
    this.remRef("http://purl.org/ontology/bibo/reproducedIn",val,true);
  }

  public List<? extends Document> getAllReproducedIn() {
    return this.getRefSet("http://purl.org/ontology/bibo/reproducedIn",true,Document.class);
  }

  public void addReproducedIn(Document val) {
    this.addRef("http://purl.org/ontology/bibo/reproducedIn",val);
  }

  public String getVolume() {
    return this.getStringLit("http://purl.org/ontology/bibo/volume",true);
  }

  public void setVolume(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/volume",val);
  }

  public String getAsin() {
    return this.getStringLit("http://purl.org/ontology/bibo/asin",true);
  }

  public void setAsin(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/asin",val);
  }

  public String getSection() {
    return this.getStringLit("http://purl.org/ontology/bibo/section",true);
  }

  public void setSection(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/section",val);
  }

  public String getUpc() {
    return this.getStringLit("http://purl.org/ontology/bibo/upc",true);
  }

  public void setUpc(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/upc",val);
  }

  public LocalDate getDateSubmitted() {
    return this.getDateLit("http://purl.org/dc/terms/dateSubmitted",true);
  }

  public void setDateSubmitted(LocalDate val) {
    this.setDateLit("http://purl.org/dc/terms/dateSubmitted",val);
  }

  public Agent getEditor() {
    return this.getRef("http://purl.org/ontology/bibo/editor",true,Agent.class);
  }

  public void setEditor(Agent val) {
    this.setRef("http://purl.org/ontology/bibo/editor",val,Agent.class);
  }

  public void remCites(Document val) {
    this.remRef("http://purl.org/ontology/bibo/cites",val,true);
  }

  public List<? extends Document> getAllCites() {
    return this.getRefSet("http://purl.org/ontology/bibo/cites",true,Document.class);
  }

  public void addCites(Document val) {
    this.addRef("http://purl.org/ontology/bibo/cites",val);
  }

  public Literature getTranscriptOf() {
    return this.getRef("http://purl.org/ontology/bibo/transcriptOf",true,Literature.class);
  }

  public void setTranscriptOf(Literature val) {
    this.setRef("http://purl.org/ontology/bibo/transcriptOf",val,Literature.class);
  }

  public String getLocator() {
    return this.getStringLit("http://purl.org/ontology/bibo/locator",true);
  }

  public void setLocator(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/locator",val);
  }

  public String getEanucc13() {
    return this.getStringLit("http://purl.org/ontology/bibo/eanucc13",true);
  }

  public void setEanucc13(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/eanucc13",val);
  }

  public Agent getEditorList(int index) {
    return this.getRefListAtIndexList("http://purl.org/ontology/bibo/editorList",true,Agent.class,index);
  }

  public List<? extends Agent> getAllEditorList() {
    return this.getRefListList("http://purl.org/ontology/bibo/editorList",true,Agent.class);
  }

  public void addEditorList(Agent val) {
    this.addRefListList("http://purl.org/ontology/bibo/editorList",val);
  }

  public void setEditorList(Agent val, int index) {
    this.setRefListList("http://purl.org/ontology/bibo/editorList",val,true,index);
  }

  public void remEditorList(Agent val) {
    this.remRefListList("http://purl.org/ontology/bibo/editorList",val,true);
  }

  public Agent getOwner() {
    return this.getRef("http://purl.org/ontology/bibo/owner",true,Agent.class);
  }

  public void setOwner(Agent val) {
    this.setRef("http://purl.org/ontology/bibo/owner",val,Agent.class);
  }

  public String getLanguage() {
    return this.getStringLit("http://purl.org/dc/terms/language",true);
  }

  public void setLanguage(String val) {
    this.setStringLit("http://purl.org/dc/terms/language",val);
  }

  public String getSici() {
    return this.getStringLit("http://purl.org/ontology/bibo/sici",true);
  }

  public void setSici(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/sici",val);
  }

  public Agent getTranslator() {
    return this.getRef("http://purl.org/ontology/bibo/translator",true,Agent.class);
  }

  public void setTranslator(Agent val) {
    this.setRef("http://purl.org/ontology/bibo/translator",val,Agent.class);
  }

  public Document getTranslationOf() {
    return this.getRef("http://purl.org/ontology/bibo/translationOf",true,Document.class);
  }

  public void setTranslationOf(Document val) {
    this.setRef("http://purl.org/ontology/bibo/translationOf",val,Document.class);
  }

  public String getOclcnum() {
    return this.getStringLit("http://purl.org/ontology/bibo/oclcnum",true);
  }

  public void setOclcnum(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/oclcnum",val);
  }

  public LocalDate getIssued() {
    return this.getDateLit("http://purl.org/dc/terms/issued",true);
  }

  public void setIssued(LocalDate val) {
    this.setDateLit("http://purl.org/dc/terms/issued",val);
  }

  public String getLccn() {
    return this.getStringLit("http://purl.org/ontology/bibo/lccn",true);
  }

  public void setLccn(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/lccn",val);
  }

  public String getShortTitle() {
    return this.getStringLit("http://purl.org/ontology/bibo/shortTitle",true);
  }

  public void setShortTitle(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/shortTitle",val);
  }

  public String getNumber() {
    return this.getStringLit("http://purl.org/ontology/bibo/number",true);
  }

  public void setNumber(String val) {
    this.setStringLit("http://purl.org/ontology/bibo/number",val);
  }

  public LocalDate getCreated() {
    return this.getDateLit("http://purl.org/dc/terms/created",true);
  }

  public void setCreated(LocalDate val) {
    this.setDateLit("http://purl.org/dc/terms/created",val);
  }

  public void remContributor(Agent val) {
    this.remRef("http://purl.org/dc/terms/contributor",val,true);
  }

  public List<? extends Agent> getAllContributor() {
    return this.getRefSet("http://purl.org/dc/terms/contributor",true,Agent.class);
  }

  public void addContributor(Agent val) {
    this.addRef("http://purl.org/dc/terms/contributor",val);
  }

  public String getTitle() {
    return this.getStringLit("http://purl.org/dc/terms/title",true);
  }

  public void setTitle(String val) {
    this.setStringLit("http://purl.org/dc/terms/title",val);
  }

  public LocalDate getDateAccepted() {
    return this.getDateLit("http://purl.org/dc/terms/dateAccepted",true);
  }

  public void setDateAccepted(LocalDate val) {
    this.setDateLit("http://purl.org/dc/terms/dateAccepted",val);
  }

  public String getRights() {
    return this.getStringLit("http://purl.org/dc/terms/rights",true);
  }

  public void setRights(String val) {
    this.setStringLit("http://purl.org/dc/terms/rights",val);
  }
}
