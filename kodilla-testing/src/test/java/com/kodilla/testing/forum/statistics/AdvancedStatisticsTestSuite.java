package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AdvancedStatisticsTestSuite {
    private static int postCount;
    private static int commentCount;
    private static List<String> usersNames;

    private List<String> generateUsersNames(int userCount){
        List<String> resultList = new ArrayList<>();
        for(int i = 0; i < userCount; i++){
            String user = "A" + i;
            resultList.add(user);
        }
        return resultList;
    }
    @Mock
    private Statistics statisticsMock;
    @BeforeEach
    void setDefault(){
        this.postCount = 100;
        this.commentCount = 100;
        this.usersNames = generateUsersNames(25);
    }
    @Test
    void testWhen0Post(){
        //Given
        postCount = 0;
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, advancedStatistics.getAveragePostsPerUser());
        assertEquals(4, advancedStatistics.getAverageCommentPerUser());
        assertNull(advancedStatistics.getAverageCommentPerPost());
    }
    @Test
    void testWhen1000Post(){
        postCount = 1000;
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(40, advancedStatistics.getAveragePostsPerUser());
        assertEquals(4, advancedStatistics.getAverageCommentPerUser());
        assertEquals(0.1, advancedStatistics.getAverageCommentPerPost());
    }
    @Test
    void testWhen0Comments(){
        commentCount = 0;
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(4, advancedStatistics.getAveragePostsPerUser());
        assertEquals(0, advancedStatistics.getAverageCommentPerUser());
        assertEquals(0, advancedStatistics.getAverageCommentPerPost());
    }
    @Test
    void testWhenMorePosts(){
        postCount = 150;
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(6, advancedStatistics.getAveragePostsPerUser());
        assertEquals(4, advancedStatistics.getAverageCommentPerUser());
        assertEquals(0.67, advancedStatistics.getAverageCommentPerPost());
    }
    @Test
    void testWhenMoreComments(){
        postCount = 50;
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2, advancedStatistics.getAveragePostsPerUser());
        assertEquals(4, advancedStatistics.getAverageCommentPerUser());
        assertEquals(2, advancedStatistics.getAverageCommentPerPost());
    }
    @Test
    void testWhen0Users(){
        usersNames = generateUsersNames(0);
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertNull(advancedStatistics.getAveragePostsPerUser());
        assertNull(advancedStatistics.getAverageCommentPerUser());
        assertEquals(1, advancedStatistics.getAverageCommentPerPost());
    }
    @Test
    void testWhen100Users(){
        usersNames = generateUsersNames(100);
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1, advancedStatistics.getAveragePostsPerUser());
        assertEquals(1, advancedStatistics.getAverageCommentPerUser());
        assertEquals(1, advancedStatistics.getAverageCommentPerPost());
    }

}
