package com;

import com.domain.Article;
import com.samskivert.mustache.Mustache;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/article")
    public ModelAndView displayArticle(Map<String, Object> model) {

        List<Article> articles = IntStream.range(0, 10)
                .mapToObj(i -> Article.generate("Article Title " + i))
                .collect(Collectors.toList());
        model.put("articles", articles);
        return new ModelAndView("index", model);
    }

    @GetMapping("/")
    String home(@RequestParam(value="name", defaultValue="Mr.Gregore") String name, Map<String, Object> model) {
        model.put("name", name);
        return "visual";
    }
}
