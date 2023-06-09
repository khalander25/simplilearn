package org.example;

import fileMngt.client.FileManagement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Welcome to the File Management Application");

        FileManagement fileMngt = new FileManagement();

        fileMngt.showMainScreen();


    }
}