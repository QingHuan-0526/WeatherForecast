package cn.lzx.weather.service.impl;

import cn.lzx.weather.entity.WeatherRes;
import cn.lzx.weather.service.WeatherService;
import org.springframework.stereotype.Service;

/**
 * @ClassNameWeatherServiceImpl
 * @Description  天气服务实现类
 * @Author lzx
 * @Date2019/11/9 21:58
 * @Version V1.0
 **/
@Service
public class WeatherServiceImpl implements WeatherService {

    @Override
    public WeatherRes getWeatherInfoByCityName(String name) {
        return null;
    }

    @Override
    public WeatherRes getWeatherInfoByCityId(String id) {
        return null;
    }
}
