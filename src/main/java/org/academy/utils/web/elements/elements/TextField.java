package org.academy.utils.web.elements.elements;

public interface TextField extends Element{
	void type(String text);

	void clear();

	void clearAndType(String text);

	void sendKeys(String text);
}
