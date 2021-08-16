package com.laptrinhjavaweb.api;
// huong changed
//huong changed2
//huong change 7
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewDTO;



/*package com.laptrinhjavaweb.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewsDTO;

//@Controller // turn this java class to a api controller, auto go to controller when request is sent
@RestController //response auto map model to json = controller + responsebody

public class NewsAPI {
	
	//@RequestMapping (value ="/news", method= RequestMethod.POST) // which controller should be used, based on the api sent from client
	
	@PostMapping (value = "/news") // =requestMapping + method = get, should not put outside of class, it's just post method, have many other methods
	// values for controller NewsAPI, common for all methods, maybe put them outside class as controller sign
	// value = news: api must use nounce not verb, method decides which action be done to that news (post, delete or put)
	// maybe many urls are the same, in this case based on method to decide which api controller should be used
	

	//@ResponseBody // return result to client in json format
	
	public NewsDTO createNewsModel(@RequestBody NewsDTO model) { // the same as HttpUtils used to map json and NewsDTO model
		return model; //  by @ResponseBody, model is turned into json
	} 
	
	
	
}*/

@RestController
public class NewAPI {

	@RequestMapping(value = "/news", method = RequestMethod.GET)
	String show { // the same as HttpUtils used to map json and NewsDTO model
		return "hello"; //  by @ResponseBody, model is turned into json
	} 
	
}
