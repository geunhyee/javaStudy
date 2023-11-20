package ch14_jdbc;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUpdate {
   
   public static void main(String[] args)  {
	   //db와 연결
      Connection connection = null;
      //sql 명령
      PreparedStatement ps = null;
      //쿼리실행 결과
      ResultSet rs = null;
      // 1. 드라이버 로딩
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("드라이버 등록 성공");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
         System.out.println("등록 실패");
         System.exit(0); // 프로그램 종료
      }
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
      String db_id = "java";
      String db_pw = "oracle";
      try {
         connection = DriverManager.getConnection(url, db_id, db_pw);
         System.out.println("커넥션 성공");
         
         StringBuffer query = new StringBuffer();
          query.append(" UPDATE tb_user");	
          query.append(" SET user_nm=?");	
          query.append(" WHERE user_id=?");	
    
//         query.append("SELECT user_id");
//         query.append("		 ,user_pw");
//         query.append("		 ,user_nm");
//         query.append("		 ,user_mail");
//         query.append("		 ,user_mileage");
//         query.append(" FROM tb_user");
         ps = connection.prepareStatement(query.toString());
         int idx = 1;
         ps.setString(idx++, "팽하"); 		//여기 순서대로 입력된게 위에 values 물음표에 순서대로 맵핑됨
         ps.setString(idx++, "lee001");
         int cnt = ps.executeUpdate(); //쿼리문 실행 cnt <-- insert 건수리턴
         if(cnt >0) {
        	 System.out.println(cnt+ "업데이트 되었습니다.");
         }
//         rs = ps.executeQuery(); //쿼리문 실행
//         while(rs.next()) {
//        	 String userId = rs.getString("user_id");
//        	 String userNm = rs.getString("user_nm");
//        	 int userMileage = rs.getInt("user_mileage");
//        	 System.out.println("아이디:"+userId+",이름:" + userNm
//        			 			+ ",마일리지:"+ userMileage);
//        	 
//        	 System.out.println(rs.getString("user_nm"));
//         }
         
         
      } catch (SQLException e) {
         e.printStackTrace();
        System.out.println("커넥션 오류 계정정보를 확인하세요");
         
      }finally {
    	  if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
    	  if(ps != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
    	  if(connection != null) {try {connection.close();} catch (SQLException e) {e.printStackTrace();}}
      }
      
   }
}