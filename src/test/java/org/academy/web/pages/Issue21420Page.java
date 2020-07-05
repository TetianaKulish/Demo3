package org.academy.web.pages;

import org.academy.utils.web.elements.elements.*;
import org.academy.web.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Issue21420Page extends AbstractPage {
    public Issue21420Page(WebDriver webDriver) {
        super(webDriver, false, "");
    }
    public Issue21420Page(WebDriver webDriver, boolean navigateToPage, String navigateToPageUrl) {
        super(webDriver, navigateToPage, navigateToPageUrl);
    }

    @FindBy(xpath = "//tr[contains(@class,'d-block')]//p")
    private List<WebElement> commentsList;

    @FindBy(xpath ="//div[contains(@class,'comment-reactions flex-items-center border-top has-reactions js-reactions-container')]")
    private WebElement reaction;

    public String getLastComment() {
        return commentsList.get(commentsList.size()-1).getText();
    }

    public String getReaction(){
        return reaction.getText();
    }
}
