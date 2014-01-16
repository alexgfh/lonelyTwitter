package ca.ualberta.cs.lonelytwitter;

public class NormalTweetModel extends AbstractTweetModel {

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
