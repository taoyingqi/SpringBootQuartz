package com.example.demo.config;

public interface DataFlowUri {
    String BaseUri = "http://localhost:9393";
    String Apps = "/apps";
    String StreamsDefinitions = "/streams/definitions";
    String StreamsDefinitionsDefinition = "/streams/definitions/{name}";
    String StreamsDeployments = "/streams/deployments";
    String StreamsDeploymentsDeployment = "/streams/deployments/{name}";
    String TasksDefinitions = "/tasks/definitions";
    String TasksDefinitionsDefinition = "/tasks/definitions/{name}";
    String TasksExecutions = "/tasks/executions";
    String TasksExecutionsName = "/tasks/executions?name={name}";
    String TasksExecutionsExecution = "/tasks/executions/{id}";
    String JobsExecutions = "/jobs/executions";
    String JobsExecutionsName = "/jobs/executions?name={name}";
    String JobsExecutionsExecution = "/jobs/executions/{id}";
    String JobsExecutionsExecutionSteps = "/jobs/executions/{jobExecutionId}/steps";
    String JobsExecutionsExecutionStepsStep = "/jobs/executions/{jobExecutionId}/steps{stepId}";
    String JobsExecutionsExecutionStepsProgress = "/jobs/executions/{jobExecutionId}/steps{stepId}/progress";
    String JobsInstancesName = "/jobs/instances?name={name}";
    String JobsInstancesInstance = "/jobs/instances/{id}";



}
