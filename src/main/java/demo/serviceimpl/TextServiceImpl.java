package demo.serviceimpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import demo.dto.DataResponse;
import demo.dto.PageRequest;
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
    public DataResponse insertText() {

        for(int i = 1; i <= 100; i++) {
            try {
                List<EsWithBLOBs> textData =TestHTTP.post(i);
                esMapper.insertByList(textData);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("存储完成");
        return new DataResponse("success" , "新增数据成功"); // 返回成功消息
    }

    //    public DataResponse selectText(String pno,String title, PageRequest page) {
//
//        PageInfo pageInfo = PageHelper.startPage(page.getPage(), page.getRowNum()).doSelectPageInfo(new ISelect() {
//            @Override
//            public void doSelect() {
//                esMapper.selectBypage(pno, title);}
////                esMapper.selectByPrimaryKey(Integer.parseInt(pno));
//            });
//        return new DataResponse("success" , "查询分类列表成功",pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getPageNum(), pageInfo.getList()); // 返回成功消息
//    }
    public DataResponse selectText(String pno, String title,String state, PageRequest page) {
        // 输出当前分页信息
        System.out.println("当前页：" + page.getPage());
        System.out.println("每页记录数：" + page.getRowNum());

        // 开始分页
        PageHelper.startPage(page.getPage(), page.getRowNum());

        // 执行查询
        List<Es> textData = esMapper.selectBypage(pno, title,state);

        // 使用 PageInfo 包装查询结果
        PageInfo<Es> pageInfo = new PageInfo<>(textData);

        // 打印分页数据
        System.out.println("分页数据：" + pageInfo.getList());
        System.out.println("总记录数：" + pageInfo.getTotal());

        // 返回结果
        return new DataResponse("success", "查询分类列表成功", pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getPageNum(), pageInfo.getList());
    }
    public DataResponse selectState(String state,String address,String agent, PageRequest page) {
        // 输出当前分页信息
        System.out.println("当前页：" + page.getPage());
        System.out.println("每页记录数：" + page.getRowNum());

        // 开始分页
        PageHelper.startPage(page.getPage(), page.getRowNum());

        // 执行查询
        List<Es> textData = esMapper.selectState(state,address,agent);

        // 使用 PageInfo 包装查询结果
        PageInfo<Es> pageInfo = new PageInfo<>(textData);

        // 打印分页数据
        System.out.println("分页数据：" + pageInfo.getList());
        System.out.println("总记录数：" + pageInfo.getTotal());

        // 返回结果
        return new DataResponse("success", "查询分类列表成功", pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getPageNum(), pageInfo.getList());
    }


}

