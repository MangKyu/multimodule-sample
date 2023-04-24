package com.mangkyu.appstore.admin.apps.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewAppController {

	@GetMapping("/apps")
	public String appListView() {
		return "app/apps";
	}

}
