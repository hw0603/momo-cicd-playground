package com.woowacourse.momo.domain.attendee;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AttendeeName {

    private String name;

    public AttendeeName(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name.length() > 20) {
            throw new IllegalArgumentException("이름의 길이는 20글자까지 가능합니다.");
        }
    }
}
