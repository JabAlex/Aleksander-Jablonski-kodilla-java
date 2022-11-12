package com.kodilla.testing.forum.statistics;

import java.util.List;

public class AdvancedStatistics {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double averagePostsPerUser;
    private double averageCommentPerUser;
    private double averageCommentPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.userCount = statistics.usersNames().size();
        this.postCount = statistics.postsCount();
        this.commentCount = statistics.commentsCount();
        averagePostsPerUser = (double) postCount / userCount;
        averageCommentPerUser = (double) commentCount / userCount;
        averageCommentPerPost = (double) commentCount / postCount;
    }

    public void showStatistics() {
        System.out.println("User count: " + userCount);
        System.out.println("Post count: " + postCount);
        System.out.println("Comment count: " + commentCount);
        System.out.println("Average posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentPerUser);
        System.out.println("Average comments per post: " + averageCommentPerPost);
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public Double getAveragePostsPerUser() {
        if(userCount != 0) {
            return (double)Math.round(averagePostsPerUser * 100) / 100;
        }
        return null;
    }

    public Double getAverageCommentPerUser() {
        if(userCount != 0) {
            return (double)Math.round(averageCommentPerUser * 100) / 100;
        }
        return null;
    }


    public Double getAverageCommentPerPost() {
        if(postCount != 0) {
            return (double)Math.round(averageCommentPerPost * 100) / 100;
        }
        return null;
    }
}