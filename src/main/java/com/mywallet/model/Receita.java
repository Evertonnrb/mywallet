package com.mywallet.model;

import com.mywallet.model.enuns.Status;
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
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Receita extends GenericId {

    @Column(length = 200)
    @NotEmpty(message = "Descrição é requerida")
    @NotNull(message = "Descrição é requerida")
    private String descricao;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data;

    @DecimalMin(value = "0.01")
    @DecimalMax(value = "99999.99")
    @NumberFormat(pattern = "#,##0.00")
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private Status status;
}
