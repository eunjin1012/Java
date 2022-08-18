package week21;

import java.io.*;
import java.util.*;

public class EnglishDic {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("c:/work/dic.dat");
		BufferedReader br=new BufferedReader(fr);
		
		
		Map<String, String> dic=new HashMap<String, String>();
		
		String str, eng, kor;
		
		while((str=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(str);
			eng=st.nextToken();
			kor=st.nextToken();
			dic.put(eng, kor);
		}
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("영어단어 ? ");
			String key=sc.next();
			if(key.contentEquals("quit")) {
				System.out.println("done!");
				break;
			}
			if(dic.get(key)!=null)
				System.out.println("한글 : "+dic.get(key));
			else
				System.out.println("Not exist!");
		}while(true);
		sc.close();
	}

}
