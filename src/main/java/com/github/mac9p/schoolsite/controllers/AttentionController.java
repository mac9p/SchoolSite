package com.github.mac9p.schoolsite.controllers;

import com.github.mac9p.schoolsite.model.Attention;
import com.github.mac9p.schoolsite.services.AttentionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/attentions")
public class AttentionController {
    private final AttentionService attentionService;

    public AttentionController(AttentionService attentionService) {
        this.attentionService = attentionService;
    }

    @GetMapping("/all")
    public List<Attention> getAllAttentions(){
        return attentionService.getAllAttentions();
    }

}
