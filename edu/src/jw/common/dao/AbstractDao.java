package jw.common.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jw.common.util.DBUtil;

/*
 * FileName : AbstractDao.java
 * :: ���� DAO �� ����, �Ϲ��� ������ �߻�ȭ��, ���������� �߻� DAO
 */
public class AbstractDao {

	// Field
	// Constructor
	public AbstractDao() {
	}
	
	//Method
	//==> DBUtil.getConnection() �̿� Connection return
	public Connection connect(){
		Connection con = null;
		try {
			con = DBUtil.getConnection();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		return con;
	}
	
	//==> Connection / Statement / ResultSet close()
	public void close(Connection con, PreparedStatement pStmt, ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		this.close(con,pStmt);
	}
	
	//==> Connection / Statement close()
	public void close(Connection con, PreparedStatement pStmt){
		if(pStmt != null){
			try {
				pStmt.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		if(con != null){
			try {
				con.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}// end class