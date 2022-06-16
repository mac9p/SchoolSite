package com.github.mac9p.schoolsite.services;

import com.github.mac9p.schoolsite.model.Attention;
import com.github.mac9p.schoolsite.repositories.AttentionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttentionService {
    private final AttentionRepository attentionRepository;

    public AttentionService(AttentionRepository attentionRepository) {
        this.attentionRepository = attentionRepository;
    }

    public List<Attention> getAllAttentions(){
        return attentionRepository.findAll();
    }
}
