package com.imooc.miaosha.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: 李清依
 * @Date: 2019/10/7 17:13
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MiaoshaUser {
    private long id;
    private String nickname;
    private String password;
    private String salt;
    private String head;
    private Date lastLoginDate;
    private Date registerDate;
    private Integer loginCount;
}
