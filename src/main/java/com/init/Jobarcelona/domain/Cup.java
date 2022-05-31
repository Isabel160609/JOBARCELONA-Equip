package com.init.Jobarcelona.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cup")
public class Cup {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Id
    private Long id;
    @Column(name= "goal_cup")
    private int goal_cup;
    @Column(name= "assist_cup")
    private int assist_cup;
    @Column(name= "own_goal_cup")
    private int own_goal_cup;
    @Column(name= "yellow_card_cup")
    private int yellow_card_cup;
    @Column(name= "second_yellow_card")
    private int second_yellow_card;
    @Column(name= "red_card_cup")
    private int red_card_cup;
}
