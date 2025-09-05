package com.app.domain.member;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MemberGender {
	MAN("남"), WOMAN("여"), NONE("선택안함");
	
	private final String value;
	
//	기존에 있었던 상수들(enum객체들)을 map으로 변경한다.
//	기존에 있던 enum객체들의 getValue()가 key로
//	enum객체를 value로 설정한다.
	private static final Map<String, MemberGender> MEMBER_GENDER_MAP =
			Stream.of(MemberGender.values())
				.collect(Collectors.toMap(MemberGender::getValue, (enumeration) -> enumeration));

	private MemberGender(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
//	외부에서 전달받은 value를 map에 전달하여 enum객체를 가져온다.
	public static MemberGender getEnum(String value) {
		return MEMBER_GENDER_MAP.get(value);
	}
	
//	public static MemberGender getEnum(String value) {
//		for(MemberGender memberGender : MemberGender.values()) {
//			if(memberGender.value.equals(value)) {
//				return memberGender;
//			}
//		}
//		return null;
//	}
	
	@Override
	public String toString() {
		return value;
	}
}












