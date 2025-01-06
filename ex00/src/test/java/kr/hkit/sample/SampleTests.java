package kr.hkit.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {

	@Setter(onMethod_ = @Autowired)
	private Restaurant rest;
	@Setter(onMethod_ = @Autowired)
	Chef c;
	
	@Test
	public void testExist() {
		assertNotNull(rest);
		rest.getChef().setName("홍길동");
		
		log.info(rest);
		log.info("===============");
		log.info(rest.getChef());
	}
	
	//@Test
	public void testChef() {
		assertNotNull(c);
		c.setName("test");
		log.info(c.getName());
	} 
	
}