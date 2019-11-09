package cn.lzx.weather.entity;

import lombok.Data;

/**
 * @ClassNameWeatherRes
 * @Description  接收第三方天气查询信息实体
 * @Author lzx
 * @Date2019/11/9 21:44
 * @Version V1.0
 **/
@Data
public class WeatherRes {

    //数据
    private WeatherBody data;

    //状态码
    private String status;

    //描述信息
    private String desc;


}
