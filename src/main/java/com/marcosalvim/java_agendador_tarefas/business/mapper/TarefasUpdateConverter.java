package com.marcosalvim.java_agendador_tarefas.business.mapper;

import com.marcosalvim.java_agendador_tarefas.business.dto.TarefasDTO;
import com.marcosalvim.java_agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefasUpdateConverter {

    void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}

