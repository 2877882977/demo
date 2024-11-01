package demo.controller;

import demo.entity.EsWithBLOBs;
import demo.service.TextService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class TextController {
    @Resource
    private TextService textService;


    @RequestMapping(method = RequestMethod.POST)
    public String insertText(@RequestBody(required = false) EsWithBLOBs tbIndexMenus){
        return textService.insertText();
    }
}
