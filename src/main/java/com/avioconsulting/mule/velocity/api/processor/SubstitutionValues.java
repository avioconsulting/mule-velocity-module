package com.avioconsulting.mule.velocity.api.processor;

import java.util.LinkedHashMap;
import java.util.Map;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class SubstitutionValues {

  @Parameter
  @DisplayName("Template Substitution Values")
  @Summary("Discrete data elements you want to replace in your template as key value pairs.")
  private Map<String, String> substitutionValues;

  public SubstitutionValues() {
    this.substitutionValues = new LinkedHashMap<String, String>();
  }

  public Map<String, String> getKeyValuePairs() {
    return substitutionValues;
  }
}
