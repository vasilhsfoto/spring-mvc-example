package com.vassilis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vassilis.dao.TwitterDao;
import com.vassilis.model.Twitter;

@Service("twitterService")
public class TwitterServiceImpl implements TwitterService {
	
	@Autowired
	private TwitterDao twitterDao;
	
	public List<Twitter> getRecentTweets(int defaultTweetsPerPage) {
		return twitterDao.getTwitters();
	}
}
