package com.pedro.chekout.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pedro.chekout.model.Produto;

@Controller
public class ProdutosController {
	
	@RequestMapping("/produto/novo")
	public String novo() {
		return "Produtos/CadastroProduto";
	}

	@RequestMapping(value = "/produto/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Produto produto, BindingResult result) {
		
		if (result.hasErrors()) {
			
			System.out.println("ERRO");
		}

			System.out.println(">>> id: " + produto.getId());
		return "cerveja/CadastroProduto";
	}
	
}
