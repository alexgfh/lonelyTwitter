package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweetModel extends LonelyTweetModel {
	
	public ImportantTweetModel(String text, Date timestamp) {
		super(text, timestamp);
	}

	public ImportantTweetModel(String text) {
		super(text);
	}
	
	@Override
	public String getText() {
		return "Important! " + super.text;
	}

	@Override
	public Date getTimestamp() {
		return super.timestamp;
	}

}
