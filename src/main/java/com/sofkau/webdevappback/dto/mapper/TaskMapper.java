package com.sofkau.webdevappback.dto.mapper;

import com.sofkau.webdevappback.dto.TaskDto;
import com.sofkau.webdevappback.entity.Task;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toTaskDto(Task task);

    List<TaskDto> toTaskDtoList(List<Task> tasks);

    @InheritInverseConfiguration
    Task toTask(TaskDto taskDto);

    List<Task> toTasks(List<TaskDto> taskDtos);

}
