package com.susnilo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private MonsterRepository monsterRepository;
    @RequestMapping(value = "/{name}")
    public String monsterPage(ModelMap modelMap, @PathVariable String name){
        Monster monster=monsterRepository.findByMonsterName(name);
        modelMap.put("monster",monster);
        return "monster";
    }
    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        List<Monster> allMonster = monsterRepository.getAllMonster();
        modelMap.put("monsters",allMonster);
        return "index";
    }

}
