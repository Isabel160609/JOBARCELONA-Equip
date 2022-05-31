package com.init.Jobarcelona.entity;

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
@Table(name="continent")

public class Continent {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Id
    private Long id;
    @Column(name = "goal_continent")
    private int goal_continent;
    @Column(name = "assist_continent")
    private int assist_continent;
    @Column(name = "own_goal_continent")
    private int own_goal_continent;
    @Column(name = "yellow_card_continent")
    private int yellow_card_continent;
    @Column(name = "second_yellow_card_continent")
    private int second_yellow_card_continent;
    @Column(name = "red_card_continent")
    private int red_card_continent;


}
