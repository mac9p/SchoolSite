package com.github.mac9p.schoolsite.converters;

import com.github.mac9p.schoolsite.dtos.AttentionDto;
import com.github.mac9p.schoolsite.model.Attention;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AttentionToAttentionDto implements Converter<Attention, AttentionDto> {
    @Override
    public AttentionDto convert(Attention source) {
        return new AttentionDto(source.getId(),
                source.getDate(),
                source.getStudent().getFirstName() + " " + source.getStudent().getLastName(),
                source.getTeacher().getFirstName() + " " + source.getTeacher().getLastName(),
                source.getDescription(),
                source.getPoints());
    }
}
