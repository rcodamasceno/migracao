package pt.bkcf.bankintercard.facade.utilizador;

import pt.bkcf.bankintercard.dao.utilizador.UtilizadorVO;

public interface UtilizadorFacade {
	public UtilizadorVO getUtilizador(String userName);
}
