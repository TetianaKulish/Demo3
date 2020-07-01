package org.academy.api.tests;

import org.academy.TestConfigurations;
import org.academy.api.requests.CreateReactionOnIssue;
import org.testng.annotations.Test;

public class IssueTests {
    private CreateReactionOnIssue reactionForIssue = new CreateReactionOnIssue();

    @Test
    public void createReactionOnIssue() {
        reactionForIssue.createReactionOnIssue(TestConfigurations.getApiToken(), 200);
    }
}
