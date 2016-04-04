package jw.service.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jw.common.dao.AbstractDao;
import jw.service.user.vo.UserVO;

/*
 * FileName : UserDao.java
 *  ::AbstractDao ���� ȸ������ Service ��� DAO
 */
public class UserDao  extends AbstractDao{

	//Field
	
	//constructor
	public UserDao(){
	}
	
	//method
	public void getUser(UserVO userVO){
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {
			//1�ܰ� connection
			con = this.connect();
			
			//2�ܰ� statement
			pStmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id = ? AND pwd = ?" );
			pStmt.setString(1, userVO.getId());
			pStmt.setString(2, userVO.getPwd());
				
			//3�ܰ� resultset
			rs = pStmt.executeQuery();			
			if(rs.next()){
				System.out.println("1. db���� Ȯ�� �� id, pwd==>:"+userVO.getId()+" : "+userVO.getPwd());
				userVO.setActive(true);
			}else{
				System.out.println("dbdp <"+userVO.getId()+">�� �ش��ϴ� �ڷᰡ �����ϴ�. ");
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			this.close(con,pStmt,rs);
		}
	}//end of getUser()
		
	public boolean addUser(UserVO userVO){
		Connection con = null;
		PreparedStatement pStmt = null;
		boolean insertResult = false;
		try {
			//1�ܰ� connection
			con = this.connect();
			
			//2�ܰ� statement
			pStmt = con.prepareStatement("INSERT "  +
										"INTO users ( no, id, pwd) " +
										" VALUES(?,?,?,?)" );
			pStmt.setInt(1, userVO.getNo());
			pStmt.setString(2, userVO.getId());
			pStmt.setString(3, userVO.getPwd());
			
			//3�ܰ� ����� Ȯ���ϱ�
			if ( 1 == pStmt.executeUpdate()) {
				insertResult = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			this.close(con,pStmt);
		}
		return insertResult;
	}// end of addUser()
	
	public List<UserVO> getUserList(){
		
		ArrayList<UserVO> arrayList = new ArrayList<UserVO>();
		
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try{
			//1�ܰ� connection
			con = this.connect();
			
			//2�ܰ� statement
			pStmt = con.prepareStatement("SELECT no, id, pwd FROM users ORDER BY no" );
				
			//3�ܰ� resultset ���ó��
			rs = pStmt.executeQuery();
			
			//==> :: select ������ ȸ������ UserVO�� Binding
			//==> :: ������ ȸ�������� ���� UserVO�� ArrayList�� ����
			while (rs.next()) {
				UserVO userVO = new UserVO();
				userVO.setNo(rs.getInt("no"));
				userVO.setPwd(rs.getString("pwd"));
				userVO.setId(rs.getString("id"));
				
				//==> userVO ����Ȯ�� :: console
				System.out.println(userVO);
		
				//==> arrayList�� UserVO �ν��Ͻ� add
				arrayList.add(userVO);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			this.close(con,pStmt,rs);
		}
		return arrayList;
	}//end of getUSerList()
	
}