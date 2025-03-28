package kr.co.kcs.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.kcs.core.utils.Day;
import kr.co.kcs.core.utils.NsjiSender;
import kr.co.kcs.oncf.cmn.NcpVty;

@Controller
public class DemoCtrl {

	protected final Logger log	= LoggerFactory.getLogger(getClass());

	@Autowired
	NsjiSender sender;

	@Autowired
	DamoSvc svc;


	@GetMapping("/gogo.do")
	public String gogo(HttpServletRequest req ,HttpServletResponse res, ModelMap modelMap) {

		modelMap.addAttribute("data", sender.sender(svc.lexStruct()));

		log.info("################### {}",Level.DEBUG.name());
		log.info("################### {}",Level.DEBUG.toInt());
		log.info("################### {}",Day.valueOfNumber(10));
		log.info("################### {}",Day.valueOfLabel("Monday"));
		log.info("################### {}",modelMap);


		return "jsonView";
//		return "demo/damo";
	}

	@GetMapping("/go.do")
	public String go(HttpServletRequest req ,HttpServletResponse res, ModelMap modelMap) {

		log.info("################### {}",Day.valueOfNumber(10).label());
		log.info("################### {}",Day.valueOfLabel("Monday"));
		log.info("################### {}",Day.TUE.name() );
		log.info("################### {}",Day.TUE.number());
		log.info("################### {}",Day.TUE.label());

		log.info("################### {}",NcpVty.valueOfNumber(103).beanType().getClass());
		log.info("################### {}",NcpVty.valueOfNumber(103).number());
		log.info("################### {}",NcpVty.valueOfNumber(103).name());



		return "jsonView";
//		return "demo/damo";
	}

}
