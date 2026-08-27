package com.fly.system.general.exception.file;

import com.fly.system.general.exception.base.BaseException;

/**
 * 文件信息异常类
 *
 * @author fly
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
