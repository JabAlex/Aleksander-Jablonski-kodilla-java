package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> LocalDate.now().compareTo(forumUser.getUserBirthday().plusYears(20)) >= 0)
                .filter(forumUser -> forumUser.getUserPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        resultMapOfForumUsers.entrySet().stream()
                .forEach(System.out::println);

    }
}