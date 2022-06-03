package br.curso.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.curso.springboot.model.ParceCadEmpresa;

@Repository
@Transactional
public interface EmpresaRepository extends JpaRepository<ParceCadEmpresa, Long>{

}
