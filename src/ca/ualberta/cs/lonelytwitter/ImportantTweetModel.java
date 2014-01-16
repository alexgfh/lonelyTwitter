package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweetModel extends AbstractTweetModel {
	
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
	public boolean isImportant() {
		return true;
	}

}
