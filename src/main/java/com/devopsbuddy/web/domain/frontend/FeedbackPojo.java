package com.devopsbuddy.web.domain.frontend;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class FeedbackPojo implements Serializable {
    private  static final long serialVersionUID = 1L;

    public String email;
    public String firstName;
    public String lastName;
    public String feedBack;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeedbackPojo{");
        sb.append("email='").append(email).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", feedBack='").append(feedBack).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
