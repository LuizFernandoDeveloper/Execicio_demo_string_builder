package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entitites.Comment;
import entitites.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment postOneCommentOne = new Comment("Have a nice trip!");
		Comment postOneCommentTwo = new Comment("How that's awesome!");
		Post postOne = new Post(sdf.parse("21/06/2022 13:05:44"),
				                          "travaling to new Zealand",
				                          "I'm going to visit this wonderful country!",
				                           12);
        postOne.addComment(postOneCommentOne);
        postOne.addComment(postOneCommentTwo);
        
        System.out.println(postOne);
        
        Comment PostTwoCommentOne = new Comment("Good night");
        Comment postTwoCommentTwo = new Comment("May the Force be with you");
        
        Post postTwo = new Post(sdf.parse("28/07/2023 12:12:59"),
                "Good night guys",
                "See you tomorrow",
                 5);
        postTwo.addComment(PostTwoCommentOne);
        postTwo.addComment(postTwoCommentTwo);
        
        System.out.println(postTwo);
	}

}
