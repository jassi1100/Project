package config;

import org.openqa.selenium.WebElement;
/**
 * Class to have mapping between Element and index of element amongst the link.
 * @author jkhanuja
 */
public class Emails {
	
	public Emails(String from, String subject, String content) {
		
		this.from = from;
		this.subject = subject;
		this.content = content;
	}

	
	
	String from;
	String subject;
	String content;
	
	
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
