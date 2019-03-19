package com.cotx.utils;

import com.cotx.Result;
import com.cotx.exception.ResultCode;

public class ResultUtils {
    public static Result success(Object data) {
        return new Result<>(ResultCode.SUCCESS, data);
    }

    public static Result warn(ResultCode resultCode, String msg) {
        Result<Object> result = new Result<>(resultCode);
        result.setMsg(msg);
        return result;
    }

    public static Result warn(ResultCode resultCode) {
        return new Result(resultCode);
    }
}
