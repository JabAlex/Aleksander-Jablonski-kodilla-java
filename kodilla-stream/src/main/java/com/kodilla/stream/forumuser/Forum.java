package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1, "joe", 'M', LocalDate.of(1980, 1, 31), 0));
        forumUserList.add(new ForumUser(2, "meg", 'F', LocalDate.of(1998, 2, 2), 250));
        forumUserList.add(new ForumUser(3, "peter", 'M', LocalDate.of(1970, 3, 29), 88));
        forumUserList.add(new ForumUser(4, "chris", 'M', LocalDate.of(2008, 4, 28), 7));
        forumUserList.add(new ForumUser(5, "lois", 'F', LocalDate.of(1972, 5, 27), 123));
        forumUserList.add(new ForumUser(6, "bonnie", 'F', LocalDate.of(1983, 6, 26), 150));
        forumUserList.add(new ForumUser(7, "tom", 'M', LocalDate.of(1977, 7, 25), 500));
        forumUserList.add(new ForumUser(8, "brian", 'M', LocalDate.of(2002, 11, 19), 264));
        forumUserList.add(new ForumUser(9, "stewie", 'M', LocalDate.of(2010, 9, 23), 15));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
