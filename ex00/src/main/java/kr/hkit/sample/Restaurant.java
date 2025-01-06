package kr.hkit.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
//import lombok.Getter;
import lombok.Setter;

@Component
@Data
//@Getter
//@Setter
public class Restaurant {
	
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	
	private String title;

}
