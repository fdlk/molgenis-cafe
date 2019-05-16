package org.molgenis.cv.model.source;

import static org.testng.Assert.*;

import org.molgenis.cv.model.QueryQueryComponentsEav;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DebCentralTest {

  private DebCentral debCentral = new DebCentral();

  @Test
  public void testMapSex() {
    QueryQueryComponentsEav eav = new QueryQueryComponentsEav().attribute("sex").operator("is").value("m");
    assertEquals(debCentral.mapEav(eav), "Gender==m");
  }

  @Test
  public void testMapBlistering() {
    QueryQueryComponentsEav eav = new QueryQueryComponentsEav().attribute("phenotype").operator("is").value("HP:0008066");
    assertEquals(debCentral.mapEav(eav), "Blistering==yes");
  }
}