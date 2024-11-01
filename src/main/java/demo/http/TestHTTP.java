package demo.http;

import demo.entity.EsWithBLOBs;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson2.JSONArray;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHTTP {
    public static List<EsWithBLOBs> post(int i) throws IOException, InterruptedException {
        var values = new HashMap<String, String>() {{
            put("page", String.valueOf(i));
        }};

        var objectMapper = new ObjectMapper();
        String baseUrl = "";//接口链接
        String requestBody = objectMapper
                .writeValueAsString(values);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        Map map = JSON.parseObject(response.body(), Map.class);
        JSONObject obj = (JSONObject) map.get("data");
        JSONArray arr = (JSONArray) obj.get("list");
        //方法一转List
        List<EsWithBLOBs> list = new ArrayList<>();

        for(Object jObj : arr){
            EsWithBLOBs Es = JSON.parseObject(JSON.toJSONString(jObj) , EsWithBLOBs.class);
            list.add(Es);
        }
        //方法二转List
//        List<EsWithBLOBs> list = (List<EsWithBLOBs>) arr.stream()
//                .map(jObj -> JSON.parseObject(JSON.toJSONString(jObj), EsWithBLOBs.class))
//                .collect(Collectors.toList());
        System.out.println(response.body());
        return list;
    }
}

