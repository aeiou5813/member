package com.example.spring03.dao.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.spring03.dto.member.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	SqlSession sqlsession;

	@Override
	public List<MemberVO> memberList() {
		System.out.println("MemberDAOImpl/memberList()...");
		return sqlsession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberVO vo) {
		System.out.println("MemberDAOImpl/insertMember()...");
		sqlsession.insert("member.insertMember", vo);
		// vo ==> #{userId}, #{userPw}, #{userName}, #{userEmail}

	}

	@Override
	public MemberVO viewMember(String userId) {
		System.out.println("MemberDAOImpl/viewMember()...");
		return sqlsession.selectOne("member.viewMember", userId);
	}

	@Override
	public void deleteMember(String userId) {
		System.out.println("MemberDAOImpl/deleteMember()...");
		sqlsession.delete("member.deleteMember", userId);
	}

	@Override
	public void updateMember(MemberVO vo) {
		System.out.println("MemberDAOImpl/updateMember()...");
		sqlsession.update("member.updateMember", vo);

	}

	@Override
	public boolean checkPw(String userId, String userPw) {
		System.out.println("MemberDAOImpl/checkPw()...");

		boolean result = false;
		Map<String, String> map = new HashMap<String, String>();
		map.put("userId", userId);
		map.put("userPw", userPw);
		int count = sqlsession.selectOne("member.checkPw", map);
		if (count == 1) {
			result = true;
		}

		return result;

	}

}
