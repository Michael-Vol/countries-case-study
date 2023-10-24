package com.example.countriescasestudy.Guest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GuestService {
    private GuestRepository guestRepository;
}
