package pt.bkcf.bankintercard.facade.login;

import org.springframework.beans.factory.annotation.Autowired;

import pt.bkcf.bankintercard.dao.utilizador.UtilizadorVO;
import pt.bkcf.bankintercard.facade.utilizador.UtilizadorFacade;
import pt.bkcf.bankintercard.services.vo.LoginDTO;

public class LoginFacadeImpl implements LoginFacade{
	
	@Autowired
	private UtilizadorFacade utilizadorFacade;
	
	@Override
	public LoginDTO login(String userName, String password) {
		UtilizadorVO utilizadorVO = utilizadorFacade.getUtilizador(userName);
		return new LoginDTO();
	}

}
