package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class NormalTweetModel extends LonelyTweetModel {

	public NormalTweetModel(String text) {
		super(text);
	}

	@Override
	public String getText() {
		return super.text;
	}

	@Override
	public boolean isImportant() {
		return false;
	}

}
