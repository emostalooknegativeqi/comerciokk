package com.itb.inf2fm.comercio.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.itb.inf2fm.comercio.model.Produto;
@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Maquina de lavar Brastemp 15 1");
		p1.setCodigobarras("4D41V4T4M2M2N0OKK");
		p1.setDescricao("Produto linha branca com painel");
		p1.setPreco(3215.89);
		
		Produto p2 = new Produto();
		p2.setId(20l);
		p2.setNome("Fogão 4 bocas eletrolux");
		p2.setCodigobarras("411M3UC00KK");
		p2.setDescricao("esquenta mais que a boate kiss");
		p2.setPreco(3999.99);
		
		Produto p3 = new Produto();
		p3.setId(20l);
		p3.setNome("Computador Pichau Gmaer LED RGB ULTRA PRO kk");
		p3.setCodigobarras("2500HOMENSDIFERENTES");
		p3.setDescricao("roda pou a 15fps");
		p3.setPreco(5999.99);
		
		//add os produtos a lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		
		model.addAttribute("listaDeProdutos",listaDeProdutos);
		
		return "produtos.html"; 
		
	}
}
