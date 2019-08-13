package com.gozman.multipars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FileController {

    @GetMapping("/test")
    public String test() {
        return "multiple-files";
    }

    @GetMapping("/t1")
    @ResponseBody
    public String t1() {
        return "t1";
    }

    @PostMapping("/test")
    @ResponseBody
    public List<String> fileSubmit(@RequestParam("files") MultipartFile[] multipartFiles){
        List<String> fileNames = Arrays
                .stream(multipartFiles)
                .map(MultipartFile::getOriginalFilename)
                .collect(Collectors.toList());

        return fileNames;
    }
}
