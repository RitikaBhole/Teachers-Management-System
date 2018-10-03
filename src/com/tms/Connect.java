package com.tms;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.connection.Connection;

public class Connect {
	private static Connection connection;

	public static void connect() throws MongoClientException
	{
		MongoClient mongoClient = MongoClients.create("mongodb://host1:27017/teachers");
	}


}