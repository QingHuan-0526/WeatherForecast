package cn.lzx.weather.entity;

import lombok.Data;

/**
 * @ClassNameForecast
 * @Description   预测天气
 * @Author lzx
 * @Date2019/11/9 21:53
 * @Version V1.0
 **/
@Data
public class Forecast {

    //日期
    private String date;

    //最高温度
    private String high;

    //风力
    private String fengli;

    //最低温度
    private String low;

    //风向
    private String fengxiang;

    //类别
    private String type;


}
