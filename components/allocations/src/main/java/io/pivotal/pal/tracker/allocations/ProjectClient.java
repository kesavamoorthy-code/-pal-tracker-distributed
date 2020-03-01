package io.pivotal.pal.tracker.allocations;

import org.springframework.web.client.RestOperations;

public class ProjectClient {

    private final RestOperations restOperations;
    private final String registrationServerEndpoint;

    public ProjectClient(RestOperations restOperations, String registrationServerEndpoint) {
        this.restOperations= restOperations;
        this.registrationServerEndpoint = registrationServerEndpoint;
        System.out.println("Allocation control : 1.3" + restOperations );
        System.out.println("Allocation control : 1.4" + registrationServerEndpoint );
    }

    public ProjectInfo getProject(long projectId) {
        System.out.println("Allocation control : 1.5" + restOperations.getForObject(registrationServerEndpoint + "/projects/" + projectId, ProjectInfo.class) );
        return restOperations.getForObject(registrationServerEndpoint + "/projects/" + projectId, ProjectInfo.class);
    }
}
