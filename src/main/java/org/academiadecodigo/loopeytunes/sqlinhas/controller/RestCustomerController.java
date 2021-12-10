package org.academiadecodigo.loopeytunes.sqlinhas.controller;


import org.academiadecodigo.loopeytunes.sqlinhas.dto.DtoMapper;
import org.academiadecodigo.loopeytunes.sqlinhas.dto.UserDto;
import org.academiadecodigo.loopeytunes.sqlinhas.persistence.model.User;
import org.academiadecodigo.loopeytunes.sqlinhas.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class RestCustomerController {

    private AuthService authService;
    private DtoMapper dtoMapper;

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @Autowired
    public void setDtoMapper(DtoMapper dtoMapper) {
        this.dtoMapper = dtoMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/", ""})
    public String login(Model model) {

        model.addAttribute("user", new UserDto());
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = {"/", ""})
    public String authentication(@Valid @ModelAttribute("user") UserDto userDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "login";
        }

        User user = dtoMapper.dtoToUser(userDto);

        if (authService.authenticate(user.getEmail(), user.getPassword())) {
            return "html/homepage";
        }
        redirectAttributes.addFlashAttribute("lastAction", "Email or password does not match our database\nPlease, try again");
        return "login";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/chat/global"})
    public String getChat(){
        return "html/chat";
    }

    @RequestMapping(method = RequestMethod.POST, value="/update")
    public void updateDate(){

    }

}
