package pt.bkcf.backofficecard.facade.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pt.bkcf.backofficecard.dao.utilizador.UtilizadorVO;
import pt.bkcf.backofficecard.facade.utilizador.UtilizadorFacade;
import pt.bkcf.backofficecard.services.vo.LoginDTO;

@Component
public class LoginFacadeImpl implements LoginFacade{
	
	@Autowired
	private UtilizadorFacade utilizadorFacade;
	
	@Override
	public LoginDTO login(String userName, String password) {
		UtilizadorVO utilizadorVO = utilizadorFacade.getUtilizador(userName);
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserName("Ricardo");
		loginDTO.setPassword("teste");
		loginDTO.setToken("1234");
		return loginDTO;
	}

	public void setUtilizadorFacade(UtilizadorFacade utilizadorFacade) {
		this.utilizadorFacade = utilizadorFacade;
	}

}
