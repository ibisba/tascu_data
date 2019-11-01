package org.purl.ontology.bibo.domain;

import com.xmlns.foaf.domain.Agent;
import com.xmlns.foaf.domain.Organization;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import nl.wur.ssb.RDFSimpleCon.api.OWLThing;

/**
 * Code generated from http://purl.org/ontology/bibo/ ontology
 */
public interface Literature extends OWLThing {
  String getGtin14();

  void setGtin14(String val);

  void remReviewOf(Literature val);

  List<? extends Literature> getAllReviewOf();

  void addReviewOf(Literature val);

  String getEdition();

  void setEdition(String val);

  DocumentStatus getStatus();

  void setStatus(DocumentStatus val);

  String getValue();

  void setValue(String val);

  String getPageStart();

  void setPageStart(String val);

  String getContent();

  void setContent(String val);

  String getDescription();

  void setDescription(String val);

  String getHandle();

  void setHandle(String val);

  Integer getNumPages();

  void setNumPages(Integer val);

  String getUri();

  void setUri(String val);

  String getSubject();

  void setSubject(String val);

  String getPages();

  void setPages(String val);

  Agent getProducer();

  void setProducer(Agent val);

  Agent getAuthorList(int index);

  List<? extends Agent> getAllAuthorList();

  void addAuthorList(Agent val);

  void setAuthorList(Agent val, int index);

  void remAuthorList(Agent val);

  Agent getIssuer();

  void setIssuer(Agent val);

  Agent getDistributor();

  void setDistributor(Agent val);

  String getPageEnd();

  void setPageEnd(String val);

  void remRelation(String val);

  List<? extends String> getAllRelation();

  void addRelation(String val);

  Organization getPublisher();

  void setPublisher(Organization val);

  Agent getContributorList(int index);

  List<? extends Agent> getAllContributorList();

  void addContributorList(Agent val);

  void setContributorList(Agent val, int index);

  void remContributorList(Agent val);

  void remCitedBy(Document val);

  List<? extends Document> getAllCitedBy();

  void addCitedBy(Document val);

  String getIdentifier();

  void setIdentifier(String val);

  String getCoden();

  void setCoden(String val);

  String getShortDescription();

  void setShortDescription(String val);

  String getDoi();

  void setDoi(String val);

  String getIsbn10();

  void setIsbn10(String val);

  String getPmid();

  void setPmid(String val);

  String getAbstract();

  void setAbstract(String val);

  String getIsbn13();

  void setIsbn13(String val);

  void remReproducedIn(Document val);

  List<? extends Document> getAllReproducedIn();

  void addReproducedIn(Document val);

  String getVolume();

  void setVolume(String val);

  String getAsin();

  void setAsin(String val);

  String getSection();

  void setSection(String val);

  String getUpc();

  void setUpc(String val);

  LocalDate getDateSubmitted();

  void setDateSubmitted(LocalDate val);

  Agent getEditor();

  void setEditor(Agent val);

  void remCites(Document val);

  List<? extends Document> getAllCites();

  void addCites(Document val);

  Literature getTranscriptOf();

  void setTranscriptOf(Literature val);

  String getLocator();

  void setLocator(String val);

  String getEanucc13();

  void setEanucc13(String val);

  Agent getEditorList(int index);

  List<? extends Agent> getAllEditorList();

  void addEditorList(Agent val);

  void setEditorList(Agent val, int index);

  void remEditorList(Agent val);

  Agent getOwner();

  void setOwner(Agent val);

  String getLanguage();

  void setLanguage(String val);

  String getSici();

  void setSici(String val);

  Agent getTranslator();

  void setTranslator(Agent val);

  Document getTranslationOf();

  void setTranslationOf(Document val);

  String getOclcnum();

  void setOclcnum(String val);

  LocalDate getIssued();

  void setIssued(LocalDate val);

  String getLccn();

  void setLccn(String val);

  String getShortTitle();

  void setShortTitle(String val);

  String getNumber();

  void setNumber(String val);

  LocalDate getCreated();

  void setCreated(LocalDate val);

  void remContributor(Agent val);

  List<? extends Agent> getAllContributor();

  void addContributor(Agent val);

  String getTitle();

  void setTitle(String val);

  LocalDate getDateAccepted();

  void setDateAccepted(LocalDate val);

  String getRights();

  void setRights(String val);
}
