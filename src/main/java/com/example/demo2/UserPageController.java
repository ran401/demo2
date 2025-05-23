package com.example.demo2;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserPageController {
	@PreAuthorize("hasRole('ROLE_USER')") // 追記 ROLE_USERのユーザのみアクセスを許可
	@GetMapping("/userPage")
	public String userPage() {
		return "userPage";
	}
}
