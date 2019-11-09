package cn.lzx.weather.service;

import cn.lzx.weather.entity.WeatherRes;

/**
 * @ClassNameWeatherService
 * @Description  天气服务
 * @Author lzx
 * @Date2019/11/9 21:41
 * @Version V1.0
 **/
public interface WeatherService {

    //根据城市名字获取天气信息
    WeatherRes getWeatherInfoByCityName(String name);

    //根据城市ID获取天气信息
    WeatherRes getWeatherInfoByCityId(String id);


}
