package demo.dto;


/**
 * @Description: 返回值统一封装类
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataResponse {

    private Object data;

    private String message;

    private String code;

    private long total;

    private long page;

    private long totalpages;

    public DataResponse() {
    }

    public DataResponse(Object data) {

        this.data = data;
    }

    public DataResponse(String code, String message) {
        this.message = message;
        this.code = code;
    }

    public DataResponse(String code, String message, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public DataResponse(String code, String message, long total, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.total = total;
    }

    public DataResponse(int i, String operation) {
        this.message = operation + "数据成功！";
        this.code = "success";
        if (i <= 0) {
            this.message = operation + "数据失败！";
            this.code = "error";
        }
    }

    /**
     * @param code
     * @param message
     * @param total      总数
     * @param totalpages 总页数
     * @param page       当前页
     * @param data       数据
     */
    public DataResponse(String code, String message, long total, long totalpages, long page, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.total = total;
        this.totalpages = totalpages;
        this.page = page;
    }

    public Object getData() {
        System.out.println("DataResponse data字段内容：" + data);return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getTotalpages() {
        return totalpages;
    }

    public void setTotalpages(long totalpages) {
        this.totalpages = totalpages;
    }


}
