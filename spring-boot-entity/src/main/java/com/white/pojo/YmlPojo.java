package com.white.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author 山栀
 * @date 2019/11/21 16:16
 */
@Data
@Accessors(chain = true)
public class YmlPojo {


    @Value("${server.port}")
    private String serverPort;


}
