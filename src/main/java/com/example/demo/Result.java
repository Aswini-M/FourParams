package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Result {
public int sum;
public int sub;
public int getSub() {
	return sub;
}

public void setSub(int sub) {
	this.sub = sub;
}

public int getSum() {
	return sum;
}

public void setSum(int sum) {
	this.sum = sum;
}

}
