package org.academiadecodigo.loopeytunes.sqlinhas.controller;

import org.academiadecodigo.loopeytunes.sqlinhas.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ChatController {

    private List<String> messages = new LinkedList<>();

    @RequestMapping(
            method = RequestMethod.GET,
            path = {"/chat", "/chat/"}
    )
    public ResponseEntity<List<String>> getMessages() {

        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = {"/chat", "/chat/"}
    )
    public void addMessage(@RequestBody String str) {

        String[] newStr = str.split("=");

        messages.add("bruce# : " + newStr[1]);
    }
}
