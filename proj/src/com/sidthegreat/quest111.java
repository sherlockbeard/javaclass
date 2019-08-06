package com.sidthegreat;

public class quest111 {
    public static void main(String[] args){
        double one_death_time_sec = 13;
        double one_birth_time_sec = 7;
        double one_immirgrant_time_sec = 45;
        double current_pop = 312032486;
        for(int i =1;i<6;i++){
            System.out.println(current_pop+((i*365*24*60*60)/one_birth_time_sec)+((i*365*24*60*60)/one_immirgrant_time_sec)-((i*365*24*60*60)/one_death_time_sec));
        }
    }
}
