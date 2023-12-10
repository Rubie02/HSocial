package com.twitter.h.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Verification {
    private boolean isVerified = false;
    private LocalDateTime verificationStartTime;
    private LocalDateTime verificationEndTime;
    private String verificationPlanType;
}
