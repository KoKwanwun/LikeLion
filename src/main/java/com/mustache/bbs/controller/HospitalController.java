package com.mustache.bbs.controller;

import com.mustache.bbs.domain.Hospital;
import com.mustache.bbs.repository.HospitalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/hospitals")
@Slf4j
public class HospitalController {

    private final HospitalRepository hospitalRepository;

    public HospitalController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @GetMapping("")
    public String hospitalList(@RequestParam(required = false) String keyword, Model model, Pageable pageable){
        log.info("keyword:{}", keyword);
        Page<Hospital> hospitals;
        if(keyword != null){
            hospitals = hospitalRepository.findByRoadNameAddressContaining(keyword, pageable);
        } else{
            hospitals = hospitalRepository.findAll(pageable);
        }
        model.addAttribute("hospitals", hospitals);
        model.addAttribute("previous", pageable.previousOrFirst().getPageNumber());
        model.addAttribute("next", pageable.next().getPageNumber());
        model.addAttribute("keyword", keyword);
        return "hospitals/list";
    }
}
