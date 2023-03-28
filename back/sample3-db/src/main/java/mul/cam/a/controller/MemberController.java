package mul.cam.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mul.cam.a.dto.MemberDto;
import mul.cam.a.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService service;
	
	@GetMapping(value = "/allList")
	public List<MemberDto> allList(){
		System.out.println("MemberController allList " + new Date());
		
		return service.allMember();		
	}
}




