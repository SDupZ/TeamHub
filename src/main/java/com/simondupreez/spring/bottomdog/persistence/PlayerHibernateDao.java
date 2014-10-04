package com.simondupreez.spring.bottomdog.persistence;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.simondupreez.spring.bottomdog.domain.Player;

@Repository("playerDao")
@Transactional
public class PlayerHibernateDao implements PlayerDao{

	private static Logger _logger = LoggerFactory.getLogger(PlayerHibernateDao.class);
	private SessionFactory _sessionFactory;	
	
	public SessionFactory getSessionFactory() {
		return _sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this._sessionFactory = sessionFactory;
		_logger.debug("SessionFactory class: " + sessionFactory.getClass().getName());
	}
	
	//-------------------------------Interface Methods----------------------------------
	//----------------------------------------------------------------------------------
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<Player> findAll() {
		return _sessionFactory.getCurrentSession().createQuery("from Player p").list();
	}

	@Override
	public Player findByPlayerCode(String playerCode) {
		return (Player) _sessionFactory.getCurrentSession().
				getNamedQuery("Player.findByPlayerCode").setParameter("playerCodeParam", playerCode)
				.uniqueResult();
	}
	
	@Override
	public Player insert(Player player) {
		_sessionFactory.getCurrentSession().save(player);
		_logger.info("Player inserted: " + player);
		return player;
	}
	
	@Override
	public Player update(Player player) {
		_sessionFactory.getCurrentSession().update(player);
		_logger.info("Player updated: " + player);
		return player;
	}

	@Override
	public void delete(Player player) {
		_sessionFactory.getCurrentSession().delete(player);
		_logger.info("Player deleted: " + player);	
	}
	
	public String toString(){
		return _sessionFactory.toString();
	}
	
}
