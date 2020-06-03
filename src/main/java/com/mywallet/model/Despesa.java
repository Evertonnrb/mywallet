package com.mywallet.model;

import com.mywallet.model.enuns.FormaPagamento;
import com.mywallet.model.enuns.Tipo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Despesa extends GenericId {

    @NumberFormat(pattern = "#,##0.00")
    @DecimalMin(value = "0.01")
    @DecimalMax(value = "99999.99")
    @Column(name = "valor_gasto")
    private BigDecimal valorGasto;

    @NumberFormat(pattern = "#,##0.00")
    @DecimalMin(value = "0.01")
    @DecimalMax(value = "99999.99")
    private BigDecimal imposto;

    @Column(length = 80)
    @NotEmpty(message = "Campo deve ser informado")
    @Size(max = 80, message = "Campo não deve ter mais que 80 caracteres")
    private String local;

    @Enumerated(EnumType.STRING)
    private Tipo tipoDespesa;

    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data;

}
