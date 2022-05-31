package com.init.Jobarcelona.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto {
	
	private int reference;
    private int age;
    private String nation;
    private String league;
    private String team;
    private int goalsSelection;
    private int SelectionsNation;
    private String position;
    private int price;
    private Champ champ;
    private Cup cup;
    private Continent continent;
    
}
