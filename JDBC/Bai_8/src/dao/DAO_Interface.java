package dao;

import java.util.ArrayList;

public interface DAO_Interface<T> {
    public int insert(T t);

    public int update(T t);

    public int delete(T t);

    public ArrayList<T> selectALL();

    public T selectById(T t);

    public ArrayList<T> selectByCondition(String condition);

}
