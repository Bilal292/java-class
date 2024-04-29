package com.sg.classroster.ui;

import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO{
    private Scanner input;

    public UserIOConsoleImpl () {
        input = new Scanner(System.in);
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        this.print(prompt);
        String userString = this.input.nextLine();
        return userString;
    }

    @Override
    public int readInt(String prompt) {
        this.print(prompt);
        int userInt = Integer.parseInt(this.input.nextLine());
        return userInt;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        this.print(prompt);

        while (true) {
            int userInt = Integer.parseInt(this.input.nextLine());

            if (userInt <= max && userInt >= min) {
                return userInt;
            } else {
                this.print(prompt);
            }
        }

    }

    @Override
    public double readDouble(String prompt) {
        this.print(prompt);
        double userDouble = Double.parseDouble(this.input.nextLine());
        return userDouble;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        this.print(prompt);

        while (true) {
            double userDouble = Double.parseDouble(this.input.nextLine());

            if (userDouble <= max && userDouble >= min) {
                return userDouble;
            } else {
                this.print(prompt);
            }
        }
    }

    @Override
    public float readFloat(String prompt) {
        this.print(prompt);
        float userFloat = Float.parseFloat(this.input.nextLine());
        return userFloat;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        this.print(prompt);

        while (true) {
            float userFloat = Float.parseFloat(this.input.nextLine());

            if (userFloat <= max && userFloat >= min) {
                return userFloat;
            } else {
                this.print(prompt);
            }
        }
    }

    @Override
    public long readLong(String prompt) {
        this.print(prompt);
        long userLong = Long.parseLong(this.input.nextLine());
        return userLong;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        this.print(prompt);

        while (true) {
            long userLong = Long.parseLong(this.input.nextLine());

            if (userLong <= max && userLong >= min) {
                return userLong;
            } else {
                this.print(prompt);
            }
        }
    }

}
