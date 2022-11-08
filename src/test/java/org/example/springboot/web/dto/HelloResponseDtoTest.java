package org.example.springboot.web.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombok_test(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto responseDto = new HelloResponseDto(name,amount);

        //then
        assertThat(responseDto.getName()).isEqualTo(name);
        assertThat(responseDto.getAmount()).isEqualTo(amount);
    }
}