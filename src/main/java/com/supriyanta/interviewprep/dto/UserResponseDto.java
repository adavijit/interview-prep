package com.supriyanta.interviewprep.dto;

import com.supriyanta.interviewprep.persistence.model.AccountUser;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
    private Long id;
    private String email;

    // TODO: ignore
//    @JsonIgnore
    private boolean enabled;

    public UserResponseDto(AccountUser user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.enabled = user.isEnabled();
    }
}
