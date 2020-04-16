package pt.bkcf.bankintercard.facade.login;

import pt.bkcf.bankintercard.services.vo.LoginDTO;

public interface LoginFacade {
	public LoginDTO login(String userName, String password);
}
