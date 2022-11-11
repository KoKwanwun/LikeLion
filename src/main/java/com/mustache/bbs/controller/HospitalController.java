package com.mustache.bbs.controller;

import com.mustache.bbs.domain.Article;
import com.mustache.bbs.domain.Hospital;
import com.mustache.bbs.repository.HospitalRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hospitals")
public class HospitalController {

    public final HospitalRepository hospitalRepository;

    public HospitalController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @GetMapping("")
    public String hospitalList(Model model){
        List<Hospital> hospitals = hospitalRepository.findAll();
        model.addAttribute("hospitals", hospitals);
        return "/hospitals/list";
    }
}
