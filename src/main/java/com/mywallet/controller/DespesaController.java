package com.mywallet.controller;

import com.mywallet.model.Despesa;
import com.mywallet.repository.Despesas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/despesas")
public class DespesaController {

    @Autowired
    private Despesas despesas;

    @Autowired
    private DespesaController controller;

    @RequestMapping("novo")
    public ModelAndView novo(Despesa despesa){
        ModelAndView mv = new ModelAndView("cadastro-despesa");
        return mv;
    }
}
