package com.seneau.agentservice.service.application;

import com.seneau.agentservice.web.dto.request.application.ApplicationRequest;
import com.seneau.agentservice.web.dto.response.role.ApplicationResponse;


public interface ApplicationService {
    ApplicationResponse createApplication(ApplicationRequest applicationRequest);
}
