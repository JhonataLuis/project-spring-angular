package br.curso.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.curso.springboot.model.Pessoa;
import br.curso.springboot.repository.EnderecoRepository;
import br.curso.springboot.repository.PessoaRepository;


@RestController
@RequestMapping(value = "/management")
public class MainController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	//MÉTODO PARA CONSULTAR UMA PESSOA POR ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa> pessoa(@PathVariable("id") Long id){
		
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		
		return new ResponseEntity<Pessoa>(pessoa.get(), HttpStatus.OK);
	}

	//MÉTODO PARA LISTAR TODAS AS PESSOAS CADASTRADAS NO SISTEMA NO BANCO DE DADOS
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<List<Pessoa>> pessoas() {
		
		List<Pessoa> list = pessoaRepository.findAll();
		
		return new ResponseEntity<List<Pessoa>>(list, HttpStatus.OK);
	}
	
	//MÉTODO PARA CADASTRAR UMA PESSOA NO SISTEMA
	@PostMapping(value = "/", produces = "application/json")
	public ResponseEntity<Pessoa> cadastrar(@RequestBody Pessoa pessoa){
		
		
		Pessoa pessoaSave = pessoaRepository.save(pessoa);
		
		return new ResponseEntity<Pessoa>(pessoaSave, HttpStatus.OK);
	}
	
	//MÉTODO PARA DELETAR UM USUÁRIO COM OS DADOS ATRELADOS A ELE
	@DeleteMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity deletar(@PathVariable("id") Long id) {
		
		pessoaRepository.deleteById(id);
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	//MÉTODO PARA ATUALIZAR OS DADOS DA PESSOA
	@PutMapping(value = "/", produces = "application/json")
	public ResponseEntity<Pessoa> updatePessoa(@RequestBody Pessoa pessoa){
		
		Pessoa pessoaUpdate = pessoaRepository.save(pessoa);
		
		return new ResponseEntity<Pessoa>(pessoaUpdate, HttpStatus.OK);
	}
	
	
}
