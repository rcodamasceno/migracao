package pt.bkcf.bankintercard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.bkcf.bankintercard.facade.login.LoginFacade;
import pt.bkcf.bankintercard.services.vo.LoginDTO;

@RestController
public class LoginService {
	@Autowired
	private LoginFacade loginFacade;
	
	@PostMapping(consumes = "", name = "", path = "", produces = "")
	public LoginDTO login() {
		return loginFacade.login("", "");
	}
}
