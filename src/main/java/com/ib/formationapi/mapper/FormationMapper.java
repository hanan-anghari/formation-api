package com.ib.formationapi.mapper;

import com.ib.formationapi.dto.FormationDto;
import com.ib.formationapi.entity.Formation;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface FormationMapper {
    Formation dtoToEntity(FormationDto formationDto);
    FormationDto entityToDto(Formation formation);
}
