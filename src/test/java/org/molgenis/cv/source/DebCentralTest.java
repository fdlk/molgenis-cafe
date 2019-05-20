package org.molgenis.cv.source;

import java.util.Optional;
import org.molgenis.cv.model.Eav;
import static org.junit.Assert.assertEquals;

public class DebCentralTest {

  private DebCentral debCentral = new DebCentral(null);

  public void testMapSex() {
    Eav eav =
        new Eav().attribute("sex").operator("is").value("m");
    assertEquals(debCentral.toRsql(eav), Optional.of("Gender==m"));
  }

  public void testMapBlistering() {
    Eav eav =
        new Eav().attribute("phenotype").operator("is").value("HP:0008066");
    assertEquals(debCentral.toRsql(eav), Optional.of("Blistering==yes"));
  }
}
