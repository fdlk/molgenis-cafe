package org.molgenis.cv.source;

import static org.testng.Assert.assertEquals;

import java.util.Optional;
import org.molgenis.cv.model.QueryQueryComponentsEav;
import org.testng.annotations.Test;

public class DebCentralTest {

  private DebCentral debCentral = new DebCentral(null);

  @Test
  public void testMapSex() {
    QueryQueryComponentsEav eav =
        new QueryQueryComponentsEav().attribute("sex").operator("is").value("m");
    assertEquals(debCentral.toRsql(eav), Optional.of("Gender==m"));
  }

  @Test
  public void testMapBlistering() {
    QueryQueryComponentsEav eav =
        new QueryQueryComponentsEav().attribute("phenotype").operator("is").value("HP:0008066");
    assertEquals(debCentral.toRsql(eav), Optional.of("Blistering==yes"));
  }
}
