package pt.bkcf.backofficecard.facade.utilizador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pt.bkcf.backofficecard.dao.utilizador.UtilizadorDao;
import pt.bkcf.backofficecard.dao.utilizador.UtilizadorVO;

@Component
public class UtilizadorFacadeImpl implements UtilizadorFacade{

	@Autowired
	private UtilizadorDao utilizadorDao;
	
	@Override
	public UtilizadorVO getUtilizador(String userName) {
		return utilizadorDao.getUtilizador(userName);
	}

	public void setUtilizadorDao(UtilizadorDao utilizadorDao) {
		this.utilizadorDao = utilizadorDao;
	}

}
