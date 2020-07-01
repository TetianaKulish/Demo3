package org.academy.api;

import org.academy.PropertyReader;

public class Resources {
    private static String read(String value) {
        return PropertyReader.get().readValue(value);
    }
    public static String getPullRequests() {
        return read("pull_requests");
    }
    public static String getCommitCommentReaction() { return read("commit_comment_reaction"); }
}
