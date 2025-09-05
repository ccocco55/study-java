package classTest;

public class Post {
	int number;
	String title;
	String content;
	int totalReply;

	Reply[] reply;

	public Post(int number, String title, String content, Reply[] reply) {
		super();
		this.number = number;
		this.title = title;
		this.content = content;
		this.reply = reply;
		totalReply = reply.length;
	}

}
