package com.datadroid.agerest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AgeController {

    @GetMapping("/age")
    public String getAgeGroup(@RequestParam int age) {
        
        // منطق عملگر سه‌تایی که یاد گرفتیم
        String group = (age < 0)  ? "Not Identified" :
                       (age < 13) ? "کودک" :
                       (age < 20) ? "نوجوان" :
                       (age < 60) ? "بزرگسال" : "سالمند";

        return group;
    }
}