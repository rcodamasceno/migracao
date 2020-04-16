package pt.bkcf.backofficecard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.bkcf.backofficecard.facade.login.LoginFacade;
import pt.bkcf.backofficecard.services.vo.LoginDTO;

@RestController
public class LoginService {
	@Autowired
	private LoginFacade loginFacade;
	
	@PostMapping(consumes = "", name = "", path = "", produces = "")
	public LoginDTO login() {
		return loginFacade.login("", "");
	}

	public void setLoginFacade(LoginFacade loginFacade) {
		this.loginFacade = loginFacade;
	}
}
