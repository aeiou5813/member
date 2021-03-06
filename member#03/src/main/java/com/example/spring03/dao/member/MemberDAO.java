package com.example.spring03.dao.member;

import java.util.List;

import com.example.spring03.dto.member.MemberVO;

public interface MemberDAO {

	//회원목록
	public List<MemberVO> memberList();
	
	//회원입력
	public void insertMember(MemberVO vo);
	
	//회원정보 상세보기
	public MemberVO viewMember(String userId);
	
	//회원삭제
	public void deleteMember(String userId);
	
	//회원정보 수정
	public void updateMember(MemberVO vo);
	
}
