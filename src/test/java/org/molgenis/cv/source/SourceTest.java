package org.molgenis.cv.source;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;

import java.util.Optional;
import org.molgenis.cv.model.PredicateReference;
import org.molgenis.cv.model.QueryQuery;
import org.molgenis.cv.model.QueryQueryComponents;
import org.molgenis.cv.model.QueryQueryComponentsEav;
import org.testng.annotations.Test;

public class SourceTest {

  @Test
  public void testToSpelExpression() {
    assertEquals(Source.toSpelExpression("/query/components/eav/24"), "components.eav[24]");
  }

  @Test
  public void testGetComponent() {
    PredicateReference reference = new PredicateReference("/query/components/eav/2");
    QueryQueryComponentsEav eav0 =
        new QueryQueryComponentsEav().attribute("x0").operator("is").value("y0");
    QueryQueryComponentsEav eav1 =
        new QueryQueryComponentsEav().attribute("x1").operator("is").value("y1");
    QueryQueryComponentsEav eav2 =
        new QueryQueryComponentsEav().attribute("x2").operator("is").value("y2");
    QueryQueryComponentsEav eav3 =
        new QueryQueryComponentsEav().attribute("x3").operator("is").value("y3");
    QueryQueryComponents components =
        new QueryQueryComponents()
            .addEavItem(eav0)
            .addEavItem(eav1)
            .addEavItem(eav2)
            .addEavItem(eav3);
    QueryQuery query = new QueryQuery().components(components);
    assertEquals(Source.getComponent(reference, query), Optional.of(eav2));
  }

  @Test
  public void testGetComponentNotFound() {
    PredicateReference reference = new PredicateReference("/query/components/subjectVariant/0");
    QueryQuery query = new QueryQuery().components(new QueryQueryComponents());
    assertEquals(Source.getComponent(reference, query), Optional.empty());
  }
}
