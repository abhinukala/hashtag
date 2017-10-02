package com.hashtag.dao;

import java.util.List;

public interface GenericDao<T> {

	List<T> getAll();
}
