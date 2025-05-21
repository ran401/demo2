package com.example.demo2;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {
	@PreAuthorize("hasRole('ROLE_ADMIN')") // 追記 ROLE_ADMINのユーザのみアクセスを許可
	@GetMapping("/adminPage")
	public String adminPage() {
		return "adminPage";
	}
	
}
