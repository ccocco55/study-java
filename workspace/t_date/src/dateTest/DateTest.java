package dateTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTest {
	public static void main(String[] args) {
//		기본으로 알아야할 날짜 타입(Date, Calendar)
//		Date: 기본적으로 날짜 계산을 할 때에 사용되는 클래스이다.
//			  하지만 날짜를 조정하거나 활용할 때에는 여러 이유로 사용하지 않는다.
//		Calendar: 날짜를 조정하거나 활용할 때에 사용되는 클래스이다.
		
//		Date date = new Date();
//		System.out.println(date);
		
//		Calendar now = Calendar.getInstance();
//		System.out.println(now);
//		System.out.println(now.get(Calendar.YEAR));
//		System.out.println(now.get(Calendar.MONTH));
//		System.out.println(now.get(Calendar.DATE));
		
//		Calendar date = Calendar.getInstance();
//		date.set(2035, 11, 4);
//		System.out.println(date);
		
//		원하는 형식의 날짜로 변경(Date를 String으로)
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String format = simpleDateFormat.format(date.getTime());
//		System.out.println(format);
		
//		특정 형식의 문자열을 날짜로 변경(String을 Date로)
//		String content = "2025-06-25";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			System.out.println(simpleDateFormat.parse(content));
//		} catch (ParseException e) {
//			System.out.println("올바른 형식이 아닙니다.");
//		}
		
//		Calendar date = Calendar.getInstance();
//		date.set(2025, 6, 25);
//		Date now = new Date();
//		System.out.println((date.getTime().getTime() - now.getTime()) / 1000 / 60 / 60 / 24);
		
//		번외: 고급
//		LocalDate localDate = LocalDate.parse("2025-06-25");
//		
//		String format = localDate.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
//		
//		System.out.println(localDate);
//		System.out.println(format);
		
//		LocalDateTime now = LocalDateTime.now();
//		LocalDateTime localDateTime = LocalDateTime.of(2025, 12, 4, 12, 0);
//		System.out.println(localDateTime);
//		System.out.println(localDateTime.isBefore(now));
//		System.out.println(localDateTime.isEqual(now));
//		System.out.println(localDateTime.isAfter(now));
		
//		Duration duration = Duration.between(now, localDateTime);
//		
//		System.out.println("초" + duration.getSeconds());
//		System.out.println("분" + duration.toMinutes());
//		System.out.println("시" + duration.toHours());
		
//		LocalDate now = LocalDate.now();
//		LocalDate localDate = LocalDate.of(2025, 12, 4);
		
//		Period period = Period.between(now, localDate);
//		
//		System.out.println("차이: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");

//		LocalDateTime now = LocalDateTime.now();
//		LocalDateTime localDateTime = LocalDateTime.of(2025, 12, 4, 12, 0);
//		
//        long hours = ChronoUnit.HOURS.between(now, localDateTime);
//        long minutes = ChronoUnit.MINUTES.between(now, localDateTime);
//        long days = ChronoUnit.DAYS.between(now, localDateTime);
//        long months = ChronoUnit.MONTHS.between(now, localDateTime);
//        long years = ChronoUnit.YEARS.between(now, localDateTime);
//		
//        System.out.println("시: " + hours);
//        System.out.println("분: " + minutes);
//        System.out.println("일: " + days);
//        System.out.println("월: " + months);
//        System.out.println("년: " + years);
		
	}
}













