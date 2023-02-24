package com.zj.springboot.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

@Component
public class TestInterceptor implements HandlerInterceptor {

    /**
     *preHandle：在业务处理器处理请求之前被调用。预处理，可以进行编码、安全控制、权限校验等处理；
     *postHandle：在业务处理器处理请求执行完成后，生成视图之前执行。后处理（调用了Service并返回ModelAndView，但未进行页面渲染），有机会修改ModelAndView
     *afterCompletion：在DispatcherServlet完全处理完请求后被调用，可用于清理资源等。返回处理（已经渲染了页面）；
     */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        JSONObject body=new JSONObject();
        Map<String,Object> map=new HashMap<>(16);
        String userId=request.getHeader("userId");
        //拦截请求。不是A800000的用户不让登录，/**/login结尾的请求除外
        String USER_KEY="A800000";
        if (!USER_KEY.equals(userId)) {
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            Writer writer=response.getWriter();
            body.put("msg","请求失败！用户不正确");
            map.put("head","{}");
            map.put("body",body);
            JSON.writeJSONString(writer,map);
            return false;
        }
        return true;
    }
}
