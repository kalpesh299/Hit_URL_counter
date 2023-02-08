package com.example.HitCounter.Counter;

public class Counter {

    private String userName;
    private int count;

    public Counter(String userName, int count) {
        this.userName = userName;
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public String toString() {
        return "Counter{" +
                "userName='" + userName + '\'' +
                ", count=" + count +
                '}';
    }
}
