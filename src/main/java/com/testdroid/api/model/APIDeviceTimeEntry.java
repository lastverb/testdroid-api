package com.testdroid.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testdroid.api.APIEntity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * @author Adrian Zybala <adrian.zybala@bitbar.com>
 */
@XmlRootElement
public class APIDeviceTimeEntry extends APIEntity {

    private Date createTime;

    private Date endTime;

    private String userName;

    private Long userId;

    private Long freeTime;

    private Long billableTime;

    private Long deviceTime;

    private APIDeviceSession.Type type;

    public APIDeviceTimeEntry() {

    }

    public APIDeviceTimeEntry(
            Date createTime, Date endTime, String userName, Long userId, Long freeTime, Long billableTime,
            APIDeviceSession.Type type) {
        this.createTime = createTime;
        this.endTime = endTime;
        this.userName = userName;
        this.userId = userId;
        this.freeTime = freeTime;
        this.billableTime = billableTime;
        this.deviceTime = freeTime + billableTime;
        this.type = type;
    }

    @Override
    @JsonIgnore
    protected <T extends APIEntity> void clone(T from) {
        APIDeviceTimeEntry apiDeviceTimeEntry = (APIDeviceTimeEntry) from;
        cloneBase(from);
        this.createTime = apiDeviceTimeEntry.createTime;
        this.endTime = apiDeviceTimeEntry.endTime;
        this.userName = apiDeviceTimeEntry.userName;
        this.userId = apiDeviceTimeEntry.userId;
        this.deviceTime = apiDeviceTimeEntry.deviceTime;
        this.type = apiDeviceTimeEntry.type;
        this.freeTime = apiDeviceTimeEntry.freeTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(Long deviceTime) {
        this.deviceTime = deviceTime;
    }

    public APIDeviceSession.Type getType() {
        return type;
    }

    public void setType(APIDeviceSession.Type type) {
        this.type = type;
    }

    public Long getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(Long freeTime) {
        this.freeTime = freeTime;
    }

    public Long getBillableTime() {
        return billableTime;
    }

    public void setBillableTime(Long billableTime) {
        this.billableTime = billableTime;
    }
}