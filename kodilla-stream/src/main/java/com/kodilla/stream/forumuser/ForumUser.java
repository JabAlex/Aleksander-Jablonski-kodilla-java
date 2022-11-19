package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate userBirthday;
    private final int userPostCount;

    public ForumUser(int userId, String userName, char userSex, LocalDate userBirthday, int userPostCount) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthday = userBirthday;
        this.userPostCount = userPostCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthday() {
        return userBirthday;
    }

    public int getUserPostCount() {
        return userPostCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userBirthday=" + userBirthday +
                ", userPostCount=" + userPostCount +
                '}';
    }
}
