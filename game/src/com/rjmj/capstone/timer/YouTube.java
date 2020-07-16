package com.rjmj.capstone.timer;

import java.io.IOException;

public class YouTube {

    public static void main(String[]args) throws IOException {
        String url_open = "https://www.youtube.com/watch?v=hyctW2abkY4";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
    }
}
