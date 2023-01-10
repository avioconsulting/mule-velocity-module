package com.avioconsulting.mule.velocity.api.processor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mule.runtime.extension.api.annotation.param.NullSafe;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class SubstitutionValues {

  @Parameter
  @DisplayName("Template Substitution Values")
  @Optional
  @NullSafe
  @Summary("Discrete data elements you want to replace in your template as key value pairs.")
  private List<SubstitutionValue> substitutionValues;

  public SubstitutionValues() {
    this.substitutionValues = new ArrayList<>();
  }

  public List<SubstitutionValue> getValueList() {
    return this.substitutionValues;
  }

  public Map<String, String> getKeyValuePairs() {
    Map<String, String> pairs = new LinkedHashMap<>();
    if (substitutionValues != null) {
      for (SubstitutionValue a : substitutionValues) {
        pairs.put(a.getKey(), a.getValue());
      }
    }
    return pairs;
  }
}
