package config;

import org.openqa.selenium.WebElement;
/**
 * Class to have mapping between Element and index of element amongst the link.
 * @author jkhanuja
 */
public class EmailParameters {
	String testCaseNumber;
	public EmailParameters(String testCaseNumber, String emailTo, String from, String subject, String[] content) {
		
		this.testCaseNumber = testCaseNumber;
		this.emailTo = emailTo;
		this.from = from;
		this.subject = subject;
		this.content = content;
	}

	public String getTestCaseNumber() {
		return testCaseNumber;
	}

	public void setTestCaseNumber(String testCaseNumber) {
		this.testCaseNumber = testCaseNumber;
	}

	String emailTo;
	String from;
	String subject;
	String content[];
	
	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String[] getContent() {
		return content;
	}

	public void setContent(String[] content) {
		this.content = content;
	}
	
}
