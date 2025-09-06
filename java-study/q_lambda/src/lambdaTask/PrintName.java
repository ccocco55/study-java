package lambdaTask;

@FunctionalInterface	// 함수형 인터페이스
public interface PrintName {
   String getFullName(String firstName, String lastName);
}
