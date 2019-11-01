package life.gbol.domain;

import java.lang.String;
import nl.wur.ssb.RDFSimpleCon.api.EnumClass;

/**
 * Code generated from http://gbol.life/0.1/ ontology
 */
public enum Ocean implements EnumClass {
  Atlantic_Ocean("http://gbol.life/0.1/Atlantic_Ocean",new Ocean[]{}),

  Tasman_Sea("http://gbol.life/0.1/Tasman_Sea",new Ocean[]{}),

  Indian_Ocean("http://gbol.life/0.1/Indian_Ocean",new Ocean[]{}),

  Southern_Ocean("http://gbol.life/0.1/Southern_Ocean",new Ocean[]{}),

  Pacific_Ocean("http://gbol.life/0.1/Pacific_Ocean",new Ocean[]{}),

  North_Sea("http://gbol.life/0.1/North_Sea",new Ocean[]{}),

  Ross_Sea("http://gbol.life/0.1/Ross_Sea",new Ocean[]{}),

  Baltic_Sea("http://gbol.life/0.1/Baltic_Sea",new Ocean[]{}),

  Mediterranean_Sea("http://gbol.life/0.1/Mediterranean_Sea",new Ocean[]{}),

  Arctic_Ocean("http://gbol.life/0.1/Arctic_Ocean",new Ocean[]{});

  private Ocean[] parents;

  private String iri;

  private Ocean(String iri, Ocean[] parents) {
    this.iri = iri;
    this.parents = parents;
  }

  public EnumClass[] getParents() {
    return parents;
  }

  public String getIRI() {
    return this.iri;
  }

  public static Ocean make(String iri) {
    for(Ocean item : Ocean.values()) {
      if(item.iri.equals(iri)) {
        return item;
      }
    }
    throw new RuntimeException("Enum value: " + iri + " not found for enum type: EnumExample");
  }
}
