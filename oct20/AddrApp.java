package oct20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddrApp {

	public static void main(String[] args) {
		
		// ==================== JDBC 관련 변수 ======================= 
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mariadb://127.0.0.1:3307/1019chunjae";
		String user = "root";
		String pass = "12345";
		// ==========================================================
		
		try {
			// 1. 드라이버 세팅
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. Connection 획득
			conn = DriverManager.getConnection(url, user, pass);
			
		} catch(Exception e) {
			System.out.println("DB 작업중 문제 발생");
			System.out.println(e.getMessage());
			
		}
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			String cmd = scan.nextLine();
			
			if(cmd.equals("exit")) {
				break;
				
			} else if(cmd.equals("add")) {
				System.out.println("========= 주소록 등록 =========");
				System.out.print("이름 : ");
				String name = scan.nextLine();
				System.out.print("주소 : ");
				String address = scan.nextLine();
				System.out.print("전화번호 : ");
				String phone = scan.nextLine();
				
				// DB 작업
				//====================================================
				//3. Statement 생성
				try {
					stmt = conn.createStatement();
					
					//4. SQL 처리  
					String sql = "INSERT INTO t_address\r\n"
							+ "SET `name` = '" + name + "',\r\n"
							+ "address = '" + address + "',\r\n"
							+ "phone = '" + phone + "'";
					
					// 조회결과가 없는 경우에는 ResultSet으로 받아올게 없기 때문에 
					// sql만 반영해주는 executeUpdate(sql) 사용
					stmt.executeUpdate(sql);
					
				} catch(Exception e) {
					System.out.println("ADD DB작업중 문제 발생!!");
					
				}
				//====================================================
				
				System.out.println("주소록 등록 완료.");
				System.out.println("============================");
				
			} else if(cmd.equals("list")) {
				System.out.println("list 기능 구현");
				
			} else if(cmd.equals("update")) {
				System.out.println("update 기능 구현");
				
			} else if(cmd.equals("delete")) {
				System.out.println("delete 기능 구현");
			}
		}	
	}
}
