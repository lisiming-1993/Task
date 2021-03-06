package com.xiuzhenyuan.exception.resolver;

import com.xiuzhenyuan.exception.StudentException;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExceptionResolver implements HandlerExceptionResolver {
    private Logger logger = Logger.getLogger(ExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //如果抛出的是系统自定义的异常则直接转换
        if (ex instanceof StudentException) {
            logger.info("用户操作错误：" + ex.getMessage());
            ModelAndView modelAndView = new ModelAndView("mistake");
            modelAndView.addObject("message", ex.getMessage());
            return modelAndView;
        } else {
            logger.error("服务器错误：\n" + ex);
            return new ModelAndView("error");
        }
    }
}
