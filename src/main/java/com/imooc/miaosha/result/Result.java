package com.imooc.miaosha.result;

import lombok.Data;

/**
 * @Auther: 李清依
 * @Date: 2019/10/7 14:56
 * @Description:
 */
@Data
public class Result <T>{
    private int code;
    private String msg;
    private T data;
    private Result(T data){
        this.data=data;
    }
    /**
     * 成功的时候调用
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }
    /**
     * 失败的时候调用
     */
    public static <T> Result<T> error(CodeMsg codeMsg){
        return new Result<>(codeMsg);
    }
    private Result(CodeMsg codeMsg){
        if (codeMsg!=null){
            this.code=codeMsg.getCode();
            this.msg=codeMsg.getMsg();
        }
    }

}
