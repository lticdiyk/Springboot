package mul.cam.a.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import mul.cam.a.dto.MemberDto;
import mul.cam.a.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService service;
	
	@PostMapping(value = "/idcheck")
	public String idcheck(String id) {
		System.out.println("MemberController idcheck " + new Date());
		
		boolean b = service.idcheck(id);
		if(b == true) {
			return "NO";
		}		
		return "YES";
	}
	
	@PostMapping(value = "/addmember")
	public String addmember(MemberDto dto) {
		System.out.println("MemberController addmember " + new Date());
		
		boolean b = service.addmember(dto);
		if(b == false) {
			return "NO";
		}
		return "YES";
	}
	
	@PostMapping(value = "/login")
	public MemberDto login(MemberDto dto) {
		System.out.println("MemberController login " + new Date());
		
		MemberDto mem = service.login(dto);		
		return mem;
	}
	
	
}





