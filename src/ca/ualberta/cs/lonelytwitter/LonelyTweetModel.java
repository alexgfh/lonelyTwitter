package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class LonelyTweetModel {
	protected String text;
	protected Date timestamp;
	
	public LonelyTweetModel(String text, Date timestamp) {
		super();
		this.text = text;
		this.timestamp = timestamp;
	}
	
	public LonelyTweetModel(String text) {
		super();
		this.text = text;
		timestamp = new Date();
	}
	
	public abstract String getText();
	
	public void setText(String text) {
		this.text = text;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public abstract boolean isImportant();
}
