package org.openwes.wes.config.domain.transfer;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValueMappingStrategy.RETURN_NULL;

import org.openwes.wes.api.config.dto.BatchAttributeConfigDTO;
import org.openwes.wes.config.domain.entity.BatchAttributeConfig;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        nullValueCheckStrategy = ALWAYS,
        nullValueMappingStrategy = RETURN_NULL,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BatchAttributeConfigTransfer {

    BatchAttributeConfig toDO(BatchAttributeConfigDTO batchAttributeConfigDTO);

    BatchAttributeConfigDTO toDTO(BatchAttributeConfig batchAttributeConfig);

}
