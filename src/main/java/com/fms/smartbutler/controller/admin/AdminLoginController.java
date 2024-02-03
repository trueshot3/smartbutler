package com.fms.smartbutler.controller.admin;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fms.smartbutler.service.AdminService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminLoginController {
	
	private final ModelMapper modelMapper;
	private final AdminService adminService;
	
	// 관리자 로그인 폼
	@GetMapping("/login")
	public String getlogin() {
		return "admin/login/login";
	}
	
	// 관리자 로그인
//	@PostMapping("/login")
//	public String login() {
//		return "redirect:/";
//	}
	
//	@GetMapping("/logout")
//	public String logout() {
//		return "admin/login/login";
//	}
	
//	@PostMapping("/join/{role}")
//	public String createMember(@ModelAttribute AdminDTO adminDTO, Model model) {
//		// DTO to Entity
//		Admin entity = modelMapper.map(adminDTO, Admin.class);
//		
//		// save
//		//Member savedEntity = memberRepository.save(entity);
//		Admin savedEntity = adminService.joinMember(entity);
//		
//		// Entity to DTO
//		AdminDTO savedDTO = modelMapper.map(savedEntity, AdminDTO.class);
//		
//		model.addAttribute("admin", savedDTO);
//		
//		return "admin/login/join-success";	// join/success
//	}
	
}
