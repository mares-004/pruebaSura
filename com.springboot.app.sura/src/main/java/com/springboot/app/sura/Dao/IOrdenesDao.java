package com.springboot.app.sura.Dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.sura.entity.Ordenes;

public interface IOrdenesDao extends CrudRepository<Ordenes, Long> {

}
