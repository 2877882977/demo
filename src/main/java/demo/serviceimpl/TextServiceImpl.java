package demo.serviceimpl;

import demo.dao.EsMapper;
import demo.entity.Es;
import demo.entity.EsWithBLOBs;
import demo.http.TestHTTP;
import demo.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class TextServiceImpl implements TextService {
    @Autowired
    private EsMapper esMapper;
    @Override
    public String insertText() {

        for(int i = 1; i <= 100; i++) {
            try {
                List<EsWithBLOBs> textData =TestHTTP.post(i);
                esMapper.insertByList(textData);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("存储完成");
        return "Text inserted successfully for document: "+Es.class; // 返回成功消息
    }

}
