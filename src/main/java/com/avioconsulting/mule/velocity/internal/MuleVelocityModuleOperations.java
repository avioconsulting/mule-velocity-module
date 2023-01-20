package com.avioconsulting.mule.velocity.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import com.avioconsulting.mule.velocity.api.processor.SubstitutionValues;
import com.avioconsulting.mule.velocity.api.processor.VelocityInfo;
import java.io.StringWriter;
import java.util.Map;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

/**
 * This class is a container for operations, every public method in this class
 * will be taken as an extension operation.
 */
public class MuleVelocityModuleOperations {

  @DisplayName("Process Template")
  @MediaType(value = ANY, strict = false)
  public String processTemplate(@ParameterGroup(name = "Velocity Template Info") VelocityInfo velocityInfo,
      @ParameterGroup(name = "Substitution Values") SubstitutionValues inputValues) {
    String resultString = "";

    resultString = parseTemplate(velocityInfo.getTemplateString(), inputValues.getKeyValuePairs(),
        velocityInfo.getLogTag());

    return resultString;
  }

  private String parseTemplate(String template, Map<String, String> values, String logTag) {
    String message = "";

    // Initialize velocity context for template parsing
    Velocity.init();
    VelocityContext context = new VelocityContext();

    // Add key value pairs to velocity context for variable substitution
    for (Map.Entry<String, String> input : values.entrySet()) {
      context.put(input.getKey(), input.getValue());
    }

    StringWriter writer = new StringWriter();

    // Parse/Evaluate the template with the specified log tag and variable
    // substitutions
    Velocity.evaluate(context, writer, logTag, template);

    message = writer.toString();

    return message;
  }

}
