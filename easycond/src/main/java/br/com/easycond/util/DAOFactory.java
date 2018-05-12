package br.com.easycond.util;

import br.com.easycond.dao.ApartamentoDAO;
import br.com.easycond.dao.AssembleiaDAO;
import br.com.easycond.dao.AvisoDAO;
import br.com.easycond.dao.BlocoDAO;
import br.com.easycond.dao.CasaDAO;
import br.com.easycond.dao.CondominoDAO;
import br.com.easycond.dao.FuncionarioDAO;
import br.com.easycond.dao.PessoaDAO;
import br.com.easycond.dao.SolicitacaoAvisoDAO;
import br.com.easycond.dao.UsuarioDAO;
import br.com.easycond.daointerf.ApartamentoDAOInterf;
import br.com.easycond.daointerf.AssembleiaDAOInterf;
import br.com.easycond.daointerf.AvisoDAOInterf;
import br.com.easycond.daointerf.BlocoDAOInterf;
import br.com.easycond.daointerf.CasaDAOInterf;
import br.com.easycond.daointerf.CondominoDAOInterf;
import br.com.easycond.daointerf.FuncionarioDAOInterf;
import br.com.easycond.daointerf.PessoaDAOInterf;
import br.com.easycond.daointerf.SolicitacaoAvisoDAOInterf;
import br.com.easycond.daointerf.UsuarioDAOInterf;

public class DAOFactory {

	public static UsuarioDAOInterf criarUsuarioDAO() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}

	public static AvisoDAOInterf criarAvisoDAO() {
		AvisoDAO avisoDAO = new AvisoDAO();
		avisoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return avisoDAO;
	}

	public static AssembleiaDAOInterf criarAssembleiaDAO() {
		AssembleiaDAO assembleiaDAO = new AssembleiaDAO();
		assembleiaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return assembleiaDAO;
	}

	public static CondominoDAOInterf criarCondominoDAO() {

		CondominoDAO condominoDAO = new CondominoDAO();
		condominoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());

		return condominoDAO;
	}

	public static FuncionarioDAOInterf criarFuncionarioDAO() {

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());

		return funcionarioDAO;
	}

	public static PessoaDAOInterf criarPessoaDAO() {

		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());

		return pessoaDAO;
	}
	
	public static SolicitacaoAvisoDAOInterf criarSolicitacaoAvisoDAO() {

		SolicitacaoAvisoDAO solicitacaoAvisoDAO = new SolicitacaoAvisoDAO();
		solicitacaoAvisoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());

		return solicitacaoAvisoDAO;
	}
	
	public static CasaDAOInterf criarCasaDAO() {

		CasaDAO casaDAO = new CasaDAO();
		casaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());

		return casaDAO;
	}
	
	public static BlocoDAOInterf criarBlocoDAO() {

		BlocoDAO blocoDAO = new BlocoDAO();
		blocoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());

		return blocoDAO;
	}
	
	public static ApartamentoDAOInterf criarApartamentoDAO() {

		ApartamentoDAO apartamentoDAO = new ApartamentoDAO();
		apartamentoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());

		return apartamentoDAO;
	}
}
