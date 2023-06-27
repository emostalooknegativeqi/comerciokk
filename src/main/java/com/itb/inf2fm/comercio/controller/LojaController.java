package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto p1 = new Produto();
		p1.setId (20l);
		p1.setNome("Fogão 4 bocas boate kiss");
		p1.setCodigobarras("4I1M3UC000KKK");
		p1.setDescricao("Esquenta mais que a boate kiss kk");
		p1.setPreco(3215.89);
		p1.setCodStatus(false);
		
		Produto p2 = new Produto();
		p2.setId (21l);
		p2.setNome("Televisão 70 Polegadas");
		p2.setCodigobarras("4D4LVAT4MAM4D");
		p2.setDescricao("Televisor 70 Polegadas Tela Plana LED Samsung");
		p2.setPreco(6326.12);
		p2.setCodStatus(true);
		
		Produto p3 = new Produto();
		p3.setId (22l);
		p3.setNome("paçoca de amendoim com amendoim e pedaços de amendoim sabor paçoca");
		p3.setCodigobarras("D0U48UND4IMAT");
		p3.setDescricao("mhmhmhpaçoquinhamhmhmhm");
		p3.setPreco(63265.62);
		p3.setCodStatus(true);
		
		Produto p4 = new Produto();
		p4.setId (23l);
		p4.setNome("Sofa lamerd");
		p4.setCodigobarras("MONARK");
		p4.setDescricao("por que não da pra conversar com um sofá?");
		p4.setPreco(3215.89);
		p4.setCodStatus(false);
		
		
		
		// Adicionando os produtos à lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		listaDeProdutos.add(p4);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		
		return "produtos";
	}
}