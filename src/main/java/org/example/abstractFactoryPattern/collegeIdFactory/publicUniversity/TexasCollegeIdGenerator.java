package org.example.abstractFactoryPattern.collegeIdFactory.publicUniversity;

import org.example.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;

public class TexasCollegeIdGenerator implements CollegeIdGenerator {
    @Override
    public String generateCollegeId(String course) {
        return "TEXAS_"+course+"_"+(int)Math.floor(Math.random()*1000);
    }
}
