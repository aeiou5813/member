package com.example.spring03.controller.member;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.spring03.dto.member.MemberVO;
import com.example.spring03.service.member.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {

	@Inject
	MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	// 01 회원목록
	// url pattern mapping
	@RequestMapping(value = "member/list.do", method = RequestMethod.GET)
	public String memberList(Model model) {
		logger.info("controller.member.memberlist");
		List<MemberVO> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/member_list";
	}

	// 02_01 회원등록 페이지로 이동
	@RequestMapping(value = "member/write.do", method = RequestMethod.GET)
	public String memberWrite() {
		logger.info("controller.member.memberWrite");

		return "member/member_write";
	}

	// 02_02 회원등록 처리후 ==> 회원목록으로 리다이렉트
	// @ModelAttribute에 폼에서 입력한 데이턴가 저장된다.
	@RequestMapping(value = "member/insert.do", method = RequestMethod.POST)
	public String memberInsert(@ModelAttribute MemberVO vo) {
		logger.info("controller.member.memberInsert");
		memberService.insertMember(vo);
		return "redirect:/member/list.do";
	}

	// 03 회원 상세정보 조회
	@RequestMapping(value = "member/view.do", method = RequestMethod.GET)
	public String memberView(String userId, Model model) {
		logger.info("controller.member.memberView");
		// 회원정보를 모델에 저장
		model.addAttribute("dto", memberService.viewMember(userId));

		logger.info("클릭한 아이디: " + userId);

		return "member/member_view";
	}

	// 04 회원정보 수정 처리
	@RequestMapping(value = "member/update.do", method = RequestMethod.POST)
	public String memberUpdate(@ModelAttribute MemberVO vo) {
		logger.info("controller.member.memberUpdate");

		memberService.updateMember(vo);

		return "redirect:/member/list.do";
	}

}
