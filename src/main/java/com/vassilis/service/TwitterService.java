package com.vassilis.service;

import java.util.List;

import com.vassilis.model.Twitter;

public interface TwitterService {
	List<Twitter> getRecentTweets(int defaultTweetsPerPage);
}
