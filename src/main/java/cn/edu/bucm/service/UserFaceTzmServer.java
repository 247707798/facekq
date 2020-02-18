package cn.edu.bucm.service;

import cn.edu.bucm.mapper.UserFaceTzm;

import java.util.List;

public interface UserFaceTzmServer {
    public List<UserFaceTzm> findUsersTzm();
    public List<UserFaceTzm> findUserTzmByIndex(int beginNums, int endNums, String xgh);
    public UserFaceTzm findUsersTzmByXgh(String xgh);
    public void insertUsersTzm(UserFaceTzm newuser);
    public void updateUsersTzm(UserFaceTzm olduser);
    public int count(String xgh);

}
