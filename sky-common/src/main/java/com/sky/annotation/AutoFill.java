package com.sky.annotation;

import com.sky.enumeration.OperationType;

public @interface AutoFill {

    //数据库操作类型：UPDATE INSERT
    OperationType value();
}
