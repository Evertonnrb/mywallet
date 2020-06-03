package com.mywallet.controller;

import com.mywallet.model.Despesa;
import com.mywallet.model.enuns.FormaPagamento;
import com.mywallet.model.enuns.Tipo;
import com.mywallet.repository.Despesas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/despesas")
public class DespesaController {

    @Autowired
    private Despesas despesas;

    @Autowired
    private DespesaController controller;

    @RequestMapping("/novo")
    public ModelAndView novo(){
        ModelAndView mv = new ModelAndView("cadastro-despesa");
        mv.addObject(new Despesa());
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String cadastrarDespesa(@Validated Despesa despesa, Errors errors, RedirectAttributes
                                   atrAttributes){
        if(errors.hasErrors()){
            return "/cadastro-despesa";
        }
        try {
            despesas.save(despesa);
            atrAttributes.addFlashAttribute("msg","Cadastro realizado");
        }catch (IllegalArgumentException e){
            atrAttributes.addFlashAttribute("msg",e.getMessage());
        }
        return "redirect:/despesas/novo";
    }

    @ModelAttribute(name = "tiposDisponiveis")
    public List<Tipo> tipoDespesaDisponivel(){
        return Arrays.asList(Tipo.values());
    }

    @ModelAttribute(name = "tipoFormaPagamento")
    public List<FormaPagamento> tipoFormaDePagamento(){
        return Arrays.asList(FormaPagamento.values());
    }
}
