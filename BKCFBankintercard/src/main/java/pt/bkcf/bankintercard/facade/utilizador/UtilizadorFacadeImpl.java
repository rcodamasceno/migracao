package pt.bkcf.bankintercard.facade.utilizador;

import org.springframework.beans.factory.annotation.Autowired;

import pt.bkcf.bankintercard.dao.utilizador.UtilizadorDao;
import pt.bkcf.bankintercard.dao.utilizador.UtilizadorVO;

public class UtilizadorFacadeImpl implements UtilizadorFacade{

	@Autowired
	private UtilizadorDao utilizadorDao;
	
	@Override
	public UtilizadorVO getUtilizador(String userName) {
		return utilizadorDao.getUtilizador(userName);
	}

}
