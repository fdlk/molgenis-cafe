package org.molgenis.cv.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.TextNode;
import java.io.IOException;

public class LogicDeserializer extends JsonDeserializer<Logic> {

  @Override
  public Logic deserialize(JsonParser p, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
    TreeNode node = p.readValueAsTree();

    // Select the concrete class based on the existence of a property
    if (node.get("-AND") != null) {
      return p.getCodec().treeToValue(node, And.class);
    }
    if (node.get("-OR") != null) {
      return p.getCodec().treeToValue(node, Or.class);
    }

    String reference = ((TextNode) node).asText();
    return new PredicateReference(reference);
  }
}
