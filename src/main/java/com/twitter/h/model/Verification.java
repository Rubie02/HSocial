package com.twitter.h.model;

import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table(name = "verifications")
public class Verification {
    private boolean isVerified = false;
    private LocalDateTime verificationStartTime;
    private LocalDateTime verificationEndTime;
    private String verificationPlanType;
}
