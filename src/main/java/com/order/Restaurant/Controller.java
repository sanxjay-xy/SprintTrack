package com.order.Restaurant;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class Controller {
    private List<Menu> menu = new ArrayList<>();
    private List<Menu> cart = new ArrayList<>();

    public Controller(){
        menu.add(new Menu("Burger", 50));
        menu.add(new Menu("Pizza", 115));
        menu.add(new Menu("Pasta", 44.9));
    }

    @GetMapping("/menu")
    public List<Menu> showMenu(){
        return menu;
    }

    @PostMapping("/order/add")
    public String addToOrder(@RequestBody Menu item){
        for(Menu m : menu){
            if(m.getName().equalsIgnoreCase(item.getName())){
                cart.add(m);
                return m.getName() + " added to your order.";
            }
        }
        return "Item not found on the menu.";
    }

    @GetMapping("/order")
    public List<Menu> viewOrder(){
        return cart;
    }
}