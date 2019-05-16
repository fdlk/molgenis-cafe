package org.molgenis.cv.model.source;

import org.molgenis.cv.model.Logic;
import org.molgenis.cv.model.QueryQueryComponentsEav;

public class DebCentral {
  public String getApiUrl() {
    return "https://deb-central.org/api/v2/Patients";
  }

  public static final String FALSE = "false";

  public String mapEav(QueryQueryComponentsEav eav) {
    switch (eav.getAttribute()) {
      case "sex":
        return "Gender==" + eav.getValue();
      case "phenotype":
        switch (eav.getValue().toLowerCase()) {
          case "hp:0008066":
            return "Blistering==yes";
          case "hp:0001903":
            return "Anaemia==yes";
          default:
            return FALSE;
        }
      default:
        return FALSE;
    }
  }

  public String mapLogic(Logic logic) {
    return "";
  }
}
