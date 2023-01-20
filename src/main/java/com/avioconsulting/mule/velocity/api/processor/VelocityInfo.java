package com.avioconsulting.mule.velocity.api.processor;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Example;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class VelocityInfo {

  @Parameter
  @DisplayName("Template")
  @Summary("The template for velocity to process either as a string or as a reference to a variable containing a string")
  @Example("#[vars.templateString]")
  private String templateString;

  @Parameter
  @DisplayName("Log Tag")
  @Summary("A tag to identify logs for processing a template")
  @Example("#[vars.logTag]")
  private String logTag;

  public String getTemplateString() {
    return templateString;
  }

  public String getLogTag() {
    return logTag;
  }
}
