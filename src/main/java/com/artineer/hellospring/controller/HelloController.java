package com.artineer.hellospring.controller;


import com.artineer.hellospring.dto.GradeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class HelloController {

    private final List<GradeDto> gradeDtoList = Arrays.asList(
            new GradeDto("김민성", "컴퓨터 조직", "A+"),
            new GradeDto("김법원", "컴퓨터 구조", "A0"),
            new GradeDto("케로로", "이산수학", "C+")
    );

    @GetMapping({"/", "/grades"})
    public String showSomething(Model model) {

        model.addAttribute("gradeDtoList", gradeDtoList);

        return "index";
    }


}


