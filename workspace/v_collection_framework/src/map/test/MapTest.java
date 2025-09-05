package map.test;

import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> caffe = new HashMap<String, Integer>();
		caffe.put("아메리카노", 3000);		// 카페에 추가
		
		caffe.put("아메리카노", 2000);
		caffe.put("카페라떼", 3000);
		System.out.println(caffe);
		
		System.out.println(caffe.get("카페라떼"));	// 키값 입력
		
	}
}
