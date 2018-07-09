package dao;

import entity.Stu_apply_activity;

import java.util.List;

/**
 * Created by lenovo on 2018/7/9.
 */
public interface Stu_apply_activityDao {
    public int addApply(String studentID,String activityID,String time,String state);
    public List<Stu_apply_activity> getActivityByStudentID(String studentID);
    public List<Stu_apply_activity> getActivityByActivityID(String activityID);
    public List<Stu_apply_activity> getActivityByStudentIDAndState2(String studentID);
    public int deleteApply(String studentID,String activityID);
    public List<Stu_apply_activity> getActivityByStudentIDAndActivityID(String studentID,String activityID);
    public int passApply(String studentID,String activityID);
    public int rejectApply(String studentID,String activityID);
}
