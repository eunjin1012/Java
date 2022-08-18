package week20;
import java.text.SimpleDateFormat;
import java.util.*;
public class Worldtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format1=new SimpleDateFormat ("yyyy년 MM월 dd일 a HH시 mm분 ss초");
		SimpleDateFormat format2=new SimpleDateFormat ("yy년 MM월 dd일 a HH시 mm분 ss초");
		SimpleDateFormat format3=new SimpleDateFormat("dd-M-yyyy a HH:mm:ss");
		SimpleDateFormat format4=new SimpleDateFormat("M-dd-yyyy a HH:mm:ss");
		SimpleDateFormat format5=new SimpleDateFormat("yy-MM-dd EEEE a HH:mm:ss");
		SimpleDateFormat format6=new SimpleDateFormat("yyyy-M-dd a HH:mm:ss");
		SimpleDateFormat format7=new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss");
		SimpleDateFormat format8=new SimpleDateFormat("G yyyy-M-dd EEEE HH:mm:ss a");
		SimpleDateFormat format9=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		SimpleDateFormat format10=new SimpleDateFormat("yy/M월/dd HH:mm:ss a");
		
		TimeZone tz1, tz2, tz3, tz4, tz5, tz6, tz7, tz8, tz9, tz10;
		
		tz1=TimeZone.getTimeZone("Asia/Seoul");
		format1.setTimeZone(tz1);
		
		tz2=TimeZone.getTimeZone("Europe/Paris");
		format2.setTimeZone(tz2);
		
		tz3=TimeZone.getTimeZone("America/New_York");
		format3.setTimeZone(tz3);
		
		tz4=TimeZone.getTimeZone("America/Los_Angeles");
		format4.setTimeZone(tz4);
		
		tz5=TimeZone.getTimeZone("America/Belem");
		format5.setTimeZone(tz5);
		
		tz6=TimeZone.getTimeZone("Europe/Moscow");
		format6.setTimeZone(tz6);
		
		tz7=TimeZone.getTimeZone("Asia/Riyadh");
		format7.setTimeZone(tz7);
		
		tz8=TimeZone.getTimeZone("Africa/Maseru");
		format8.setTimeZone(tz8);
		
		tz9=TimeZone.getTimeZone("Australia/Queensland");
		format9.setTimeZone(tz9);
		
		tz10=TimeZone.getTimeZone("Asia/Harbin");
		format10.setTimeZone(tz10);
		
		Date time=new Date();
		
		String time1=format1.format(time);
		String time2=format2.format(time);
		String time3=format3.format(time);
		String time4=format4.format(time);
		String time5=format5.format(time);
		String time6=format6.format(time);
		String time7=format7.format(time);
		String time8=format8.format(time);
		String time9=format9.format(time);
		String time10=format10.format(time);
		
		System.out.println("대한민국 표준시");
		System.out.println(time1);
		System.out.println();
		System.out.println("중부 유럽 표준시");
		System.out.println(time2);
		System.out.println();
		System.out.println("미 동부 표준시");
		System.out.println(time3);
		System.out.println();
		System.out.println("미 태평양 표준시");
		System.out.println(time4);
		System.out.println();
		System.out.println("브라질리아 표준시");
		System.out.println(time5);
		System.out.println();
		System.out.println("모스크바 표준시");
		System.out.println(time6);
		System.out.println();
		System.out.println("아라비아 표준시");
		System.out.println(time7);
		System.out.println();
		System.out.println("남아프리카 시간");
		System.out.println(time8);
		System.out.println();
		System.out.println("오스트레일리아 동부 표준시");
		System.out.println(time9);
		System.out.println();
		System.out.println("중국 표준시");
		System.out.println(time10);
		
		
		System.out.println();
		
		
		
		}
	}
