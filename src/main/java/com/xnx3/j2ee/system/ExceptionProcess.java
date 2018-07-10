package com.xnx3.j2ee.system;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;

import com.xnx3.j2ee.vo.BaseVO;

@ControllerAdvice
public class ExceptionProcess {
    
	// 对这个异常的统一处理，返回值 和Controller的返回规则一样
    @ExceptionHandler(MultipartException.class)
    public String handleAll(Throwable t){
    	BaseVO vo = new BaseVO();
    	vo.setBaseVO(BaseVO.FAILURE, t.getMessage());
    	return "iw/vo/baseVO";
    }
}