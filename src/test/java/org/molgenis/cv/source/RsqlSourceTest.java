package org.molgenis.cv.source;

import static org.junit.Assert.assertEquals;

import java.util.Optional;
import org.molgenis.cv.model.PredicateReference;
import org.molgenis.cv.model.Query;
import org.molgenis.cv.model.Components;
import org.molgenis.cv.model.Eav;

public class RsqlSourceTest {

  public void testToSpelExpression() {
    assertEquals(RsqlSource.toSpelExpression("/query/components/eav/24"), "components.eav[24]");
  }

  public void testGetComponent() {
    PredicateReference reference = new PredicateReference("/query/components/eav/2");
    Eav eav0 =
        new Eav().attribute("x0").operator("is").value("y0");
    Eav eav1 =
        new Eav().attribute("x1").operator("is").value("y1");
    Eav eav2 =
        new Eav().attribute("x2").operator("is").value("y2");
    Eav eav3 =
        new Eav().attribute("x3").operator("is").value("y3");
    Components components =
        new Components()
            .addEavItem(eav0)
            .addEavItem(eav1)
            .addEavItem(eav2)
            .addEavItem(eav3);
    Query query = new Query().components(components);
    assertEquals(RsqlSource.getComponent(reference, query), Optional.of(eav2));
  }

  public void testGetComponentNotFound() {
    PredicateReference reference = new PredicateReference("/query/components/subjectVariant/0");
    Query query = new Query().components(new Components());
    assertEquals(RsqlSource.getComponent(reference, query), Optional.empty());
  }
}
