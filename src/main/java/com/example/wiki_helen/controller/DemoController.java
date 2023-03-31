package com.example.wiki_helen.controller;

        import com.example.wiki_helen.domain.Demo;
        import com.example.wiki_helen.domain.Test;
        import com.example.wiki_helen.service.DemoService;
        import com.example.wiki_helen.service.TestService;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import javax.annotation.Resource;
        import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @Resource
    private DemoService demoService;

    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
