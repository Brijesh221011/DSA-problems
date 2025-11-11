import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Twitter {
    
    Map<Integer, List<int[]>> twts;
    Map<Integer, Set<Integer>> following;

    int time = 0;

    public Twitter() {
        twts = new HashMap<>();
        following = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        twts.putIfAbsent(userId, new ArrayList<>());
        twts.get(userId).add(new int[] { time++, tweetId });
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        
        //add own tweets
        if(twts.containsKey(userId)){
            for(int []twt:twts.get(userId)){
                pq.add(twt);
                if(pq.size()>10){
                   pq.remove();
                }
            }
        }
        //add tweets from followed users
        if(following.containsKey(userId)){
            for(int followee:following.get(userId)){
              if(twts.containsKey(followee)){
                 for(int[] twt:twts.get(followee)){
                pq.add(twt);
                if(pq.size()>10){
                    pq.remove();
                }
              }
            }
        }
        }
        // Retrieve tweets in reverse order
        List<Integer>ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.addFirst(pq.remove()[1]);
        }
        return ans;
    }

    public void follow(int followerId, int followeeId) {
        following.putIfAbsent(followerId, new HashSet<>());
        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}
