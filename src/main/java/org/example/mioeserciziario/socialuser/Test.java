package org.example.mioeserciziario.socialuser;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        SocialUser adriana= new SocialUser("Adriana");
        SocialUser carla= new SocialUser("Carla");
        SocialUser biagio= new SocialUser("Biagio");
        SocialUser.Post aPost = adriana.newPost ("Ciao_da_@Carla_e_@Biagio_!");
        Set<SocialUser> mySet = aPost.getTagged();
        System.out.println(mySet);
        System.out.println(mySet.iterator().next()==carla);



        System.out.println ("----------------\nPersone taggate nel post : ");
        for (SocialUser user : mySet){
            System.out.println (user.getUserName());
        }
    }
}
