package com.github.mac9p.schoolsite.converters;

import com.github.mac9p.schoolsite.dtos.GradeDto;
import com.github.mac9p.schoolsite.model.Grade;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GradeToGradeDto implements Converter<Grade, GradeDto> {
    @Override
    public GradeDto convert(Grade source) {
        return new GradeDto(source.getId(),
                source.getGrade(),
                source.getStudent().getFirstName()+" "+source.getStudent().getLastName(),
                source.getDate(),
                source.getSubject().getName());
    }
}
