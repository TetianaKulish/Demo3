package org.academy.web.tests;

import org.academy.TestConfigurations;
import org.academy.utils.web.AbstractWebDriver;
import org.academy.web.pages.BasePage;
import org.academy.web.pages.Issue21420Page;
import org.academy.web.pages.IssuesPage;
import org.academy.web.pages.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IssueTest_2 extends AbstractWebDriver {
    private MainPage mainPage;
    private BasePage basePage;
    private IssuesPage issuesPagePage;
    private Issue21420Page issue21420Page;

    public IssueTest_2() {
        super();
    }

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = new MainPage(webDriver, true, TestConfigurations.getUrl());
        basePage = mainPage
                .clickOnSignIn()
                .login();
        issuesPagePage = basePage.clickOnIssuesLink();
    }

    @Test
    public void checkReactionOnIssue(){
        issue21420Page = issuesPagePage.clickOnIssueById();
        String content =  issue21420Page.getReaction();
        assertThat(content).as("reaction on issue is corect").isEqualTo("\uD83D\uDC4D");
    }
}
