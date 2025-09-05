package classTest;

public class ClassTask09 {
//	화면

//	게시글과 댓글 정보를 받아서 추가한다.
//	게시글에서는 댓글의 전체 개수를 계산 할 수 있다.

//	게시글(Post)
//	번호
//	제목
//	내용

//	댓글(Reply)
//	번호
//	내용
	public static void main(String[] args) {
		Reply[] arReply = { new Reply(1, "반갑습니다."), 	// 댓글 배열
				new Reply(2, "안녕하세요."), 
				new Reply(3, "안녕하세요.") };
		Post post = new Post(1, "반가워요.", "처음 뵙겠습니다.", arReply);

		System.out.println(post.totalReply);	// 게시물에 달린 총 댓글 수 
	}
}
