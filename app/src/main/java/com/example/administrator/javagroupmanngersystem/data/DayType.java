package com.example.administrator.javagroupmanngersystem.data;

/**
 * Created by zhangzga on 2017/12/6.
 */

public enum DayType {
    /**
     *
     * 已签到状态，时间已过
     */
    SIGNED(0),


    /**
     * 未签到状态，时间已过
     */
    UNSIGNED(1),


    /**
     * 等待状态，还未签到
     */
    WAITING(2),

    /**
     * 不可达到时间，非当前月份
     */
    UNREACHABLE(3),

    /**
     * 不可用状态，非当前月份
     */

    DISBLED(4);


    private int value;

    DayType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    public static DayType valueOf(int value){
        switch (value){
            case 0:
                return SIGNED;
            case 1:
                return UNSIGNED;
            case 2:
                return WAITING;
            case 3:
                return UNREACHABLE;
            case 4:
                return DISBLED;
            default:
                return DISBLED;
        }
    }
}
