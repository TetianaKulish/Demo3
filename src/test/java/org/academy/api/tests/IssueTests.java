package org.academy.api.tests;

import org.academy.TestConfigurations;
import org.academy.api.requests.CreateReactionOnIssue;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class IssueTests {
    private CreateReactionOnIssue reactionForIssue = new CreateReactionOnIssue();

    @Test
    public void createReactionOnIssue() {
        //byte[] asBytes = Base64.getDecoder().decode(TestConfigurations.getApiToken());
       // String base64Decoded = new String(asBytes, StandardCharsets.UTF_8);
        reactionForIssue.createReactionOnIssue("ced23e54c13c27ebf2d7"+"c80bda62921652bfd6c0", 200);
    }
}
