package com.dezsobinder;

import com.dezsobinder.motor.ServoMotor;
import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Scanner scanner = new Scanner(System.in);
    private static final int PWM_PIN = 18;

    public static void main(String[] args) {
        logger.info("-- Starting servo control application --");
        Context context = Pi4J.newAutoContext();

        ServoMotor servoMotor = new ServoMotor(context, PWM_PIN);

        while (true) {
            System.out.println("Set new percent value: ");
            int dutyCycle = Integer.parseInt(scanner.nextLine());

            if (dutyCycle == 666) {
                servoMotor.off();
                logger.info("Motor shut down");
                context.shutdown();
                logger.info("PI4J context shut down");
                break;
            }

            servoMotor.setPercent(dutyCycle);
        }
    }
}
