package com.avioconsulting.mule.velocity.internal;

import org.mule.runtime.extension.api.annotation.Operations;

/**
 * This class represents an extension configuration, values set in this class
 * are commonly used across multiple operations since they represent something
 * core from the extension.
 */
@Operations(MuleVelocityModuleOperations.class)
public class MuleVelocityModuleConfiguration {
  /*
   * @Parameter private String configId;
   *
   * public String getConfigId() { return configId; }
   */
}
