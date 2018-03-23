package com.susnilo.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class MonsterRepository {
    private static final List<Monster> monsterList = Arrays.asList(
            new Monster("Ambrozja", "/assets/images/monster_01.png", "Zawsze uśmiechnięta."),
		    new Monster("Chryzanta", "/assets/images/monster_02.png","Pazurki długie i ostre ma."),
            new Monster("Epifania", "/assets/images/monster_03.png","Introwertyczna natura."),
		    new Monster("Filadelfia", "/assets/images/monster_04.png","Uwielbia czytać książki po nocach."),
            new Monster("Metody", "/assets/images/monster_05.png","Nic on nie przeoczy!"),
		    new Monster("Narcyz", "/assets/images/monster_06.png","Niemiłosiernie długo wpatruje się we własne odbicie.")

    );
    public Monster findByMonsterName(String name){
        for(Monster monster : monsterList){
            if(monster.getName().equals(name)){
                return monster;
            }
        }
        return null;
    }
    public List<Monster> getAllMonster(){
        return monsterList;
    }
}
