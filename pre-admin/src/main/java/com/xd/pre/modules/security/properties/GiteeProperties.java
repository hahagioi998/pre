package com.xd.pre.modules.security.properties;

import lombok.Data;
import org.springframework.social.autoconfigure.SocialProperties;

/**
 * @Classname GithubProperties
 * @Description github第三方登录配置
 * @Author Created by Lihaodong (alias:小东啊) lihaodongmail@163.com
 * @Date 2019-07-08 21:49
 * @Version 1.0
 */
@Data
public class GiteeProperties extends SocialProperties {

    private String providerId = "gitee";
}
