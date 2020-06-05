package com.mywallet.controller;

import com.mywallet.model.Receita;
import com.mywallet.model.enuns.Status;
import com.mywallet.repository.Receitas;
import com.mywallet.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@Controller
@RequestMapping("/receitas")
public class ReceitaController {

    @Autowired
    private Receitas receitas;

    @Autowired
    private ReceitaService service;

    @RequestMapping("/novo")
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView("cadastro-receitas");
        return mv;

    }

    @RequestMapping
    public ModelAndView todasReceitas(){
        List<Receita> receitaList = receitas.findAll();
        ModelAndView mv = new ModelAndView("receitas");
        mv.addObject("receitaList",receitaList);
        return mv;
    }

    @ModelAttribute(name = "statusReceita")
    public List<Status> getStatus() {
//        return asList(Status.values());
        return Arrays.asList(Status.values());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView salvar(Receita receita) {
        ModelAndView mv = new ModelAndView("cadastro-receitas");
        service.cadastrarReceita(receita);
        mv.addObject("mensagem", "Receita cadastrado");
        return mv;
    }
}

