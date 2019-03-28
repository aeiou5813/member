package com.example.spring03.dao.member;

import java.util.List;

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
		sqlsession.insert("member.insertMember", vo);
		//vo ==> #{userId}, #{userPw}, #{userName}, #{userEmail}

	}

	@Override
	public MemberVO viewMember(String userId) {
		
		return sqlsession.selectOne("member.viewMember", userId);
	}

	@Override
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(MemberVO vo) {
		
		sqlsession.update("member.updateMember", vo);

	}

}
