package com.example.sparkdemo;

import static spark.Spark.*;

public class HelloWorld {
	public static void main(String[] args) {
		get("/hello", (req, res) -> "Hello SparkJava World");
	}
}
