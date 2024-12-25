package org.example.controller;

import org.example.domain.Car;
import org.example.domain.Reservation;
import org.example.domain.User;
import org.example.service.CarService;
import org.example.service.ReservationService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private ReservationService reservationService;

    @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("cars", carService.getAll());
        modelAndView.setViewName("homepage");
        return modelAndView;
    }

    @GetMapping("/details")
    public String showCarDetails(@RequestParam String carMark, Model model) {
        Car car = carService.getCarByMark(carMark);
        model.addAttribute("car", car);
        model.addAttribute("carMark", carMark);

        return "details";

    }

    @GetMapping("/reserve")
    public String showReservePage(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "reserve";
    }

    @PostMapping("/submit")
    public String createReservation(@RequestParam String name, @RequestParam String surname, @RequestParam String email, @RequestParam String carMark, Model model) {
        Car car = carService.getCarByMark(carMark);
        User user = new User(name, surname, email);

        Reservation reservation = new Reservation();
        reservation.setCar(car);
        reservation.setUser(user);
        reservationService.addReservation(reservation);

        model.addAttribute("reservation", reservation);
        return "homepage";

    }
    @GetMapping("/cars/reservations")
    public ModelAndView reservation() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("reservations", reservationService.getAll());
        modelAndView.setViewName("reservations");
        return modelAndView;
    }


}
