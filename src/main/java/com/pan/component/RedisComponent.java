package com.pan.component;

import com.pan.domain.constants.Constants;
import com.pan.domain.dto.UserSpaceDto;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("redisComponent")
public class RedisComponent {

    @Resource
    private RedisUtils redisUtils;


    /**
     * 保存用户空间使用
     *
     * @param userSpaceDto 用户空间dto
     * @param userId       用户id
     * @author yx4616
     * @date 2024/03/07
     */
    public void saveUserSpaceUse(String userId, UserSpaceDto userSpaceDto) {
        redisUtils.setex(Constants.REDIS_KEY_USER_SPACE_USE + userId, userSpaceDto, Constants.REDIS_KEY_EXPIRES_DAY);
    }

}
