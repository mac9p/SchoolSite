package com.github.mac9p.schoolsite.services;

import com.github.mac9p.schoolsite.converters.AttentionToAttentionDto;
import com.github.mac9p.schoolsite.dtos.AttentionDto;
import com.github.mac9p.schoolsite.model.Attention;
import com.github.mac9p.schoolsite.repositories.AttentionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AttentionService {
    private final AttentionRepository attentionRepository;
    private final AttentionToAttentionDto attentionToAttentionDto;

    public AttentionService(AttentionRepository attentionRepository, AttentionToAttentionDto attentionToAttentionDto) {
        this.attentionRepository = attentionRepository;
        this.attentionToAttentionDto = attentionToAttentionDto;
    }

    public List<AttentionDto> getAllAttentions() {
        return attentionRepository.findAll().stream().
                map(attentionToAttentionDto::convert).collect(Collectors.toList());
    }
}
