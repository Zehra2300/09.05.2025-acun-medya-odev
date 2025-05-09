package com.acunmedyaJfsr1.BootCampProjects1.service.mappers;

import com.acunmedyaJfsr1.BootCampProjects1.entity.Blacklist;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateBlacklistRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.UpdateBlacklistRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetBlacklistResponse;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.GetAllBlacklistResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BlacklistMapper {

    @Mapping(target = "reason", source = "reason")
    @Mapping(target = "date", source = "date")
    @Mapping(target = "applicantId", source = "applicantId")
    Blacklist createBlacklistRequestToBlacklist(CreateBlacklistRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "reason", source = "reason")
    @Mapping(target = "date", source = "date")
    @Mapping(target = "applicantId", source = "applicantId")
    Blacklist updateBlacklistRequestToBlacklist(UpdateBlacklistRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "reason", source = "reason")
    @Mapping(target = "date", source = "date")
    @Mapping(target = "applicantId", source = "applicantId")
    GetBlacklistResponse blacklistToGetBlacklistResponse(Blacklist entity);

    List<GetAllBlacklistResponse> blacklistListToGetAllBlacklistResponseList(List<Blacklist> entities);
}

