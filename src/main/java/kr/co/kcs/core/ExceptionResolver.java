package kr.co.kcs.core;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.kcs.core.utils.SUtils;

public class ExceptionResolver extends SimpleMappingExceptionResolver {

	private final Logger log	= LoggerFactory.getLogger(getClass());

	@Override
	public ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex){

		System.err.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		HashMap<String,Object> excpMap	= new HashMap<>();

		String viewNm					= determineViewName(ex, request);
		Integer statusCd				= determineStatusCode(request, viewNm);

		String excpCd					= "500";
		String excpMsg					= determineViewName(ex, request);
        String excpPath					= SUtils.nvl(handler).replaceAll("#.*$", "");
        String excpMethod				= ex.getClass().getSimpleName();

        /*
        StringBuffer excpToStr			= new StringBuffer();
        StackTraceElement[] stacks 		= ex.getStackTrace();
        excpToStr.append(ex.getMessage()+"<br>");
        for(StackTraceElement element : stacks){
        	excpToStr.append(element+"<br>");
        }
		excpMap.put("excpToStr"		,excpToStr.toString());
        */

        excpMap.put("isError"		,"true");
		excpMap.put("excpCd"		,excpCd);
		excpMap.put("excpMsg"		,excpMsg);
		excpMap.put("excpPath"		,excpPath);
		excpMap.put("excpMethod"	,excpMethod);

		log.info("=~=~=~=~= viewName ::: {}",viewNm);
		log.info("=~=~=~=~= statusCode : {}",statusCd);

		log.info("=~=~=~=~= excpMsg :::: {}",excpMsg);
		log.info("=~=~=~=~= excpPath ::: {}",excpPath);
		log.info("=~=~=~=~= excpMethod : {}",excpMethod);



		log.info("=~=~=~=~= excpMap :::: {}",excpMap);

//		ModelAndView mv = new ModelAndView("excption");
		ModelAndView mv = new ModelAndView("jsonView");
		mv.addAllObjects(excpMap);

		log.info("=~=~=~=~= mv ::::::::: {}",mv);

		return mv;
	}
}
