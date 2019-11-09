package cn.lzx.weather.entity;

import lombok.Data;

/**
 * @ClassNameYesterday
 * @Description  昨日天气
 * @Author lzx
 * @Date2019/11/9 21:55
 * @Version V1.0
 **/
@Data
public class Yesterday {

    //日期
    private String date;

    //最高温度
    private String high;

    //风向
    private String fx;

    //最低温度
    private String low;

    //风力
    private String fl;

    //类别
    private String type;




}
