package com.mywallet;

import com.mywallet.model.Despesa;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MywalletApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testeHasImposto(){
        Despesa despesa = new Despesa();
        System.out.println(despesa.hasImposto());
    }

}
