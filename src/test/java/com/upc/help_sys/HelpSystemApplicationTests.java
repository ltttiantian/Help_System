package com.upc.help_sys;


import com.upc.help_sys.dao.HelpInfoRepository;
import com.upc.help_sys.dao.entity.HelpInfo;
import com.upc.help_sys.utils.MyGson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelpSystemApplicationTests {
	@Test
	public void testMyGson() {
		HelpInfo helpInfo = new HelpInfo();
		helpInfo.setAccepter_id(1);
		helpInfo.setTip(5);
		String json = MyGson.toJson(helpInfo);
		System.out.println(json);
	}
}
