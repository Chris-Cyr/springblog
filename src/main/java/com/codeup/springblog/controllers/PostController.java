package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String index() {
        return "This is a landing page for the blog site";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String id(@PathVariable int id) {
        return "This page shows the page for post id # " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "This is a page for viewing the form to create a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "This posts a blog post";
    }
}
