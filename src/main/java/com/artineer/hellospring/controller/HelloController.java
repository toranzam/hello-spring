package com.artineer.hellospring.controller;


import com.artineer.hellospring.dto.GradeDto;
import com.artineer.hellospring.entity.Grade;
import com.artineer.hellospring.repository.GradeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;


@Controller
@Slf4j
@RequiredArgsConstructor
public class HelloController {

    private final GradeRepository gradeRepository;

    private final List<Grade> gradeDtoList = Arrays.asList(
            new Grade(0L, "김민성", "컴퓨터 조직", "A+"),
            new Grade(1L, "김법원", "컴퓨터 구조", "A0"),
            new Grade(2L, "케로로", "이산수학", "C+")
    );

    @GetMapping("/grades")
    public String showSomething(Model model) {

        List<Grade> gradeListDb = gradeRepository.findAll();

        model.addAttribute("gradeList", gradeListDb);

        return "grades";
    }

    @GetMapping("/grades/new")
    public String newGrade(Model model) {

        model.addAttribute("gradeDto", new GradeDto());

        return "newGrade";
    }

    @PostMapping("/grades/new")
    public String createNewGrade(@Validated GradeDto gradeDto, BindingResult result) {
        log.info("출력할 데이터={}", gradeDto);

        log.info("오류가 있나요?={}", result);

        if (result.hasErrors()) {
            return "newGrade";
        }

        Grade grade = Grade.builder()
                .name(gradeDto.getName())
                .subject(gradeDto.getSubject())
                .credit(gradeDto.getCredit())
                .build();

        gradeRepository.save(grade);


        return "redirect:/grades";
    }


}


