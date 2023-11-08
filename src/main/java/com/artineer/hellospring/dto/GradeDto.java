package com.artineer.hellospring.dto;


import com.artineer.hellospring.annotation.Credit;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GradeDto {

    @NotBlank(message = "똑바로 입력하세요") // null 이거나 공백을 허용하지 않는다
    private String name;

    @NotBlank(message = "ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ")
    private String subject;

    @NotBlank
    @Credit(message = "올바른 학점을 입력해주세요")
    private String credit;

}
