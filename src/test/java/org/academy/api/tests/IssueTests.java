package org.academy.api.tests;

import lombok.extern.slf4j.Slf4j;
import org.academy.TestConfigurations;
import org.academy.api.requests.CreateReactionOnIssue;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Slf4j
public class IssueTests {
    private CreateReactionOnIssue reactionForIssue = new CreateReactionOnIssue();

    @Test
    public void createReactionOnIssue() {
        log.info("put reaction on issue (API)");
        byte[] asBytes = Base64.getDecoder().decode(TestConfigurations.getApiToken());
        String base64Decoded = new String(asBytes, StandardCharsets.UTF_8);
        reactionForIssue.createReactionOnIssue(base64Decoded, 200);
    }
}
