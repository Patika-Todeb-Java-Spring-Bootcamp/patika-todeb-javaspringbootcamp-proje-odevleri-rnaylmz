package com.todeb.rnaylmz.createyourbestwedding.controller;

import com.todeb.rnaylmz.createyourbestwedding.service.MessagingService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/messaging")
public class MessagingController {


    private MessagingService messagingService;
}
