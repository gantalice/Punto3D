/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punto3d;

/**
 *
 * @author Ganta
 */
public class Punto3D extends Punto2D {
    double z;

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Punto3D(double z, double x, double y) {
        super(x, y);
        this.z = z;
    }

   
}
