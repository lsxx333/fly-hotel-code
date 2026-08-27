package com.fly.system.general.exception.user;

import com.fly.system.general.exception.base.BaseException;

/**
 * 用户信息异常类
 *
 * @author fly
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
