package com.artineer.hellospring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GradeDto {

    private String name;

    private String subject;

    private String credit;

}
