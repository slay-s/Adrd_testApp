package testApp;
 
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class Adrd_testApp {
	public static void main(String args[])throws TwitterException {
		//twitter4j��Twitter�N���X
		Twitter twitter = new TwitterFactory().getInstance();
		User user = twitter.verifyCredentials();
		//���[�U���擾
		System.out.println("���O�@�@�@�@�F" + user.getName());
		System.out.println("�\�����@�@�@�F" + user.getScreenName());
		System.err.println("�t�H���[���@�F" + user.getFriendsCount());
		System.out.println("�t�H�����[���F" + user.getFollowersCount());
		//�Ԃ₫�̎��s
		Status status = twitter.updateStatus("HeLL java Twitter!!");
	}	
}
