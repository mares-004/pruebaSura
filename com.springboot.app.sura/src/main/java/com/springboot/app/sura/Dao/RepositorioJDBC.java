package com.springboot.app.sura.Dao;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import javax.sql.DataSource;
@Repository
public class RepositorioJDBC {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public RepositorioJDBC(final DataSource dataSource){
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}	
	
	public void deleteParametros(Long idparam, Long idtipo, Long idmaterial){
		jdbcTemplate.update("DELETE from sura.parametros where idparam = " + idparam + " and idtipo = " + idtipo + " and idmaterial = " + idmaterial);
	}
	public Integer existeCoordenada(Long corx, Long cory) {
	    String sql = "select count(1) from sura.solicitudes where corx = " + corx + " and cory = " + cory;
	    return this.jdbcTemplate.queryForObject(sql, Integer.class);
	}

}
