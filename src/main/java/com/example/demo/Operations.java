package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Operations {
	
	@Autowired
	Result result;
	@GetMapping("/add/{param1}/{param2}")
	public Result add(@PathVariable int param1, @PathVariable int param2) {
		int sum = param1 + param2;
		result.setSum(sum);
		System.out.println(sum);
	    return result;
}
	@PostMapping("/add")
	public Result postAdd(@RequestBody Properties p) {
	int sum= p.getParam1() + p.getParam2();
	result.setSum(sum);
	System.out.println(sum);
	return result;
}
	@PostMapping("/add1")
	public Result postAdd1(@RequestBody Properties p) {
	int sum= p.getParam3() + p.getParam4();
	result.setSum(sum);
	System.out.println(sum);
	return result;
}
	@PostMapping("/sub")
	public Result postSub(@RequestBody Properties p) {
	int sub= p.getParam1() - p.getParam2();
	result.setSub(sub);
	System.out.println(sub);
	return result;
}
	@PostMapping("/sub1")
	public Result postSub1(@RequestBody Properties p) {
	int sub= p.getParam3() - p.getParam4();
	result.setSub(sub);
	System.out.println(sub);
	return result;
}}