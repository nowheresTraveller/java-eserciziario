package org.example.mioeserciziario.socialuser;

import java.util.HashSet;
import java.util.Set;

public class SocialUser {

    private String userName;

    public SocialUser(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public Post newPost(String message){
        return new Post(userName,message);
    }

    @Override
    public String toString(){
        return userName;
    }

    public static class Post {
        private String author;
        private String message;

        public Post(String author, String message) {
            this.author = author;
            this.message = message;
        }

        public String getAuthor() {
            return author;
        }

        public String getMessage() {
            return message;
        }

        public Set<SocialUser> getTagged (){
            String [] splitterM = message.split("_");
            Set<SocialUser> userSet= new HashSet<>();
            for (String word : splitterM){
                if(word.charAt(0)=='@'){
                    userSet.add(new SocialUser(word.substring(1)));
                }
            }
            return userSet;
        }

    }

}
