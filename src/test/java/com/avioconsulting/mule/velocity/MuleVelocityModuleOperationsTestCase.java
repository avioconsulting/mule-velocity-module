package com.avioconsulting.mule.velocity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;

public class MuleVelocityModuleOperationsTestCase extends MuleArtifactFunctionalTestCase {

  /**
   * Specifies the mule config xml with the flows that are going to be executed in
   * the tests, this file lives in the test resources.
   */
  @Override
  protected String getConfigFile() {
    return "test-mule-config.xml";
  }

  @Test
  public void executeTestTemplate() throws Exception {
    String payloadValue = ((String) flowRunner("template-test").run().getMessage().getPayload().getValue());
    assertThat(payloadValue, is("Hi!  This is TEST from the VELOCITY project."));
  }
}
