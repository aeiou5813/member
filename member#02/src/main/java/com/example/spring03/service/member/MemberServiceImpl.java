package com.example.spring03.service.member;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring03.dao.member.MemberDAOImpl;
import com.example.spring03.dto.member.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAOImpl memberDao;

	// 01.회원목록
	@Override
	public List<MemberVO> memberList() {
		System.out.println("MemberServiceImpl/memberList()...");
		return memberDao.memberList();
	}

	// 02.회원등록
	@Override
	public void insertMember(MemberVO vo) {
		System.out.println("MemberServiceImpl/insertMember()...");
		memberDao.insertMember(vo);

	}

	// 03.회원 정보 상세 조회
	@Override
	public MemberVO viewMember(String userId) {
		System.out.println("MemberServiceImpl/viewMember()...");
		return memberDao.viewMember(userId);
	}

	// 05.회원 정보 삭제 처리
	@Override
	public void deleteMember(String userId) {
		System.out.println("MemberServiceImpl/deleteMember()...");
		memberDao.deleteMember(userId);
	}

	// 04.회원 정보 수정 처리
	@Override
	public void updateMember(MemberVO vo) {
		System.out.println("MemberServiceImpl/updateMember()...");
		memberDao.updateMember(vo);

	}

	// 06.회원정보 수정 및 삭제를 위한 비밀버호 체크
	@Override
	public boolean checkPw(String userId, String userPw) {
		System.out.println("MemberServiceImpl/checkPw()...");
		return memberDao.checkPw(userId, userPw);
	}

}
