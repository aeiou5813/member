package com.example.spring03.service.member;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring03.dao.member.MemberDAOImpl;
import com.example.spring03.dto.member.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	MemberDAOImpl memberDao;
	
	//01.회원목록
	@Override
	public List<MemberVO> memberList() {
		System.out.println("MemberServiceImpl/memberList()...");
		return memberDao.memberList();
	}
	
	//02.회원등록
	@Override
	public void insertMember(MemberVO vo) {
		System.out.println("MemberServiceImpl/insertMember()...");
		memberDao.insertMember(vo);
		
	}

	@Override
	public MemberVO viewMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

}
