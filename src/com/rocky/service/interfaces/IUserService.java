package com.rocky.service.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="userService")
public interface IUserService<T> extends IBaseService<T> {
}
