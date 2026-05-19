class Twitter {
    HashMap<Integer, Set<Integer>> follow;
    HashMap<Integer, List<int[]>> tweet;
    int time=0;
    public Twitter() {
        follow=new HashMap<>();
        tweet=new HashMap<>();
    }
    public void postTweet(int userId, int tweetId) {
    tweet.computeIfAbsent(userId, k -> new ArrayList<>()).add(new int[]{time++, tweetId});   
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> news= new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int[] t : tweet.getOrDefault(userId, new ArrayList<>())) {
            news.add(t);
        }
        for(int followedId : follow.getOrDefault(userId, new HashSet<>())) {
            if(followedId==userId) continue;
            for(int[] t : tweet.getOrDefault(followedId, new ArrayList<>())) {

                news.add(t);
                }
        }       int c=0;
                List<Integer> res = new ArrayList<>();
                while(!news.isEmpty() && c<10) {
                    res.add(news.poll()[1]);
                    c++;
                }
        
            return res;
               
    }
    public void follow(int followerId, int followeeId) {
               follow.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
                    }
    
    public void unfollow(int followerId, int followeeId) {
      follow.getOrDefault(followerId, new HashSet<>()).remove(followeeId);  
    }
}