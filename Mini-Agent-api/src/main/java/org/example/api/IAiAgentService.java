package org.example.api;

import org.example.api.dto.AutoAgentRequestDTO;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

/**
 * Ai Agent 服务接口
 *
 * @author Hancong Zhang
 */
public interface IAiAgentService {

    ResponseBodyEmitter autoAgent(AutoAgentRequestDTO request, HttpServletResponse response);

}
