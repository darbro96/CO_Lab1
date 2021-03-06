package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println(System.getProperty("java.runtime.version"));
	System.out.println(System.getProperty("java.version"));
	DEV1 dev1=new DEV1();
	DEV2 dev2=new DEV2();
	System.out.println("DEV1: "+dev1.autor);
	System.out.println("DEV2: "+dev2.autor);
    }
}
