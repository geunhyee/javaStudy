package ch14_jdbc.ch14_jdbc_conn.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import ch14_jdbc.ch14_jdbc_conn.BbsVO;
import ch14_jdbc.ch14_jdbc_conn.Model.UserVO;

public class UserDao {
	private static UserDao instance = new UserDao();
	public static UserDao getInstance() {
		return instance;
	}
	
	public UserVO loginUser(Connection conn, String id) throws SQLException {
		UserVO userVo = new UserVO();
		StringBuffer query = new StringBuffer();
		query.append("SELECT user_id");
		query.append("		,user_nm");
		query.append("		,user_pw");
		query.append("		,user_mileage");
		query.append(" FROM tb_user");
		query.append(" WHERE user_id = ?");
		PreparedStatement ps=
				conn.prepareStatement(query.toString());
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			userVo.setUserId(rs.getString("user_id"));
			userVo.setUserId(rs.getString("user_pw"));
			userVo.setUserId(rs.getString("user_nm"));
			userVo.setUserId(rs.getString("user_mileage"));
		}
		if(ps != null)ps.close();
		if(rs != null)rs.close();
		return new UserVO();
	}
	//회원가입(INSERT)
	  public int insertUser(Connection conn, UserVO user) throws SQLException {
	      StringBuffer query = new StringBuffer();
	      query.append(" INSERT INTO tb_user (user_id, user_nm, user_pw, create_dt)");
	      query.append(" VALUES (?, ?, ?, SYSDATE)");      
	      PreparedStatement ps = conn.prepareStatement(query.toString());
	      int idx = 1;
	      ps.setString(idx++, user.getUserId());
	      ps.setString(idx++, user.getUserNm());
	      ps.setString(idx++, user.getUserPw());      
	      int cnt = ps.executeUpdate();
	      if (ps != null)ps.close();      
	      return cnt;

	}
	  //전체 게시글 목록 조회
	  public ArrayList<BbsVO> bbsList(Connection conn) throws SQLException{
			ArrayList<BbsVO> bbsList= new ArrayList<BbsVO>();
			StringBuffer query  =new StringBuffer();
			query.append("SELECT  ROWNUM as rnum");
			query.append("       , COUNT(*) OVER() as all_cnt");
			query.append("       , a.bbs_no        as bbs_no ");
			query.append("       , a.bbs_title     as bbs_title ");
			query.append("       , a.author_id     as author_id ");
			query.append("       , a.update_dt     as update_dt ");
			query.append("FROM(   SELECT bbs_no, bbs_title, author_id  ");
			query.append("             , TO_CHAR(update_dt,'YYMMDD HH24:MI:SS') as update_dt");
			query.append("        FROM bbs");
			query.append("        WHERE parent_no IS NULL");
			query.append("        ORDER BY update_dt DESC");
			query.append("     ) a ");
			PreparedStatement ps =
					conn.prepareStatement(query.toString());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				BbsVO temp = new BbsVO();
				temp.setRnum(rs.getInt("rnum"));
				temp.setBbsNo(rs.getInt("bbs_no"));
				temp.setBbsTitle(rs.getString("bbs_title"));
				temp.setAuthorId(rs.getString("author_id"));
				temp.setUpdateDt(rs.getString("update_dt"));
				bbsList.add(temp);
			}
			return bbsList;
	  }
}
