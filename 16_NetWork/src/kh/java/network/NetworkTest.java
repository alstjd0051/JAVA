package kh.java.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class NetworkTest {

	public static void main(String[] args) {
		NetworkTest n = new NetworkTest();
//		n.test1();
//		n.test2();
		n.test3();
	}
	
	/**
	 * URL 연결 요청
	 * -> 파일로 저장
	 */
	private void test3() {
		String address = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%BD%94%EB%A1%9C%EB%82%98";
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			bw = new BufferedWriter(new FileWriter("search_result.html"));
			
			
			String data = "";
			while((data = br.readLine()) != null) {
//				System.out.println(data);
				bw.write(data);
				bw.write("\n");
			}
			
			System.out.println("검색 완료!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * URL
	 * protocol + hostname + port + 자원path
	 * 
	 * https://
	 * docs.oracle.com
	 * :443 ----> 프로토콜에 대한 기본포트는 생략가능  https-443, http-80, ftp-20...
	 * /javase/8/docs/api/java/util/ArrayList.html
	 * 
	 * protocol : 통신규약  http https ftp....
	 * 
	 * port : 서비스번호. 컴퓨터내에 특정프로그램을 가리키는 논리적인 번호
	 * 
	 */
	private void test2() {
		try {
//			URL url = new URL("https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html");
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%BD%94%EB%A1%9C%EB%82%98");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort() != -1 ? url.getPort() : url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());//사용자 입력값
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * InetAddress
	 * IP주소에 대한 정보를 가진 클래스
	 * 
	 * - ip : 10.10.10.10 4바이트로 이루어진 실제 주소 
	 * - hostname : naver.com, iei.or.kr
	 * 
	 * 모든 메소드가 static!
	 */
	public void test1() {
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress());
			
			InetAddress[] arr = InetAddress.getAllByName("naver.com");
			System.out.println(arr.length);
			for(InetAddress ip : arr)
				System.out.println(ip.getHostAddress());
			
			//내컴퓨터의 ip주소
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost.getHostAddress());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}








