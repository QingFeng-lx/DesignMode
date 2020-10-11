package com.qingfeng.strategy.practice;

import javax.swing.*;

public class SteamedCrabs extends JLabel implements CrabCooking {
    private static final long serialVersionUID=1L;
    public void CookingMethod()
    {
        this.setIcon(new ImageIcon("src/images/img1/SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
