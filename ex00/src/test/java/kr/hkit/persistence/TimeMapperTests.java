package kr.hkit.persistence;

//import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.hkit.mapper.TimeMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {

	@Setter(onMethod_ = @Autowired)
	private TimeMapper tm;
	
	//@Test
	public void testGetTime() {
		log.info("!@#$"+tm.getTime());
		log.info("!@#$"+tm.getClass().getName());
	}
	@Test
	public void testGetTime2() {
		log.info("!@#$ " + tm.getTime2());
	}
}