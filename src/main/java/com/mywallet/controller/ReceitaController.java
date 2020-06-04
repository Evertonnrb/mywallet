package com.mywallet.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/receitas")
public class ReceitaController {

    @RequestMapping("/")
    public String nova(){
        return  "";
    }
}
