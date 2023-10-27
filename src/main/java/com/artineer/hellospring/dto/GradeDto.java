package com.artineer.hellospring.dto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GradeDto {

    @NotBlank(message = "똑바로 입력하세요")
    private String name;

    @NotBlank
    private String subject;

    @NotBlank
    private String credit;

}
