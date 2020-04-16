package pt.bkcf.backofficecard.facade.utilizador;

import pt.bkcf.backofficecard.dao.utilizador.UtilizadorVO;

public interface UtilizadorFacade {
	public UtilizadorVO getUtilizador(String userName);
}
