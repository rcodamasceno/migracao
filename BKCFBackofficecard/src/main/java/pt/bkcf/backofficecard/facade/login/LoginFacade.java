package pt.bkcf.backofficecard.facade.login;

import pt.bkcf.backofficecard.services.vo.LoginDTO;

public interface LoginFacade {
	public LoginDTO login(String userName, String password);
}
