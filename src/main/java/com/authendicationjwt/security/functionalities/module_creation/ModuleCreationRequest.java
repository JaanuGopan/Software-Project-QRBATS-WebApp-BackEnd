package com.authendicationjwt.security.functionalities.module_creation;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModuleCreationRequest {
    private String moduleCode;

    private String moduleName;

    private String moduleEnrolmentKey;

    private Integer semester;

    private Integer departmentId;

    private Integer lectureId;
}
