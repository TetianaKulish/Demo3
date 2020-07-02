package org.academy.api.requests;

import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.academy.api.Resources;

;

@Slf4j
public class CreateReactionOnIssue extends AbstractRequests {
    public void createReactionOnIssue(String token, int responseCode) {
        Response response = postIssues.withToken(token, responseCode, Resources.getCommitCommentReaction());
        log.info(response.asString());
    }
}

