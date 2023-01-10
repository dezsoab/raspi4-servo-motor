# raspi4-servo-motor
Demo application to control SG92R servo motor

## notes
- To access the `GPIO pins` on the PI you need to run the jar file as `sudo`.
- Provide percentage values to set the lever (arm) of the servo to the wanted position.

## circuit
The circuit is straight forward. Servos have 3 cables,
`brown` for ground `red` (orange) for 5V DC as this servo runs on 4.8V and `yellow` for PWM signal (BCM18 in this case).
The servo IO cables are connected with 20cm male-female jumper cables to the PI.

![IMG_8744](https://user-images.githubusercontent.com/75616496/211644586-5c8f9106-edba-4ca8-b079-e1dee9427b46.jpg)
