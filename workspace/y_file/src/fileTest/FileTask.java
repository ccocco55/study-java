package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
//		생선 종류를 작성한 뒤
//		전체 생선 종류를 콘솔에 출력한다.
//		생선은 최대 3개까지만 작성한다.
//		파일 이름: fish.txt
//		경로: ./
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fish.txt"));
//		bufferedWriter.write("날치\n");
//		bufferedWriter.write("참치\n");
//		bufferedWriter.write("연어\n");
//		bufferedWriter.close();
	
//		BufferedReader bufferedReader = null;
//		String line = null;
//		try {
//			bufferedReader = new BufferedReader(new FileReader("fish.txt"));
//			
//			while((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
//			}
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("파일의 위치를 다시 확인해주세요.");
//			
//		} finally {
//			if(bufferedReader != null) {
//				bufferedReader.close();
//			}
//		}
		
//		수정
//		날치를 꽁치로 수정
//		BufferedWriter bufferedWriter = null;
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("fish.txt"));
//		StringBuilder stringBuilder = new StringBuilder();
//		String line = null, temp = null;
//		
//		while((line = bufferedReader.readLine()) != null) {
//			if(line.equals("날치")) {
//				stringBuilder.append("꽁치\n");
//				continue;
//			}
//			stringBuilder.append(line + "\n");
//		}
//		
//		bufferedReader.close();
//		
//		temp = stringBuilder.toString();
//		
//		bufferedWriter = new BufferedWriter(new FileWriter("fish.txt"));
//		bufferedWriter.write(temp);
//		bufferedWriter.close();
		
//		삭제
//		꽁치(본인이 선택한 1개의 생선)를 삭제한다.
		BufferedWriter bufferedWriter = null;
		BufferedReader bufferedReader = new BufferedReader(new FileReader("fish.txt"));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null, temp = null;
		
		while((line = bufferedReader.readLine()) != null) {
			if(line.equals("꽁치")) {
//				꽁치 빼고 나머지 담기
				continue;
			}
			stringBuilder.append(line + "\n");
		}
		
		bufferedReader.close();
		
		temp = stringBuilder.toString();
		
		bufferedWriter = new BufferedWriter(new FileWriter("fish.txt"));
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}
}











