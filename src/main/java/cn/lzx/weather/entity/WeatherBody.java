package cn.lzx.weather.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassNameWeatherBody
 * @Description  天气信息实体
 * @Author lzx
 * @Date2019/11/9 21:50
 * @Version V1.0
 **/
@Data
public class WeatherBody {

    //昨日
    private Yesterday yesterday;

    //城市
    private String city;

    //感冒
    private String ganmao;

    //温度
    private String wendu;

    //未来预测
    private List<Forecast> forecast;



}
