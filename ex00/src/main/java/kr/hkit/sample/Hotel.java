package kr.hkit.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
import lombok.ToString;

@Component
@Data
//@Getter
@ToString
@AllArgsConstructor
public class Hotel {
	private Chef chef;
	
	/*public Hotel(Chef chef) {
		this.chef = chef;
	}*/
	
	
}
