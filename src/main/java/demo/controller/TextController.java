package demo.controller;

import demo.dto.DataResponse;
import demo.dto.PageRequest;
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
    @RequestMapping(method =  RequestMethod.GET)
    public DataResponse selectText(String pno, String title, String state, PageRequest pageRequest){
        DataResponse dataResponse =  textService.selectText(pno,title, state,pageRequest);
        return dataResponse;
    }
    @RequestMapping(value = "/state",method =  RequestMethod.GET)
    public DataResponse selectState(String state,String address,String agent, PageRequest pageRequest){
        DataResponse dataResponse =  textService.selectState(state,address,agent,pageRequest);
        return dataResponse;
    }

    @RequestMapping(method = RequestMethod.POST)
    public DataResponse insertText(@RequestBody(required = false) EsWithBLOBs tbIndexMenus){
        DataResponse dataResponse = textService.insertText();
        return dataResponse;
    }
}
