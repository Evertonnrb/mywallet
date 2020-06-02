package com.mywallet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class GenericId {

    @Getter @Setter
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

}
