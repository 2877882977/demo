package demo.service;

import demo.dto.DataResponse;
import demo.dto.PageRequest;
public interface TextService {
    public DataResponse insertText();
    public DataResponse selectText(String pno,String title, String state,PageRequest pageRequest);
    public DataResponse selectState(String state,String address,String agent,PageRequest pageRequest);
}
