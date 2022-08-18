package week21;

import java.io.*;
import java.util.*;

public class EnglishDic2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("c:/work/dic.dat");
		BufferedReader br=new BufferedReader(fr);
		
		
		Map<String, String> dic=new HashMap<String, String>();
		
		String str, eng, kor;
		
		while((str=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(str);
			eng=st.nextToken();
			kor=st.nextToken();
			dic.put(kor, eng);
		}
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("한글 ? ");
			String key=sc.next();
			if(key.contentEquals("그만")) {
				System.out.println("종료!");
				break;
			}
			if(dic.get(key)!=null)
				System.out.println("english : "+dic.get(key));
			else
				System.out.println("없는 단어!");
		}while(true);
		sc.close();
	}

}
