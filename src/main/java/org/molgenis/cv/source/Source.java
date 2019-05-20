package org.molgenis.cv.source;

import org.molgenis.cv.model.QueryRequest;
import org.molgenis.cv.model.QueryResponse;

public interface Source {
  QueryResponse query(QueryRequest body);
}
