package com.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//User Entity
class User{
    private int id;
    private String name;
    private String password;

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

//UserDto Entity
class UserDto{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDto{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
public class StreamMapExamble {
    public static void main(String[] args) {
        //get the List of Users
        List<User> users = new ArrayList<>();
        users.add(new User(1,"sathish","1234"));
        users.add(new User(2,"kumar","65"));
        users.add(new User(3,"manoj","765"));
        users.add(new User(4,"akash","9876"));

        //set the List Of Users in userDto
            //Normal way
            List<UserDto> userDto = new ArrayList<>();
            for(User user:users){
                userDto.add(new UserDto(user.getId(), user.getName()));
            }
                System.out.println(userDto);
            //Stream Map way using Function Interface
            users.stream().map(new Function<User, UserDto>() {
                @Override
                public UserDto apply(User user) {
                    return new UserDto(user.getId(), user.getName());
                }
            }).collect(Collectors.toList()).forEach(System.out::println);
            //Stream map using Lambda
              users.stream().map((user) ->new UserDto(user.getId(),user.getName())).collect(Collectors.toList())
                      .forEach(System.out::println);

    }
}

